
package controlador;

import java.util.List;
import modelo.Auto;
import servicio.AutoServicio;

/**
 *
 * @author USER
 */
public class AutoControl {
    private final AutoServicio autoServicio = new AutoServicio();
    
    public Auto crear(String [] args){
        var auto= new Auto(args[0],Integer.valueOf(args[1]),
                Integer.valueOf(args[2]),Integer.valueOf(args[3]));
        this.autoServicio.crear(auto);
        return auto;
    }
    
    public List<Auto> listar(){
        return this.autoServicio.listar();
        
        
    }
    

}
