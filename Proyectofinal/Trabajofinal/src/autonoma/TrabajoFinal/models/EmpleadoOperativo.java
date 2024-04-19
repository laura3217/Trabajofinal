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
public class EmpleadoOperativo extends Empleado {
    private String area;

    public EmpleadoOperativo(String nombre, int numeroDocumento, int edad, double salarioBase, String area) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.area = area;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.2;
    }
}
