/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TrabajoFinal.models;

/**
 *
 * @author Ricardo
 */
public class MedicamentoGenerico  extends Medicamento{

    public MedicamentoGenerico(String Nombre, String Descripcion, double costo, int anoactualizacion, String codigo, String PrecioVenta) {
        super(Nombre, Descripcion, costo, anoactualizacion, codigo, PrecioVenta);
    }

    @Override
    public double CalculaPrecioVenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
