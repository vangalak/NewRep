package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static List<MainCBean> get() throws SQLException{
		List<MainCBean> list=new ArrayList<MainCBean>();
		Connection conn=ConnectDB.conn();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("SELECT *FROM main");
		
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			float p=rs.getFloat(3);
			
			MainCBean m=new MainCBean(id, name, p);
			list.add(m);
		}
		
		return list;
	}
}
