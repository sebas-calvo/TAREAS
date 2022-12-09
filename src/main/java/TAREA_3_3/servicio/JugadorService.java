/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAREA_3_3.servicio;

import TAREA_3_3.modelo.Jugador;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface JugadorService {
    
    public void crear(Jugador jugador);
    public List<Jugador> listar();
    public Jugador buscarPorCodigo(int codigo);
    
}
