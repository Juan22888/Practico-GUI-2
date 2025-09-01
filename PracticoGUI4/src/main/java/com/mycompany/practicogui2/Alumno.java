/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicogui2;

import java.util.HashSet;

/**
 *
 * @author feerl
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias=new HashSet<>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        materias.add(m);
        System.out.println(m.getNombre()+" agregada con exito!!");
    }
    
    public int cantidadMaterias(){
        int cantidad=0;
        Iterator<Materia> it = materias.iterator();

        while (it.hasNext()) {
              cantidad++;
        }
        return cantidad;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }
    
    
}