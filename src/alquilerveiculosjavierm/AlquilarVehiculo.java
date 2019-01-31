/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerveiculosjavierm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javi
 */
public class AlquilarVehiculo {
    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;
    private List <Cliente> clientes;
    private List <Vehiculo> vehiculos;
    private List <AlquilarVehiculo> alquileres;

    public AlquilarVehiculo(int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler, List<Cliente> clientes, List<Vehiculo> vehiculos, List<AlquilarVehiculo> alquileres) {
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
        this.clientes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "AlquilarVehiculo{" + "diaAlquiler=" + diaAlquiler + ", mesAlquiler=" + mesAlquiler + ", a\u00f1oAlquiler=" + añoAlquiler + ", totalDiasAlquiler=" + totalDiasAlquiler + ", clientes=" + clientes + ", vehiculos=" + vehiculos + ", alquileres=" + alquileres + '}';
    }

    
}
