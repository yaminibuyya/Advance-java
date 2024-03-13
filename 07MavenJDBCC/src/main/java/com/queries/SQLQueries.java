package com.queries;

public class SQLQueries {
	public static String insert = "insert into Employee values (?,?,?,?)";
	public static String update = "update Employee set name=?,salary=?,email=? where id=?";
	public static String delete = "delete from Employee where id=?";
	public static String select = "select * from Employee";
	static String getByname = " select * from Employee where name=?";
	public static String getByid = " select * from Employee where id=?";


}
