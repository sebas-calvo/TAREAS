/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3_3.servicio;

import TAREA_3_3.modelo.Partido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PartidoServiceImpl implements PartidoService{
    
    private List<Partido> partidoList= new ArrayList<>();
    
    @Override
    public void crear(Partido partido) {
        this.partidoList.add(partido);
    }

    @Override
    public List<Partido> listar() {
        return this.partidoList;
    }

    @Override
    public Partido buscarPorCodigo(int codigo) {
        Partido retorno=null;
        for(var partido:this.partidoList){
            if(codigo==partido.getCodigo()){
                retorno=partido;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void modificar(Partido partido, int codigo) {
        var indice = -1;
        for (var partidos : this.partidoList) {
            indice++;
            if (codigo == partido.getCodigo()) {
                this.partidoList.set(indice, partido);

            }

        }
    }

    @Override
     public void eliminar(int codigo) {
        var indice = -1;
        for (var partido : this.partidoList) {
            indice++;
            if (codigo == partido.getCodigo()) {
                this.partidoList.remove(indice);

            }

        }
    }

}
