/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.controlador;

import TAREAS.modelo.Equipo;
import TAREAS.servicio.EquipoServiceImpl;
import TAREAS.servicio.PartidoServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sebas
 */
public class EquipoControl {

    public EquipoServiceImpl EquipoServiceImpl = new EquipoServiceImpl();
    public PartidoServiceImpl PartidoServiceImpl = new PartidoServiceImpl();

    public void crear(String[] data) {

        var codigo = Integer.valueOf(data[0]);
        var nombre = data[1];
        var pais = data[2];
        var colorPrincipal = data[3];
        var colorSecundario = data[4];
        var partido = data[5];
        var year = Integer.valueOf(data[6]).intValue();
        var month = Integer.valueOf(data[7]).intValue();
        var day = Integer.valueOf(data[8]).intValue();
        var fechaFundacion = LocalDate.of(year, month, day);
        var poblacion = data[9];

        var equipo = new Equipo(codigo, nombre, pais, colorPrincipal, colorSecundario,
                 partido, LocalDate.of(year, month, day), poblacion);
        this.EquipoServiceImpl.crear(equipo);
    }

    public String modificar(String[] data) {
        var retorno = "No se puede modificar";
        var codigo = Integer.valueOf(data[0]);
        var nombre = data[1];
        var pais = data[2];
        var colorPrincipal = data[3];
        var colorSecundario = data[4];
        var partido = data[5];
        var year = Integer.valueOf(data[6]).intValue();
        var month = Integer.valueOf(data[7]).intValue();
        var day = Integer.valueOf(data[8]).intValue();
        var fechaFundacion = LocalDate.of(year, month, day);
        var poblacion = data[9];
        var modificar = Integer.valueOf(data[10]).intValue();

        var equipo = new Equipo(codigo, nombre, pais, colorPrincipal, colorSecundario,
                 partido, LocalDate.of(year, month, day), poblacion);
        this.EquipoServiceImpl.modificar(equipo, modificar);
        retorno = "Modificado";
        return retorno;
    }

    public void eliminar(String codigos) {
        var codigo = Integer.valueOf(codigos).intValue();
        this.EquipoServiceImpl.eliminar(codigo);

    }

    public List<Equipo> listar() {
        return this.EquipoServiceImpl.listar();
    }

}
