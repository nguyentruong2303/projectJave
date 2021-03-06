package tp.kits3.livedinner.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import tp.kits3.livedinner.vo.Menu;

public class MenuDao {
	private DataSource ds;
	public MenuDao () {
try {
			
			Context ctx = new InitialContext();
			// get info of Tomcat
			Context envCtx = (Context)ctx.lookup("java:/comp/env"); //search servlet container
			// get info in context.xml
			this.ds = (DataSource) envCtx.lookup("jdbc/mariadb");
		
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public List<Menu> findAll() {
		// TODO Auto-generated method stub
		List<Menu> list = new ArrayList<Menu>();
		try {
			Connection conn = this.ds.getConnection();
			String sql_selectAll = "select * from menu";
			PreparedStatement pstmt = conn.prepareStatement(sql_selectAll);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Menu menu = new Menu();
				menu.setMuid(rs.getInt("muid"));
				menu.setCtgid(rs.getInt("ctgid"));
				menu.setMuname(rs.getString("muname"));
				menu.setIntro(rs.getString("intro"));
				menu.setDetails(rs.getString("detaills"));
				menu.setPrice(rs.getDouble("price"));
				menu.setCurrency(rs.getString("currency"));

				list.add(menu);
			}
			try {
				rs.close();
				pstmt.close();
				conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}



}
