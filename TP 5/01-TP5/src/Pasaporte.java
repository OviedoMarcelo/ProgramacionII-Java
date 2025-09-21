/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Pasaporte
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Pasaporte {

    // Atributos de la clase 
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    // Zona de constructores 
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        if (numero != null && fechaEmision != null && imagen != null && formato != null) {
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = new Foto(imagen, formato);
        }
    }
    // Zona de métodos de la clase

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getFoto() {
        return foto.getImagen();
    }

    public void setFoto(String foto) {
        this.foto.setImagen(foto);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte()!= this) {
            titular.setPasaporte(this);
        }

    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular.getNombre() + '}';
    }

}
