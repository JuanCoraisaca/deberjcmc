/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Matricula;

/**
 *
 * @author USER
 */
public interface IMatriculaServicio {
    public Matricula crear(Matricula matricula);
    public Matricula modificar(Matricula matricula);
    public Matricula buscarCodigo(int codigo);
    public Matricula eliminar(int codigo);   
    public List<Matricula> listar();
}
