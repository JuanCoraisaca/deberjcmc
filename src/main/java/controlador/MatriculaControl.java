
package controlador;

import java.util.List;
import modelo.Matricula;
import servicio.MatriculaServicio;
import servicio.PropietarioServicio;

/**
 *
 * @author USER
 */
public class MatriculaControl {
    private final MatriculaServicio matriculaServicio = new MatriculaServicio();
    private final PropietarioServicio propietarioServicio = new PropietarioServicio();
    
    public Matricula crear(String [] args){
        var matricula= new Matricula(args[0],Integer.valueOf(args[3]),Integer.valueOf(args[4]));
        var propietario = this.propietarioServicio.buscarCodigo(Integer.valueOf(args[5]));
        var auto = this.
        this.matriculaServicio.crear(matricula);
        return matricula;
    }
    
    public List<Matricula> listar(){
        return this.matriculaServicio.listar();
    }

}
