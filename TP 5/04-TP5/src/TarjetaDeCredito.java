/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase TarjetaDeCredito
 *
 * @author Oviedo Marcelo
 * @date 15 sept 2025
 *
 * Descripción: TODO: Agregar descripción de la clase
 */
public class TarjetaDeCredito {

    // Atributos de la clase 
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    // Zona de constructores 
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this(numero, fechaVencimiento, banco);
        if (cliente != null) {
            this.cliente = cliente;
        }

    }

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        if (numero != null && fechaVencimiento != null && banco != null) {
            this.numero = numero;
            this.fechaVencimiento = fechaVencimiento;
            this.banco = banco;
        }
    }

    // Zona de métodos de la clase
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        if (banco != null) {
            this.banco = banco;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
            if (cliente.getTarjetaDeCredito() != this) {
                cliente.setTarjetaDeCredito(this);
            }
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + cliente.getNombre() + '}';
    }

}
