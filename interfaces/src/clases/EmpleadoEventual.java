package clases;

import interfaces.Nomina;
import static interfaces.Nomina.EMPRESA;
import javax.swing.JOptionPane;

public class EmpleadoEventual implements Nomina {

    // atributos
    String nombre = null;
    String titulo = "Empleado Eventual";

    public EmpleadoEventual(String nombre) {
        this.nombre = nombre;
    }

    public void detalleEmpleado(Nomina emp) {
        if (emp instanceof EmpleadoEventual) {
            ((EmpleadoEventual) emp).identificarEmpleado();
        }
    }

    public void identificarEmpleado() {
        JOptionPane.showMessageDialog(null, "Iniciando el metodo identificaEmpleado de EmpleadoEventual");
        JOptionPane.showMessageDialog(null, "Mi nombre es " + this.nombre + " soy " + this.titulo + " de la empresa " + EMPRESA + " y no tengo salario fijo");
    }
}
