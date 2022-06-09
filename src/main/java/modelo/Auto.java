
package modelo;

/**
 *
 * @author USER
 */
public class Auto {
    private String placa;
    private int codigo;
    private int year;
    private double precio;

    public Auto(String placa, int codigo, int year, double precio) {
        this.placa = placa;
        this.codigo = codigo;
        this.year = year;
        this.precio = precio;
    }
    public Auto(){
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", codigo=" + codigo + ", year=" + year + ", precio=" + precio + '}';
    }

   
    
}
