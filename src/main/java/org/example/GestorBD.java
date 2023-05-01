package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorBD {
    private static GestorBD instanciaSingleton;

    private Connection conSingleton;

    public GestorBD(){
        if(conSingleton == null)
        try {
            conSingleton= DriverManager.getConnection("jdbc:mysql://db-programacion-ej1.cbved7bhnvqz.us-east-1.rds.amazonaws.com/alumnos", "admin", "piramide");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Connection getConexion(){

        Connection con;
        try {
            con= DriverManager.getConnection("jdbc:mysql://db-programacion-ej1.cbved7bhnvqz.us-east-1.rds.amazonaws.com/alumnos", "admin", "piramide");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;

    }

    public Connection getConSingleton(){
        return conSingleton;
    }

    public static GestorBD getGestorBD(){
        if(instanciaSingleton == null)
            instanciaSingleton = new GestorBD();
        return instanciaSingleton;
    }


}
