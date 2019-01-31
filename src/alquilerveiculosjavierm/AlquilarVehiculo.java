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
    private Cliente[] clientes;
    private Vehiculo[] vehiculos;
    private AlquilarVehiculo[] alquileres;

    public AlquilarVehiculo(int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler, Cliente[] clientes, Vehiculo[] vehiculos, AlquilarVehiculo[] alquileres) {
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
        this.clientes = new Cliente[50];
        this.vehiculos = new Vehiculo[50];
        this.alquileres = new AlquilarVehiculo[100];
    }

    @Override
    public String toString() {
        return "AlquilarVehiculo{" + "diaAlquiler=" + diaAlquiler + ", mesAlquiler=" + mesAlquiler + ", a\u00f1oAlquiler=" + añoAlquiler + ", totalDiasAlquiler=" + totalDiasAlquiler + ", clientes=" + Arrays.toString(clientes) + ", vehiculos=" + vehiculos + ", alquileres=" + alquileres + '}';
    }

   

    

    
    
}
