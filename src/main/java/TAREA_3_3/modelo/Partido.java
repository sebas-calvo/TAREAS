/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3_3.modelo;

import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class Partido {
    private int codigo;
    private String equipo1;
    private String equipo2;
    private LocalDate fechaPartido;

    public Partido(int codigo, String equipo1, String equipo2, LocalDate fechaPartido) {
        this.codigo = codigo;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fechaPartido = fechaPartido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    

    @Override
    public String toString() {
        return "Partido{" + "codigo=" + codigo + ", equipo1=" 
                + equipo1+ ", equipo2=" + equipo2 
                + ", fechaPartido=" + fechaPartido.toString() + '}';
    }
    
    
    
}
