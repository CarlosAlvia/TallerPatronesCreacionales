/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesCreacionales;

import java.util.List;

/**
 *
 * @author juand
 */
public class tablet implements producto{
    private String marca;
    private String modelo;
    private boolean soportadSim;
    private String so;
    private int cantidadRam;
    private int almacenamiento;
    private String tecnologiaPantalla;
    private String diagonalPantalla;
    private List<String> fallas;

    public tablet(String marca, String modelo, boolean soportadSim, String so, int cantidadRam, int almacenamiento, String tecnologiaPantalla, String diagonalPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.soportadSim = soportadSim;
        this.so = so;
        this.cantidadRam = cantidadRam;
        this.almacenamiento = almacenamiento;
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

    public boolean isSoportadSim() {
        return soportadSim;
    }

    public void setSoportadSim(boolean soportadSim) {
        this.soportadSim = soportadSim;
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
