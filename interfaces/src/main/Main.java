
package main;

import clases.Directivo;
import clases.Empleado;
import clases.EmpleadoEventual;
import clases.Gerente;

public class Main {
    public static void main(String[] args) {

        EmpleadoEventual objetoEmpleadoEventual = new EmpleadoEventual("DevBuster");
        Empleado objetoEmpleado = new Empleado("Kamado Tanjiro", 135.89f);
        Gerente objetoGerente = new Gerente("Chico Gel", 2000, "Refrigeración y Empuje");
        Directivo objetoDirectivo = new Directivo("Kibutsuji Musan", 35000);

        objetoEmpleadoEventual.detalleEmpleado(objetoEmpleadoEventual);
        objetoEmpleado.detalleEmpleado(objetoEmpleado);
        objetoGerente.detalleEmpleado(objetoGerente);
        objetoDirectivo.detalleEmpleado(objetoDirectivo);

    }
}
