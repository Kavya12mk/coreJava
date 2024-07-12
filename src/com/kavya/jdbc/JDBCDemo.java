package com.kavya.jdbc;


//Java program to implement a simple JDBC application


import java.sql.*;

    public class JDBCDemo {

        public static void main(String args[])
                throws SQLException, ClassNotFoundException
        {

            //Load the driver class
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/employees","root","Admin@123");

            //   String query = "insert into employee values(110, 'dummy','abc','India')";

            String query = "select * from employee";

            // Obtain a statement
            Statement st = con.createStatement();

            // Execute the query
            //  int count = st.executeUpdate(query);

            ResultSet resultSet = st.executeQuery(query);


            while (resultSet.next()) {
                // Process each row
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String position = resultSet.getString("position");

                System.out.println(id+" "+name+" "+age+" "+position);
                // Process retrieved data
            }

//        System.out.println(
//                "number of rows affected by this query= "
//                        + count);

            // Closing the connection as per the
            // requirement with connection is completed
            con.close();
        }
    } // class

