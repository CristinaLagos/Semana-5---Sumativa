package org.example.model;

public class Empleado extends Persona {
    private String rut;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String apellido, String email, String telefono, Direccion direccion,
                    String rut, String cargo, double salario) {
        super(nombre, apellido, email, telefono, direccion);
        this.rut = rut;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return super.toString() + " | " + rut + " | " + cargo + " | $" + salario;
    }
}
