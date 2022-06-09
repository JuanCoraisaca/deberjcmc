
package modelo;

/**
 *
 * @author USER
 */
public class Propietario {
    private String nombre;
    private int edad;
    private int codigo;
    private String direccion;
    private int celular;

    public Propietario(String nombre, int edad, int codigo, String direccion, int celular) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
        this.direccion = direccion;
        this.celular = celular;
    }
    public Propietario(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + codigo + ", direccion=" + direccion + ", celular=" + celular + '}';
    }
    
    

}
