
package modelo;

/**
 *
 * @author USER
 */
public class Matricula {
    private String provincia;
    private Auto auto;
    private int codigo;
    private int yearMatricula;
    private Propietario propietario;

    public Matricula(String provincia, Auto auto, int codigo, int yearMatricula, Propietario propietario) {
        this.provincia = provincia;
        this.auto = auto;
        this.codigo = codigo;
        this.yearMatricula = yearMatricula;
        this.propietario = propietario;
    }
    public Matricula(){
        
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getYearMatricula() {
        return yearMatricula;
    }

    public void setYearMatricula(int yearMatricula) {
        this.yearMatricula = yearMatricula;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Matricula{" + "provincia=" + provincia + ", auto=" + auto + ", codigo=" + codigo + ", yearMatricula=" + yearMatricula + ", propietario=" + propietario + '}';
    }

   

}
