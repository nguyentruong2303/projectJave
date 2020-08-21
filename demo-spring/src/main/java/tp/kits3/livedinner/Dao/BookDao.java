package tp.kits3.livedinner.Dao;



import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import tp.kits3.livedinner.vo.Book;









/*1. connection db (Mysql/mariaDB Connector.jar extends Driver implement JDBC API)
 * so important mariadb-client.jar
 * 2. ask data to DB ->  sql API as Text("select *") 
 * 3 .Statement/PreparedStatement ->send -> get data
 * ResultSet <- DB
 * 4. type is different Model and DB's type -> need converting
 * use mybatis lib
 * dont know our table name and column
 * sqlSessionfactory <- db connection info ( mybatis-config.xml)
 * sql session open -> send sql statement DB (mapper.xml)
 */
@Repository
public class BookDao {
	private static SqlSessionFactory factory = null;
	//need static method to factory field
	public static SqlSessionFactory getInstance() {
		if( factory == null ) {
			//create Factory
			try {
				//text read from file xml
				Reader resource = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
				factory = new SqlSessionFactoryBuilder().build(resource);
				resource.close();
			}catch (Exception e) {
				// if failed
				e.printStackTrace();
			}
		}
		
		return factory;
	}
	public List<Book> selectAll() {
		//connection db -> make sql ->send -> get data
		SqlSession session = getInstance().openSession(); // your choice get return factory
		return session.selectList("mappers.bookMapper.selectAll");
	}
	public Book selectOne(int id) {
		SqlSession session = getInstance().openSession();
		return session.selectOne("mappers.bookMapper.selectOne",id);
	}
	public void insert(Book param) {
		SqlSession session = getInstance().openSession();
		 session.insert("mappers.bookMapper.insert",param);
	}
	public void update(Book param) {
		SqlSession session = getInstance().openSession();
		 session.update("mappers.bookMapper.update",param);
	}
	public void delete(int id) {
		SqlSession session = getInstance().openSession();
		 session.delete("mappers.bookMapper.delete",id);
	}
	
}

