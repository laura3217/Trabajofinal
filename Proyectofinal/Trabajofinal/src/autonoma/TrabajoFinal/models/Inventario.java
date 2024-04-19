/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TrabajoFinal.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author andrw
 */
public class Inventario {
    
        ////////////////////////////////////////////////////////////////////////////
    // Atributos
    private ArrayList<Empleado> empleados;

    private Escritor escritor;

    ////////////////////////////////////////////////////////////////////////////
    // Constructor
    public Inventario() {
        this.empleados = new ArrayList<>();
        escritor = new EscritorArchivoTextoPlano("empleado.txt");
    }

    ////////////////////////////////////////////////////////////////////////////
    // Métodos de acceso
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    ////////////////////////////////////////////////////////////////////////////
    // Metodos de gestión de productos o CRUD de productos
    ////////////////////////////////////////////////////////////////////////////
    public boolean agregarEmpleado(Empleado empleado) {
        if (this.empleados.add(empleado)) {
            this.actualizarArchivo(this.convertirEmpleados());
            return true;
        } else {
            return false;
        }

    }

    ////////////////////////////////////////////////////////////////////////////
    public Empleado buscarEmpleado(Empleado empleado) {

        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado p = this.empleados.get(i);
            if (p.equals(empleado)) {
                return p;
            }
        }
        return null;
    }

    public Empleado buscarEmpleado(int numeroDocumento) {

        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado p = this.empleados.get(i);
            if (p.getnumeroDocumento() == numeroDocumento) {
                return p;
            }
        }
        return null;
    }

    public Empleado buscarEmpleado(String nombre) {

        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado p = this.empleados.get(i);
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    private int buscarIndiceProducto(long id) {
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado p = this.empleados.get(i);
            if (p.getnumeroDocumento() == id) {
                return i;
            }
        }
        return -1;
    }

    ////////////////////////////////////////////////////////////////////////////
    public Empleado actualizarEmpleado(int numeroDocumento, Empleado empleado) {
        int index = this.buscarIndiceProducto(numeroDocumento);
        if (index >= 0) {
            if (this.empleados.set(index,empleado) != null ){
                this.actualizarArchivo(this.convertirEmpleados());
                return empleado;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public Empleado eliminarEmpleado(int numeroDocumento) {

        int index = this.buscarIndiceProducto(numeroDocumento);
        if (index >= 0) {
                Empleado p = this.empleados.remove(index);
                if(p != null){
                     this.actualizarArchivo(this.convertirEmpleados());
                     return p;
                }else{
                    return p;
                }
           
        } else {
            return null;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public String mostrarInventario() {
        String inventario = "";
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado p = this.empleados.get(i);
            inventario += p.toString() + "\n";
        }
        return inventario;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void cargarProductos(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /////////////////////////////////////////////////////////////////////////////
    public ArrayList<String> convertirEmpleados() {
        ArrayList<String> productosStr = new ArrayList<>();

        for (Empleado empleado : this.empleados) {
            String p = empleado.getNombre() + ";" + empleado.getsalarioBase();
            productosStr.add(p);

        }
        return productosStr;

    }

    /////////////////////////////////////////////////////////////////////////////////////
    public void actualizarArchivo(ArrayList<String> empleados) {
        try {
            this.escritor.escribir(empleados);
        } catch (IOException ex) {
            System.out.println("No se pudo actualizar el archivo");
        }
    }





}
    

