/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAREA_3_3.servicio;

import TAREA_3_3.modelo.Partido;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface PartidoService {
    
    public void crear(Partido partido);
    public List<Partido> listar();
    public void modificar(Partido partido, int codigo);
    public void eliminar(int codigo);
    
    public Partido buscarPorCodigo(int codigo);
    
}
