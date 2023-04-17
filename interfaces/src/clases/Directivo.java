package clases;


import static interfaces.Nomina.EMPRESA;
import javax.swing.JOptionPane;

public class Directivo extends Empleado {
    
    String titulo = "Directivo";

    public Directivo(String nombre, float salario) {
        super(nombre, salario);
    }

    public void identificarEmpleado() {
        JOptionPane.showMessageDialog(null, "Iniciando el metodo identificaEmpleado de Directivo");
        JOptionPane.showMessageDialog(null, "Mi nombre es " + this.nombre + " soy " + this.titulo + " de la empresa " + EMPRESA + " y gano " + this.salario);
    }
         
}
