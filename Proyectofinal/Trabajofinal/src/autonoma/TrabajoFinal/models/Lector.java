
package autonoma.TrabajoFinal.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * Lee el archivo
 *
 
 */
public interface Lector {
    
    //////////////////////////////////////////////////////////////////////////
    /**
     * Lee el archivo
     * 
     * @param localizacionArchivo
     * @return
     * @throws IOException 
     */
     public abstract ArrayList<String> leer(String localizacionArchivo)
                                                    throws IOException;
     
     //////////////////////////////////////////////////////////////////////////
    
}
