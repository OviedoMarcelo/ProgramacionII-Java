/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Reserva
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class Reserva {

    // Atributos de la clase 
    private String fecha;
    private String horario;
    private Mesa mesa;
    private Cliente cliente;

    // Zona de constructores 
    public Reserva(String fecha, String horario, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.horario = horario;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    public Reserva(String fecha, String horario, Mesa mesa) {
        this.fecha = fecha;
        this.horario = horario;
        this.mesa = mesa;
    }

    // Zona de métodos de la clase
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha != null) {
            this.fecha = fecha;
        }
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        if (horario != null) {
            this.horario = horario;
        }
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        if (mesa != null) {
            this.mesa = mesa;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", horario=" + horario + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }

}
