/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.servicio;

import TAREAS.modelo.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class JugadorServiceImpl implements JugadorService{
    
    private List<Jugador> jugadorList= new ArrayList<>();
    
    @Override
    public void crear(Jugador jugador) {
        this.jugadorList.add(jugador);
    }

    @Override
    public List<Jugador> listar() {
        return this.jugadorList;
    }

    @Override
    public Jugador buscarPorCodigo(int codigo) {
        Jugador retorno=null;
        for(var jugador:this.jugadorList){
            if(codigo==jugador.getCodigo()){
                retorno=jugador;
                break;
            }
        }
        return retorno;
    }

     @Override
    public void modificar(Jugador jugador, int codigo) {
        var indice = -1;
        for (var jugadores : this.jugadorList) {
            indice++;
            if (codigo == jugador.getCodigo()) {
                this.jugadorList.set(indice, jugador);

            }

        }
    }

    @Override
     public void eliminar(int codigo) {
        var indice = -1;
        for (var jugador : this.jugadorList) {
            indice++;
            if (codigo == jugador.getCodigo()) {
                this.jugadorList.remove(indice);

            }

        }
    }

}
    
    
    

