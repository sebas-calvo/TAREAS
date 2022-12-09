/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3_3.servicio;

import TAREA_3_3.modelo.Jugador;
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
    
}
