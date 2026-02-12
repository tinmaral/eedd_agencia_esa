/**
 * 
 */
package org.lapaloma.eedd.esa;

import org.lapaloma.eedd.esa.dao.ICuerpoCelesteDAO;
import org.lapaloma.eedd.esa.dao.array.CuerpoCelesteDaoArray;
import org.lapaloma.eedd.esa.vo.CuerpoCeleste;

/**
 * Clase principal que permite trabajar con entidades de la Agencia ESA (Agencia Europea del Espacio).
 * 
 * @author Isidoro Nevares Martín
 * @date 29 enero 2026
 */

public class AppPrincipalAgenciaESA {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ICuerpoCelesteDAO interfazAlumno= null;
        int idCuerpo= 2;  // Se usará para buscar el cuerpo Celeste que tiene como identificador 2
        System.out.println("Cuerpo celeste con identificador: " + idCuerpo + " [realizado por ama302.Estamos en febrero de 2026]");
        interfazAlumno = new CuerpoCelesteDaoArray();
        // Consultar de Cuerpo Celeste por ID
        CuerpoCeleste cuerpoCeleste = null;
        cuerpoCeleste= interfazAlumno.obtenerCuerpoCelestePorID(idCuerpo);
        
        // Imprimiendo el contenido del cuerpo celeste obtenido
        System.out.println(cuerpoCeleste);
        
    }
}
