/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Propietario;

/**
 *
 * @author USER
 */
public interface IPropietarioServicio {
    public Propietario crear(Propietario propietario);
    public Propietario modificar(Propietario propietario);
    public Propietario buscarCodigo(int codigo);
    public Propietario eliminar(int codigo);   
    public List<Propietario> listar();
}
