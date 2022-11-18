/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesCreacionales;

import java.util.List;


public class televisor {
    
    private String marca;
    private String modelo;
    private String tecnologiaPantalla;
    private String diagonalPantalla;
    private String potenciaSonido;
    private String so;
    private List<String> fallas;

    public televisor(String marca, String modelo, String tecnologiaPantalla, String diagonalPantalla, String potenciaSonido, String so) {
        this.marca = marca;
        this.modelo = modelo;
        this.tecnologiaPantalla = tecnologiaPantalla;
        this.diagonalPantalla = diagonalPantalla;
        this.potenciaSonido = potenciaSonido;
        this.so = so;
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

    public String getPotenciaSonido() {
        return potenciaSonido;
    }

    public void setPotenciaSonido(String potenciaSonido) {
        this.potenciaSonido = potenciaSonido;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public List<String> getFallas() {
        return fallas;
    }

    public void setFallas(List<String> fallas) {
        this.fallas = fallas;
    }
    
    
    
}
