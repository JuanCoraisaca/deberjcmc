
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Propietario;

/**
 *
 * @author USER
 */
public class PropietarioServicio implements IPropietarioServicio {
    
    private static List<Propietario> propietarioList = new ArrayList<>();

    @Override
    public Propietario crear(Propietario propietario) {
        this.propietarioList.add(propietario);
        return propietario;
  
    }

    @Override
    public Propietario modificar(Propietario propietario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Propietario buscarCodigo(int i) {
        var propietario = new Propietario();
        for(Propietario prop:this.propietarioList){
            if(prop.getCodigo()==i){
                propietario=prop;
                break;
            }
        }
        return propietario;

    }

    @Override
    public Propietario eliminar(int codigo) {
        var propietario = this.buscarCodigo(codigo);
        this.propietarioList.remove(propietario);
        return propietario;

    }

    @Override
    public List<Propietario> listar() {
        return this.propietarioList;

    }
   
}
