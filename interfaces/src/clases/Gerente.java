/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import static interfaces.Nomina.EMPRESA;
import javax.swing.JOptionPane;

/**
 *
 * @author E201
 */
public class Gerente extends Empleado{
    
    String departamento = null;
    String titulo = "Gerente";
    public Gerente(String nombre, float salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;     
    }

    public void identificaEmpleado() {
        JOptionPane.showMessageDialog(null, "Iniciando metodo identificaEmpleado de Gerente");
        JOptionPane.showMessageDialog(null, "Mi nombre es" + this.nombre + " soy " + this.titulo + " de la empresa " + EMPRESA + " y gano " + this.salario);
    }
    
    

}


