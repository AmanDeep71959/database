package com.flp.ems.service;
import java.sql.SQLException;
import java.util.HashMap;
public interface IEmployeeService {

	public boolean AddEmployee(HashMap<Integer,Object> hmap) throws ClassNotFoundException, SQLException;
	public void ModifyEmployee(HashMap<Integer, Object> hmap) throws ClassNotFoundException, SQLException;
	public void RemoveEmployee(String s) throws ClassNotFoundException, SQLException;
	public void SearchEmployee(String s) throws ClassNotFoundException, SQLException;
	public void getAllEmployee() throws ClassNotFoundException, SQLException;
	
	
}






















