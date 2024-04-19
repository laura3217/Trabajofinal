/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TrabajoFinal.models;

import autonoma.TrabajoFinal.models.Empleado;
import autonoma.TrabajoFinal.views.InventarioPaciente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author laura
 */
public class Hospital {

    private String nombre;

        /**
         * direccion hospital
         */
    private String direccion;
    private String telefono;
    private String logo;
    private double presupuesto;
    private double metaVentasAnual;
    private String fechaFundacion;
    private String estado;
    private double latitud;
    private double longitud;
    private double presupuestoGlobal;
    private List<Empleado> empleados;
    private Lector lector;

    public Hospital(String nombre, String direccion, String telefono, String logo, double presupuesto, double metaVentasAnual, String fechaFundacion, String estado, double latitud, double longitud, double presupuestoGlobal) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.latitud = latitud;
        this.longitud = longitud;
        this.presupuestoGlobal = presupuestoGlobal;
        this.empleados = new ArrayList<>();
        this.lector = new LectorArchivoTextoPlano();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getPresupuestoGlobal() {
        return presupuestoGlobal;
    }

    public void setPresupuestoGlobal(double presupuestoGlobal) {
        this.presupuestoGlobal = presupuestoGlobal;
    }

    public Hospital(double presupuestoGlobal) {
        this.presupuestoGlobal = presupuestoGlobal;
    }

    public void generarNomina(List<Empleado> empleados, Date fecha, int identificador) {
        Nomina nomina = new Nomina(empleados, fecha, identificador);
        double totalNomina = nomina.calcularTotalNomina();
        presupuestoGlobal -= totalNomina;
        if (presupuestoGlobal < 0) {
            System.out.println("El hospital está en quiebra. Por favor registre un patrocinio.");
        }
    }

    public void registrarPatrocinio(double monto) {
        if (presupuestoGlobal < 0) {
            if (monto > Math.abs(presupuestoGlobal)) {
                System.out.println("Se ha registrado un patrocinio y el hospital ha sido rescatado.");
                presupuestoGlobal += monto;
            } else {
                System.out.println("El monto del patrocinio no es suficiente para rescatar el hospital.");
            }
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados del hospital " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

    }

}
