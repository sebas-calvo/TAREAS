/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3_3.servicio;

import TAREA_3_3.modelo.Equipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class EquipoServiceImpl implements EquipoService{
    
    private List<Equipo> equipoList= new ArrayList<>();
    
    @Override
    public void crear(Equipo equipo) {
        this.equipoList.add(equipo);
    }

    @Override
    public List<Equipo> listar() {
        return this.equipoList;
    }

    @Override
    public Equipo buscarPorCodigo(int codigo) {
        Equipo retorno=null;
        for(var equipo:this.equipoList){
            if(codigo==equipo.getCodigo()){
                retorno=equipo;
                break;
            }
        }
        return retorno;
    }
    
}
    

