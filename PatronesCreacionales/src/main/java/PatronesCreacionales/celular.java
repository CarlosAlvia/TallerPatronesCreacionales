/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesCreacionales;

import java.util.List;


public class celular implements producto{
    private String marca;
    private String modelo;
    private int cantidadSims;
    private String so;
    private int cantidadRam;
    private int almacenamiento;
    private boolean tieneRadio;
    private String tecnologiaPantalla;
    private String diagonalPantalla;
    private List<String> fallas;

    public celular(String marca, String modelo, int cantidadSims, String so, int cantidadRam, int almacenamiento, boolean tieneRadio, String tecnologiaPantalla, String diagonalPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadSims = cantidadSims;
        this.so = so;
        this.cantidadRam = cantidadRam;
        this.almacenamiento = almacenamiento;
        this.tieneRadio = tieneRadio;
        this.tecnologiaPantalla = tecnologiaPantalla;
        this.diagonalPantalla = diagonalPantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadSims() {
        return cantidadSims;
    }

    public void setCantidadSims(int cantidadSims) {
        this.cantidadSims = cantidadSims;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(int cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public String getTecnologiaPantalla() {
        return tecnologiaPantalla;
    }

    public void setTecnologiaPantalla(String tecnologiaPantalla) {
        this.tecnologiaPantalla = tecnologiaPantalla;
    }

    public String getDiagonalPantalla() {
        return diagonalPantalla;
    }

    public void setDiagonalPantalla(String diagonalPantalla) {
        this.diagonalPantalla = diagonalPantalla;
    }

    public List<String> getFallas() {
        return fallas;
    }

    public void setFallas(List<String> fallas) {
        this.fallas = fallas;
    }
    
    
}
