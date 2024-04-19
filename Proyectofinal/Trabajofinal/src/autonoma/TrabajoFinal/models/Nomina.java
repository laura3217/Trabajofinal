/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TrabajoFinal.models;

import autonoma.TrabajoFinal.models.Empleado;
import java.util.Date;
import java.util.List;

/**
 *
 * @author laura
 */
public class Nomina {
    private List<Empleado> empleados;
    private Date fecha;
    private int identificador;

    public Nomina(List<Empleado> empleados, Date fecha, int identificador) {
        this.empleados = empleados;
        this.fecha = fecha;
        this.identificador = identificador;
    }

    public double calcularTotalNomina() {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += empleado.calcularSalario();
        }
        return totalNomina;
    }
}
