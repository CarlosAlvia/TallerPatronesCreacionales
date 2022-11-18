/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesCreacionales;

import java.util.List;


public class laptop implements producto{
    
    private String marca;
    private String modelo;
    private String so;
    private int cantidadRam;
    private int almacenamiento;
    private String tecnologiaPantalla;
    private String tarjetaGrafica;
    private List<String> fallas;

    public laptop(String marca, String modelo, String so, int cantidadRam, int almacenamiento, String tecnologiaPantalla, String tarjetaGrafica) {
        this.marca = marca;
        this.modelo = modelo;
        this.so = so;
        this.cantidadRam = cantidadRam;
        this.almacenamiento = almacenamiento;
        this.tecnologiaPantalla = tecnologiaPantalla;
        this.tarjetaGrafica = tarjetaGrafica;
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

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public List<String> getFallas() {
        return fallas;
    }

    public void setFallas(List<String> fallas) {
        this.fallas = fallas;
    }
    
    
    
}
