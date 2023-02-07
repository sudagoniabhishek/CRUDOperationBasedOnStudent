package com.palle;

import java.sql.*;
import java.util.ArrayList;


public class Student {
	private static Connection con=null;
	 private static Statement s=null;
	 private static PreparedStatement ps=null;
	 
	public static void creating(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palle", "root", "abhi");
            s=con.createStatement();
            String qry="create table Student(sno int primary key auto_increment,sname varchar(40),sub varchar(40),email varchar(40))";
            s.executeUpdate(qry);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(s!=null) {
				s.close();
				}
				if(con!=null) {
					con.close();
					}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	public static void inserting(String name,String esub,String mail) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palle", "root", "abhi");
            
            String qry="insert into Student(sname,sub,email) values(?,?,?)";
            ps=con.prepareStatement(qry);
            ps.setString(1,name );
            ps.setString(2, esub);
            ps.setString(3, mail);
            
            ps.executeUpdate();
           
            
            
            
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(s!=null) {
				s.close();
				}
				if(con!=null) {
					con.close();
					}
				if(ps!=null) {
					ps.close();
					}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}

	}
	public static void update(int no,String mail,String esub) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palle", "root", "abhi");
            
            String qry="update student set email=?,sub=? where sno=?";
            ps=con.prepareStatement(qry);
            ps.setString(1,mail );
            ps.setString(2, esub);
            ps.setInt(3, no);
            
            ps.executeUpdate();
           
            
            
            
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(s!=null) {
				s.close();
				}
				if(con!=null) {
					con.close();
					}
				if(ps!=null) {
					ps.close();
					}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}

	}
	
	public static void  delete(int no) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palle", "root", "abhi");
            
            String qry="delete from student  where sno=?";
            ps=con.prepareStatement(qry);
            
          
            ps.setInt(1, no);
            
            ps.executeUpdate();
           
            
            
            
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(s!=null) {
				s.close();
				}
				if(con!=null) {
					con.close();
					}
				if(ps!=null) {
					ps.close();
					}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		
	
		}
	}
	 
	public static  ArrayList<Details> reading() {
		ArrayList<Details> x=new ArrayList<Details>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/palle", "root", "abhi");
            
            String qry="select * from student";
            ps=con.prepareStatement(qry);
             ResultSet rs=ps.executeQuery();
             
            while(rs.next()) {
            	int no=rs.getInt("sno");
            	String name=rs.getString("sname");
            	String sub=rs.getString("sub");
            	String mail=rs.getString("email");
            	Details ds=new Details(no, name, sub, mail);
            	x.add(ds);
            	
            	
            }        
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(s!=null) {
				s.close();
				}
				if(con!=null) {
					con.close();
					}
				if(ps!=null) {
					ps.close();
					}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		
	
		}
		return x;
		
	}
	
}
