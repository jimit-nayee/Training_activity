package com.thDemo.thDemoJPA.MovieDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.thDemo.thDemoJPA.Movie.Movie;

public class MovieDao {
	
	public boolean insertUser(Movie m)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JPAApp","root","root");
		PreparedStatement ps = con.prepareStatement("insert into movie values (?,?,?,?)");
		ps.setLong(1,m.getMid());
		ps.setString(2,m.getMname());
		ps.setString(3,m.getLanguage());
		ps.setString(4,m.getDirector());
		
		boolean b= ps.execute();
		con.close();
		return b;
	}

	
}
