/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3_3.controlador;

import TAREA_3_3.modelo.Jugador;
import TAREA_3_3.servicio.EquipoServiceImpl;
import TAREA_3_3.servicio.JugadorServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sebas
 */
public class JugadorControl {
    
    public JugadorServiceImpl JugadorServiceImpl=new JugadorServiceImpl();
    public EquipoServiceImpl EquipoServiceImpl=new EquipoServiceImpl();
    
    public void crear(String [] data){
        
        var codigo=Integer.valueOf(data[0]);
        var nombre=data[1];
        var posicion=data[2];
        var equipo=this.EquipoServiceImpl.buscarPorCodigo(Integer.valueOf(data[3]));;
        var year=Integer.valueOf(data[4]).intValue();
        var month=Integer.valueOf(data[5]).intValue();
        var day=Integer.valueOf(data[6]).intValue();
        var fechaDebut = LocalDate.of(year,month, day);
        
        
        var jugador=new Jugador(codigo,nombre,posicion,equipo,LocalDate.of(year, month, day));
        this.JugadorServiceImpl.crear(jugador);
    }
    
    public List<Jugador> listar(){
        return this.JugadorServiceImpl.listar();
    }
    
}
    

