package tp.kits3.livedinner.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import tp.kits3.livedinner.vo.Contact;

public class ContactDao {
	Connection conn;
	DataSource datasource;
	public ContactDao() {
		try {
			Context ctx = new InitialContext();
			Context envCtx = (Context) ctx.lookup("java:/comp/env");
			this.datasource = (DataSource) envCtx.lookup("jdbc/mariadb");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public List<Contact> findAll() {
		List<Contact> list = new ArrayList<Contact>();
		try {
			Connection conn = this.datasource.getConnection();
			String sql_findAll = "select * from contact";
			PreparedStatement pstmt = conn.prepareStatement(sql_findAll);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Contact contact = new Contact();
				contact.setCoid(rs.getInt("coid"));
				contact.setConame(rs.getString("coname"));
				contact.setPriphone(rs.getString("priphone"));
				contact.setSubphone(rs.getString("subphone"));
				contact.setEmail(rs.getString("email"));
				contact.setAddress(rs.getString("address"));
				contact.setUnused(rs.getBoolean("unused"));
				contact.setOpening(rs.getString("opening"));
				contact.setWeekday(rs.getString("weekday"));
				contact.setWeekend(rs.getString("weekend"));
				contact.setAboutus(rs.getString("aboutus"));
				contact.setLatitude(rs.getDouble("latitude"));
				contact.setLogitude(rs.getDouble("logitude"));
				list.add(contact);
			}
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	public void save(Contact contact) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = this.datasource.getConnection();
			String insert = "insert into contact(coname,priphone,subphone,email,address,unused,opening,weekday,weekend,aboutus,latitude,logitude)"
					+ "value(?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, contact.getConame());
			pstmt.setString(2, contact.getPriphone());
			pstmt.setString(3, contact.getSubphone());
			pstmt.setString(4,	contact.getEmail());
			pstmt.setString(5, contact.getAddress());
			pstmt.setBoolean(6, contact.getUnused());
			pstmt.setString(7, contact.getOpening());
			pstmt.setString(8, contact.getWeekday());
			pstmt.setString(9, contact.getWeekend());
			pstmt.setString(10, contact.getAboutus());
			pstmt.setDouble(11, contact.getLatitude());
			pstmt.setDouble(12, contact.getLogitude());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	public void update(Contact contact) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = this.datasource.getConnection();
			String sql_update = "update contact set coname=?, priphone=?,subphone=?, email=?, address=?,unused=?, opening=?, weekday=?, weekend=?, aboutus=?, latitude=?, logitude=? where coid=?";
			pstmt = conn.prepareStatement(sql_update);
			pstmt.setString(1, contact.getConame());
			pstmt.setString(2, contact.getPriphone());
			pstmt.setString(3, contact.getSubphone());
			pstmt.setString(4, contact.getEmail());
			pstmt.setString(5, contact.getAddress());
			pstmt.setBoolean(6, contact.getUnused());
			pstmt.setString(7, contact.getOpening());
			pstmt.setString(8, contact.getWeekday());
			pstmt.setString(9, contact.getWeekend());
			pstmt.setString(10, contact.getAboutus());
			pstmt.setDouble(11, contact.getLatitude());
			pstmt.setDouble(12, contact.getLogitude());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	
	public Contact findOne(int coid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Contact contact = null;
		try {
			conn = this.datasource.getConnection();
			String selectOne = "select * from contact where coid=?";
			pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, coid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				 contact = new Contact();
				contact.setConame(rs.getString("coname"));
				contact.setPriphone(rs.getString("priphone"));
				contact.setSubphone(rs.getString("subphone"));
				contact.setEmail(rs.getString("email"));
				contact.setAddress(rs.getString("address"));
				contact.setUnused(rs.getBoolean("unused"));
				contact.setOpening(rs.getString("opening"));
				contact.setWeekday(rs.getString("weekday"));
				contact.setWeekend(rs.getString("weekend"));
				contact.setAboutus(rs.getString("aboutus"));
				contact.setLatitude(rs.getDouble("latitude"));
				contact.setLogitude(rs.getDouble("logitude"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				pstmt.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return contact;
	}
	

}
