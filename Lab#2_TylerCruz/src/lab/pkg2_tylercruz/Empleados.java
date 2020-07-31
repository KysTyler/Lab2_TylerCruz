/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_tylercruz;

import java.awt.Color;

/**
 *
 * @author Tyler C
 */
public class Empleados {

    private String nombre;
    private String apellido;
    private String color;
    private int edad;
    private String Genero;
    private double altura;
    private int peso;
    private String Titulo;
    private String Cargo;
    
    public Empleados(){
        
    }
    public Empleados(String nombre, String apellido, String color, int edad, String Genero, double altura, int peso, String Titulo, String Cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.color = color;
        this.edad = edad;
        this.Genero = Genero;
        this.altura = altura;
        this.peso = peso;
        this.Titulo = Titulo;
        this.Cargo = Cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", apellido=" + apellido + ", color=" + color + ", edad=" + edad + ", Genero=" + Genero + ", altura=" + altura + ", peso=" + peso + ", Titulo=" + Titulo + ", Cargo=" + Cargo + '}';
    }

   

}
