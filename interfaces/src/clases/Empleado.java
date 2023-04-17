package clases;

import interfaces.Nomina;
import javax.swing.JOptionPane;

public class Empleado implements Nomina {

    String nombre = null;
    float salario = 0.0f;
    String titulo = "Empleado";
    
    public Empleado(String nombre, float salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void detalleEmpleado(Nomina emp){
        if (emp instanceof Empleado){
            ((Empleado) emp).identificarEmpleado();
        }
    }

    public void identificarEmpleado(){
        JOptionPane.showMessageDialog(null, "Iniciando metodo identificarEmpleado de Empleado");
        JOptionPane.showMessageDialog(null, "Mi nombre es " + this.nombre + " soy " + this.titulo + " de la empresa " +  EMPRESA + " y gano " + this.salario);
    }
    
}
