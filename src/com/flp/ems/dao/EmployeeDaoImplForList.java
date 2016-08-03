package com.flp.ems.dao;

import java.lang.invoke.SwitchPoint;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.flp.ems.domain.Employee;
import com.mysql.jdbc.Statement;

public class EmployeeDaoImplForList implements IemployeeDao {
	
	Connection db;
	public EmployeeDaoImplForList() throws ClassNotFoundException, SQLException {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		
		Class.forName(driver);    
		Connection db=DriverManager.getConnection(url);  
		
		System.out.println("Got connection");
		
	}
	public void AddEmployee(Employee e){
		
		String query="insert into employee values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement stmt=db.prepareStatement(query);
			stmt.setString(1,e.getName());
			stmt.setString(2,e.getEmail_id());
			stmt.setString(3,e.getPhone_no());
			stmt.setString(4,e.getDate_of_birth());
			stmt.setString(5,e.getDate_of_Joining());
			stmt.setString(6,e.getAddress());
			stmt.setInt(7,e.getDepartment_id());
			stmt.setInt(8,e.getProject_id());
			stmt.setInt(9,e.getRole_id());
			stmt.setString(10,e.getKin_id());
			stmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Employee added");
		
	}
	public void ModifyEmployee(Employee e){
		 
		/*PreparedStatement stmt=db.prepareStatement("query");
		
		if(e.getName()!=null)
		{
			.setName(e.getName());
		}
		else if(e.getEmail_id()!=null)
		{
			temp.setEmail_id(e.getEmail_id());
		}
		else if(e.getPhone_no()!=null)
		{
			temp.setPhone_no(e.getPhone_no());
		}
		else if(e.getDate_of_birth()!=null)
		{
			temp.setDate_of_birth(e.getDate_of_birth());
		}
		else if(e.getDate_of_Joining()!=null)
		{
			temp.setDate_of_Joining(e.getDate_of_Joining());
		}
		else if(e.getAddress()!=null)
		{
			temp.setAddress(e.getAddress());
		}
		else if(e.getDepartment_id()!=0)
		{
			temp.setDepartment_id(e.getDepartment_id());
		}
		if(i!=-1)
		{
			arrlist.remove(i);
			arrlist.add(temp);
		}*/
		
	}	
		
	public void RemoveEmployee(String Kin_id){
	/*	
		String query="delete from employee where kin_id=?";
		
		try {
			PreparedStatement stmt=db.prepareStatement("query");
			stmt.setString(1,Kin_id);
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
	}
		
	public void SearchEmployee(String search)
	{
		/*
		String query="select * from employee where kin_id=? ";
		try {
			PreparedStatement stmt=db.prepareStatement("query");
			stmt.setString(1,search);
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
		

	public void getAllEmployee()
	{
		/*String query="select * from employee";
		try {
			PreparedStatement stmt=db.prepareStatement("query");
			ResultSet set=stmt.executeQuery();
			 while (set.next()) {
		       System.out.println("Name"+set.getString(1)+"Emailid"+set.getInt(2)+"Phoneno"+set.getString(3));
		       System.out.println("Dob"+set.getString);
		            
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		}
		
}

	
	
