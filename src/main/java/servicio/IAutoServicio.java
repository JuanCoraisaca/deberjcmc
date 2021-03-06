/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;


import java.util.List;
import modelo.Auto;

/**
 *
 * @author USER
 */
public interface IAutoServicio {
    public Auto crear(Auto auto);
    public Auto modificar(Auto auto);
    public Auto buscarCodigo(int codigo);
    public Auto eliminar(int codigo);   
    public List<Auto> listar();
}


