package com.jmendezv.kotlin4jp.seccion_01.leccion_02.java;

public class Estudiante implements Cloneable {

    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Estudiante)
            return ((Estudiante) obj).nombre.equals(nombre);
        else
            return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Estudiante(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante("juan");
        System.out.println(e);
        System.out.println(e.hashCode());
    }
}
