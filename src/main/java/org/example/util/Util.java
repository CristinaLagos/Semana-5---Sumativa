package org.example.util;

import org.example.model.Direccion;
import org.example.model.Persona;
import org.example.model.Empleado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Util {

    public static void saludo() {
        System.out.println("Hola, Bienvenidos a nuestro sistema");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static boolean validarEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public static ArrayList<Persona> cargarPersonas(String rutaArchivo) {
        ArrayList<Persona> personas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Direccion dir = new Direccion(datos[4], datos[5], datos[6], datos[7], datos[8]);
                Persona p = new Persona(datos[0], datos[1], datos[2], datos[3], dir);
                personas.add(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;
    }

    public static ArrayList<Empleado> cargarEmpleados(String rutaArchivo) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Direccion dir = new Direccion(datos[4], datos[5], datos[6], datos[7], datos[8]);
                Empleado e = new Empleado(datos[0], datos[1], datos[2], datos[3], dir,
                        datos[9], datos[10], Double.parseDouble(datos[11]));
                empleados.add(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
