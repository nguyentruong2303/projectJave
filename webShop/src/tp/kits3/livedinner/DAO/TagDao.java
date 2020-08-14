package tp.kits3.livedinner.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;import java.sql.SQLClientInfoException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import tp.kits3.livedinner.vo.Tag;

public class TagDao {
	private DataSource ds;
	public TagDao() {
		try {
			Context ctx = new InitialContext();
			Context envCtx = (Context)ctx.lookup("java:comp/env");
			this.ds = (DataSource)envCtx.lookup("jdbc/mariadb");
		} catch (Exception e) {
		}
	}
	 //if you make constructor with parameter
	 // cannot use default constructor
	

	public List<Tag> findAll() {
		//connection here
		//connectDB();
		//CRUD here
		//request to DB
			//Statement -> PreparedStatement
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql_selectAll = "select * from tag";
		List<Tag> list = null;
		try {
			conn = this.ds.getConnection();
			pstmt = conn.prepareStatement(sql_selectAll);
			 rs = pstmt.executeQuery();
			 list = new ArrayList<Tag>();
			 while(rs.next()) {
				 Tag tag = new Tag();
				 tag.setTagid(rs.getInt("tagid"));
				 tag.setTgname(rs.getString("tgname"));
				 list.add(tag);
			 }
		} catch (Exception e) {
			e.printStackTrace(); // show message about SQL error
		} finally {
			try {rs.close();} catch (Exception e) {}
			try {pstmt.close();} catch (Exception e) {}
			try {conn.close();} catch (Exception e) {}
		}
		//return to Servlet
		return list;
	}
	//connection here
	//CRUD here
	//request to DB
	//return to Servlet
	public void save(Tag tag) {
		//connection here
				
				//CRUD here
				//request to DB
					//Statement -> PreparedStatement
				Connection conn = null;
				PreparedStatement pstmt = null;
				//ResultSet rs = null;
				try {
					conn = this.ds.getConnection();
				String sql_insert = "insert into tag(tgname)" + " values(?)";
				pstmt = conn.prepareStatement(sql_insert);
					pstmt.setString(1,tag.getTgname());
					pstmt.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace(); // show message about SQL error
				} finally {
					//try {rs.close();} catch (Exception e) {}
					try {pstmt.close();} catch (Exception e) {}
					try {conn.close();} catch (Exception e) {}
				}
				//return to Servlet
			
		
	}
	

public void update(Tag tag) {
	if(tag.getTgname() == null || tag.getTagid() <= 0) {
		save(tag);
		return;
	}
	//connection here
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				conn = this.ds.getConnection();
				String sql_update = "update  tag set tgname = "+"where tagid =";
				pstmt = conn.prepareStatement(sql_update);
				pstmt.setString(1, tag.getTgname());
				pstmt.setInt(2, tag.getTagid());
				pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace(); // show message about SQL error
			} finally {
				try {rs.close();} catch (Exception e) {}
				try {pstmt.close();} catch (Exception e) {}
				try {conn.close();} catch (Exception e) {}
			}
			//return to Servlet
		
	
}

}
