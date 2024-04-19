
package autonoma.TrabajoFinal.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * Escribe el archivo de memoria interna
 *

 */
public interface Escritor {
    
    /**
     * Escribe el archivo de memoria interna por lineas
     * 
     * @param archivo
     * @throws java.io.IOException si el archivo no existe
     */
    public abstract void escribir(ArrayList<String> archivo) throws IOException ;
    
}
