/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TrabajoFinal.models;

import autonoma.TrabajoFinal.models.Empleado;

/**
 *
 * @author laura
 */
public class EmpleadoSalud extends Empleado {
    private String especialidad;
    private int horasTrabajadas;

    public EmpleadoSalud(String nombre, int numeroDocumento, int edad, double salarioBase, String especialidad, int horasTrabajadas) {
        super(nombre, salarioBase, null);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.012 * horasTrabajadas;
        
    }
}