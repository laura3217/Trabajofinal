/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TrabajoFinal.models;

import autonoma.TrabajoFinal.models.Empleado;
import java.util.Date;
import java.util.List;

/**
 * modelo que representa la nomina 
 * @author laura y andres
 * @version 1.0.0
 * @since 2024-04-19
 * see  www.google.com
 */


public class Nomina {
    
    ////////////////////////////////////////////////////////////////////////////
    // Atributos
    /**
     *  la lista empleado 
     * la fecha 
     * identificador 
     */
    private List<Empleado> empleados;
    private Date fecha;
    private int identificador;

    ////////////////////////////////////////////////////////////////////////////
    // Constructor
    /**
     * 
     * @param empleados
     * @param fecha
     * @param identificador 
     */
    public Nomina(List<Empleado> empleados, Date fecha, int identificador) {
        this.empleados = empleados;
        this.fecha = fecha;
        this.identificador = identificador;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Metodo
    /**
     * retorna el salario dependiendo tipo de empleado 
     * @return 
     */

    public double calcularTotalNomina() {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += empleado.calcularSalario();
        }
        return totalNomina;
    }
}
