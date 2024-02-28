package com.l4yn3.microserviceseclab;

import java.sql.*;

public class testJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/micro_service_seclab?connectTimeout=5000";
        String user = "root";
        String password = "123456";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("连接成功！");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("show tables;");
            System.out.println(resultSet);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("连接失败！");
            e.printStackTrace();
        }
    }
}
