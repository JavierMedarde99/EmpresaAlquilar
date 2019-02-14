/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerveiculosjavierm;

import java.util.Arrays;

/**
 *
 * @author javi
 */
public class AlquilarVehiculo {

    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;
    private int totalClientes;
    private int totalVehiculos;
    private Cliente[] clientes;
    private Vehiculo[] vehiculos;
    private AlquilarVehiculo[] alquileres;

    public AlquilarVehiculo(int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler, Vehiculo[] vehiculos, Cliente[] cliente) {
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
        this.totalClientes = 0;
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50];
        this.clientes = new Cliente[50];

    }

    public static Cliente[] RegistarClienteAleatorio() {
        Cliente[] b = new Cliente[50];
        for (int i = 0; i < b.length; i++) {
            Cliente a = new Cliente();
            b[i] = a;
        }
        return b;
    }

    public static Vehiculo[] RegistarVehiculoAleatorio() {
        Vehiculo[] b = new Vehiculo[50];
        for (int i = 0; i < 50; i++) {
            Vehiculo a = new Vehiculo();
            a = b[i];
        }
        return b;

    }

    @Override
    public String toString() {
        return "AlquilarVehiculo{" + "diaAlquiler=" + diaAlquiler + ", mesAlquiler=" + mesAlquiler + ", a\u00f1oAlquiler=" + añoAlquiler + ", totalDiasAlquiler=" + totalDiasAlquiler + ", clientes=" + Arrays.toString(clientes) + ", vehiculos=" + Arrays.toString(vehiculos) + ", alquileres=" + Arrays.toString(alquileres) + '}';
    }

    public void registrarCliente(Cliente nuevo) {
        this.clientes[this.totalClientes] = nuevo;
        this.totalClientes++;
    }

    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos[this.totalVehiculos] = nuevo;
        this.totalVehiculos++;
    }

    public void imprimirClientes() {
        System.out.println("NIF cliente\tNombre\n");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes[i].toString());
        }
    }

    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");
        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos[i].toString());
        }
    }

    private Cliente getCliente(String nif) {
        for (Cliente c : this.clientes) {
            if (c.getNif().equals(nif)) {
                return c;
            }
        }
        return null;
    }

    private Vehiculo getVehiculo(String matricula) {
        for (Vehiculo c : this.vehiculos) {
            if (c.getMatricula().equals(matricula)) {

                return c;
            }
        }
        return null;
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {

        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false);
        }
    }
    
    public void OrdenacionBurbuja(){
        
    }

}
