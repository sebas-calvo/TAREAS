/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAREA_3_3.servicio;

import TAREA_3_3.modelo.Equipo;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface EquipoService {
    
    public void crear(Equipo equipo);
    public List<Equipo> listar();
    public Equipo buscarPorCodigo(int codigo);
    
}
