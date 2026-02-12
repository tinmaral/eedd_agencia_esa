/**
 * 
 */
package org.lapaloma.eedd.esa.dao.array;

import java.util.ArrayList;
import java.util.List;

import org.lapaloma.eedd.esa.dao.ICuerpoCelesteDAO;
import org.lapaloma.eedd.esa.vo.CuerpoCeleste;


/**
 * Implementación JDBC del interfaz ICuerpoCelesteDAO
 * 
 * @author Programador: Isidoro Nevares Martín - Virgen de la Paloma
 * @date 29 enero 2026
 */
public class CuerpoCelesteDaoArray implements ICuerpoCelesteDAO {

    @Override
    public CuerpoCeleste obtenerCuerpoCelestePorID(int idCuerpoCeleste) {
        CuerpoCeleste cuerpoCeleste = null;
        List<CuerpoCeleste> listaCuerposCelestes = obtenerListaCuerposCelestes();
        for (CuerpoCeleste cuerpo : listaCuerposCelestes) {
            if (cuerpo.getIdentificador() == idCuerpoCeleste) {
                cuerpoCeleste = cuerpo;
                break;
            }
        }
        return cuerpoCeleste;
    }

    @Override
    public List<CuerpoCeleste> obtenerListaCuerposCelestes() {
        ArrayList<CuerpoCeleste> cuerpos = new ArrayList<>();

        cuerpos.add(new CuerpoCeleste(1, "Marte", "Planeta", 3.7200));
        cuerpos.add(new CuerpoCeleste(2, "Luna", "Satélite", 1.6200));
        cuerpos.add(new CuerpoCeleste(3, "Europa", "Satélite", 1.3150));
        cuerpos.add(new CuerpoCeleste(4, "Ceres", "Planetoide", 0.2800));
        cuerpos.add(new CuerpoCeleste(5, "Psyche", "Asteroide", 0.1500));        
        return cuerpos;
    }
}
