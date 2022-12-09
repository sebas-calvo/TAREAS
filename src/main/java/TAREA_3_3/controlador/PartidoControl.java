/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3_3.controlador;

import TAREA_3_3.modelo.Partido;
import TAREA_3_3.servicio.EquipoServiceImpl;
import TAREA_3_3.servicio.PartidoServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PartidoControl {
    
    public PartidoServiceImpl PartidoServiceImpl=new PartidoServiceImpl();
    public EquipoServiceImpl EquipoServiceImpl=new EquipoServiceImpl();
    
    public void crear(String [] data){
        
        var codigo=Integer.valueOf(data[0]).intValue();
        var equipo1=this.EquipoServiceImpl.buscarPorCodigo(Integer.valueOf(data[1]));
        var equipo2=this.EquipoServiceImpl.buscarPorCodigo(Integer.valueOf(data[2]));
        var year=Integer.valueOf(data[4]).intValue();
        var month=Integer.valueOf(data[5]).intValue();
        var day=Integer.valueOf(data[6]).intValue();
        var fechaPartido = LocalDate.of(year,month, day);
        
        
        var partido=new Partido(codigo,equipo1,equipo2,LocalDate.of(year, month, day));
        this.PartidoServiceImpl.crear(partido);
    }
    
    public List<Partido> listar(){
        return this.PartidoServiceImpl.listar();
    }
    
}
