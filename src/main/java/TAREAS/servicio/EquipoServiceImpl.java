/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.servicio;

import TAREAS.modelo.Equipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class EquipoServiceImpl implements EquipoService{
    
    private static List<Equipo> equipoList= new ArrayList<>();
    
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

    @Override
    public void modificar(Equipo equipo, int codigo) {
        var indice = -1;
        for (var equipos : this.equipoList) {
            indice++;
            if (codigo == equipo.getCodigo()) {
                this.equipoList.set(indice, equipo);

            }

        }
    }

    @Override
     public void eliminar(int codigo) {
        var indice = -1;
        for (var equipo : this.equipoList) {
            indice++;
            if (codigo == equipo.getCodigo() ) {
                this.equipoList.remove(indice);

            }

        }
    }

}
    

