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

    public AlquilarVehiculo(int totalVehiculos,int totalClientes,int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler, Cliente[] clientes, Vehiculo[] vehiculos, AlquilarVehiculo[] alquileres) {
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
        this.clientes = new Cliente[50];
        this.vehiculos = new Vehiculo[50];
        this.alquileres = new AlquilarVehiculo[100];
        this.totalClientes= 0;
        this.totalVehiculos= 0;
        
    }

    @Override
    public String toString() {
        return "AlquilarVehiculo{" + "diaAlquiler=" + diaAlquiler + ", mesAlquiler=" + mesAlquiler + ", a\u00f1oAlquiler=" + añoAlquiler + ", totalDiasAlquiler=" + totalDiasAlquiler + ", clientes=" + Arrays.toString(clientes) + ", vehiculos=" + vehiculos + ", alquileres=" + alquileres + '}';
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
for (int i=0; i<this.totalClientes; i++)
System.out.println(clientes[i].toString());
}
 
public void imprimirVehiculos() {
System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");
for (int i=0; i<this.totalVehiculos; i++)
System.out.println(vehiculos[i].toString());
}

private Cliente getCliente(String nif) {
for (Cliente c : this.clientes)
if (c.getNif().equals(nif))

return c;

return null;
}

}
