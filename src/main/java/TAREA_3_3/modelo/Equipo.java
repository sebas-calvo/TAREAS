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
public class Equipo {
    
    private int codigo;
    private String nombre;
    private String pais;
    private String colorPrincipal;
    private String colorSecundario;
    private String partido;
    private LocalDate fechaFundacion;
    private String local;

    public Equipo(int codigo, String nombre, String pais, String colorPrincipal, String colorSecundario, String partido, LocalDate fechaFundacion, String local) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.partido = partido;
        this.fechaFundacion = fechaFundacion;
        this.local = local;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(String colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", nombre=" + nombre + ", pais=" 
                + pais + ", colorPrincipal=" + colorPrincipal + ", colorSecundario=" 
                + colorSecundario + ", partido=" + partido + ", fechaFundacion=" 
                + fechaFundacion.toString() + ", local=" + local + '}';
    }

    

    
    
    
    

    
}
