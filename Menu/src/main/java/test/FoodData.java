package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodData {

   public static List<FoodBean> get() throws SQLException{
	   
	   ArrayList<FoodBean> list=new ArrayList<FoodBean>();
	   
	   Connection con= ConnectDB.conn();
	   Statement st=con.createStatement();
	   ResultSet rs=st.executeQuery("SELECT * FROM start");
	   
	   while(rs.next()) {
		   int id=rs.getInt(1);
		   String name=rs.getString(2);
		   float price=rs.getFloat(3);
		   FoodBean f=new FoodBean(id, name, price);
		   list.add(f);
	   }
	return list;
   }
}
