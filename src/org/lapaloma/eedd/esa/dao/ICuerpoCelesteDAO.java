/**
 * 
 */
package org.lapaloma.eedd.esa.dao;

import java.util.List;

import org.lapaloma.eedd.esa.vo.CuerpoCeleste;

/**
 * Interfaz con las operaciones a realizar sobre un Cuerpo Celeste.
 * 
 * @author Programador: Isidoro Nevares Martín - Virgen de la Paloma
 * @date 29 enero 2026
 */
public interface ICuerpoCelesteDAO {
    public CuerpoCeleste obtenerCuerpoCelestePorID(int idCuerpoCeleste);

    public List<CuerpoCeleste> obtenerListaCuerposCelestes();
}
