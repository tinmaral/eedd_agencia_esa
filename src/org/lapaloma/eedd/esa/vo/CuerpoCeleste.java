/**
 * 
 */
package org.lapaloma.eedd.esa.vo;

/**
 * Clase VO que maneja información de entidades de tipo Cuerpo Celeste.
 * 
 * @author Isidoro Nevares Martín - IES Virgen de la Paloma
 * @date 29 enero 2026
 * @version 1.0
 */
public class CuerpoCeleste {

    private int identificador;
    private String nombre;
    private String tipo;
    private double gravedad_superficie_ms2;

    public CuerpoCeleste() {
        super();
    }

    public CuerpoCeleste(int identificador, String nombre, String tipo, double gravedad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipo = tipo;
        this.gravedad_superficie_ms2 = gravedad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getGravedad_superficie_ms2() {
        return gravedad_superficie_ms2;
    }

    public void setGravedad_superficie_ms2(double gravedad_superficie_ms2) {
        this.gravedad_superficie_ms2 = gravedad_superficie_ms2;
    }

    @Override
    public String toString() {
        return "CuerpoCeleste [identificador=" + identificador + ", nombre=" + nombre + ", tipo=" + tipo
                + ", gravedad_superficie_ms2=" + gravedad_superficie_ms2 + "]";
    }

}
