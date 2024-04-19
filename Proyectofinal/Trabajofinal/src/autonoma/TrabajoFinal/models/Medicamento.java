/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TrabajoFinal.models;

/**
 *
 * @author laura
 */
public abstract class Medicamento{
    /////////////////////////////////////////////////7metodos
    private String Nombre;
    private String Descripcion;
    private double costo;
    private int anoactualizacion;
    private String codigo;
    private String PrecioVenta;
 //////////////////////////////////////////////7constructor

    public Medicamento(String Nombre, String Descripcion, double costo, int anoactualizacion, String codigo, String PrecioVenta) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.costo = costo;
        this.anoactualizacion = anoactualizacion;
        this.codigo = codigo;
        this.PrecioVenta = PrecioVenta;
    }
       public abstract double CalculaPrecioVenta();
   
}

