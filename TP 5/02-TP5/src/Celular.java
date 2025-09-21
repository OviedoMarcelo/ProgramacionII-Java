/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Celular
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Celular {

    // Atributos de la clase 
    private String emei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    // Zona de constructores 
    public Celular(String emei, String marca, String modelo, Bateria bateria) {
        if (emei != null && marca != null && modelo != null && bateria != null) {
            this.emei = emei;
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
        }
    }
    // Zona de métodos de la clase

    public String getEmei() {
        return emei;
    }

    public void setEmei(String emei) {
        if (emei != null) {
            this.emei = emei;
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        }

    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        if (bateria != null) {
            this.bateria = bateria;
        }

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        if (usuario != null) {
            this.usuario = usuario;
            if (usuario.getCelular() != this) {
                usuario.setCelular(this);
            }
        }

    }

    @Override
    public String toString() {
        return "Celular{" + "emei=" + emei + ", marca=" + marca + ", modelo=" + modelo + ", usuario=" + usuario.getNombre() + ", bateria=" + bateria + '}';
    }

}
