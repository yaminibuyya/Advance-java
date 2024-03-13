 package com.DAOLayers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.SQLQueries.SQLQueries;
import com.connections.MyConnection;
import com.modelClass.Employee;


public class EmployeeDaoimpl implements EmployeeDAO {
	static Connection con=null;
    static PreparedStatement ps;
	static ResultSet rs;
   
	@Override
	public void save(Employee employee) {
		con=MyConnection.getConnect();
		try {
			ps=con.prepareStatement(SQLQueries.insert);
			ps.setInt(1, employee.getId());
			ps.setString(2,employee.getName());
			ps.setDouble(3,employee.getSalary());
			ps.setString(4,employee.getEmail());
			int result = ps.executeUpdate();
			System.out.println("the given data inserted");
			System.out.println("Inserted rows: "+result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void update(Employee employee) {
		con=MyConnection.getConnect();
		try {
			ps=con.prepareStatement(SQLQueries.update);
			ps.setInt(4, employee.getId());
			ps.setString(1,employee.getName());
			ps.setDouble(2,employee.getSalary());
			ps.setString(3,employee.getEmail());
			int result=ps.executeUpdate();
			System.out.println("updated data: "+result);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public List<Employee> getemployees() {
		try {
            con = MyConnection.getConnect();
            List<Employee> list = new ArrayList<>();
            ps = con.prepareStatement(SQLQueries.select);

            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt(1));
                employee.setName(rs.getString(2));
                employee.setSalary(rs.getDouble(3));
                employee.setEmail(rs.getString(4));
                list.add(employee);
            }
            return list;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		return null;
	}

	@Override
	public void delete(int id) {
		con=MyConnection.getConnect();
		try {
			ps=con.prepareStatement(SQLQueries.delete);
			ps.setInt(1, id);
			int result=ps.executeUpdate();
			System.out.println("delete the row: "+result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Employee getByid(int id) {
		con=MyConnection.getConnect();
		try {
			Employee employee=new Employee();
			ps=con.prepareStatement(SQLQueries.getByid);
			ps.setInt(1,id);
			rs=ps.executeQuery();
		
			while(rs.next()) {
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				employee.setEmail(rs.getString(4));
				
			}
			return employee;
		} catch (SQLException e) {
			System.out.println(e.getMessage()+" " +e.getSQLState());
		}
		return null;
	}
	
	private static List<Employee>employees=new ArrayList<Employee>();
	static {
		employees.add(new Employee(1,"sahasra",300000.00,"sahasra97@gmail.com"));
		employees.add(new Employee(2,"afreen",760000.00,"AfreenFathima88@gmail.com"));
		employees.add(new Employee(3,"sai",900000.00,"sai560@gmail.com"));
		employees.add(new Employee(4,"Raji",200000.00,"RAjii677889@gmail.com"));
		
	}


}
