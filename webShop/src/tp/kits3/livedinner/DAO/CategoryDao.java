package tp.kits3.livedinner.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
// 
import javax.naming.InitialContext;

import javax.sql.DataSource;

import tp.kits3.livedinner.vo.Category;
// use DataSource 

public class CategoryDao {
	DataSource datasource;
	Connection conn;
	public CategoryDao() {
		try {
			
			Context ctx = new InitialContext();
			// get info of Tomcat
			Context envCtx = (Context)ctx.lookup("java:/comp/env"); //search servlet container
			// get info in context.xml
			this.datasource = (DataSource) envCtx.lookup("jdbc/mariadb");
		
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public List<Category> findAll() {
		List<Category> list =new ArrayList<Category>();
		try {
		Connection conn = this.datasource.getConnection();
		String selectAll = "select * from category";
		PreparedStatement pstmt = conn.prepareStatement(selectAll);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Category category = new Category();
			category.setCtgid(rs.getInt("ctgid"));
			category.setCtname(rs.getString("ctname"));
			category.setService(rs.getString("service"));
			list.add(category);
		}
		try {
			rs.close();
			pstmt.close();
			conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch (Exception e ) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	public void save(Category category) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = datasource.getConnection();
			String insert = "insert into category (ctname,service) "+"values(?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, category.getCtname());
			pstmt.setString(2, category.getService());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	public Category findOne(int ctgid) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Category category = null;
		try {
			conn = datasource.getConnection();
			String selectOne = "select * from category where ctgid= ?";
			pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, ctgid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				category = new Category();
				category.setCtgid(rs.getInt("ctgid"));
				category.setCtname(rs.getString("ctname"));
				category.setService(rs.getString("service"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return category;
	}
	public void update(Category category) {
		// update need where ctgid statement
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		
		try {
			conn = datasource.getConnection();
			String update = "update category set ctname=?, service=?  where ctgid= ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, category.getCtname());
			pstmt.setString(2, category.getService());
			pstmt.setInt(3, category.getCtgid());
			 pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
