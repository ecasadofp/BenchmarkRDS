package org.example;

import javax.swing.*;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de conexiones"));

       getConexionesMultiples(cantidad);

        // getConexionesSingleton(cantidad);

        JOptionPane.showMessageDialog(null, "Creadas " + cantidad + " conexiones");
    }

    public static void  getConexionesMultiples(int cantidad){


    GestorBD miBD = new GestorBD();
    Connection[] conexiones = new Connection[cantidad];

        for(int i = 0 ; i < cantidad ; i++){

        conexiones[i] = miBD.getConexion();

    }

}
    public static void getConexionesSingleton(int cantidad){

        GestorBD miBD = GestorBD.getGestorBD();
        Connection[] conexiones = new Connection[cantidad];

        for(int i = 0 ; i < cantidad ; i++){

            conexiones[i] = miBD.getConSingleton();

        }

    }
}