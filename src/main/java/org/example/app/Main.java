package org.example.app;

import org.example.model.Direccion;
import org.example.model.Persona;
import org.example.model.Empleado;
import org.example.util.Util;

public class Main {
    public static void main(String[] args) {

        Direccion d1 = new Direccion("Avenida Roberto Rojas", "123", "Puerto Montt", "Los Lagos", "Chile");
        Direccion d2 = new Direccion("Cordero Rojo", "345", "Puerto Montt", "Los Lagos", "Chile");
        Direccion d3 = new Direccion("Verde Azul", "567", "Puerto Montt", "Los Lagos", "Chile");

        Persona p1 = new Persona("Billy", "Bob", "billybob@gmail.com", "56960000001", d1);
        Persona p2 = new Persona("Emiliano", "Persnipep", "emiliano@gmail.com", "56960000002", d2);
        Persona p3 = new Persona("Big", "Bob", "bigbob@gmail.com", "56960000003", d3);

        Empleado e1 = new Empleado("Carlos", "Gonzalez", "carlos.g@salmontt.cl", "56970000001", d1,
                "12.345.678-9", "Jefe de Planta", 1500000);

        Empleado e2 = new Empleado("Lucia", "Martinez", "lucia.m@salmontt.cl", "56970000002", d2,
                "98.765.432-1", "Coordinadora Logística", 1200000);

        Empleado e3 = new Empleado("Pablo", "Ortiz", "pablo.o@salmontt.cl", "56970000003", d3,
                "11.222.333-4", "Operario", 800000);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);


        Util.saludo();
    }
}
