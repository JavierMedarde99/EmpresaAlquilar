/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerveiculosjavierm;

import static alquilerveiculosjavierm.AlquilarVehiculo.RegistarClienteAleatorio;
import static alquilerveiculosjavierm.AlquilarVehiculo.RegistarVehiculoAleatorio;

/**
 *
 * @author javi
 */
public class AlquilerVeiculosJavierM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo[] b = new Vehiculo[50];
        Cliente[] c = new Cliente[50];
        b = RegistarVehiculoAleatorio();
        c = RegistarClienteAleatorio();
        AlquilarVehiculo a = new AlquilarVehiculo(11, 5, 6, 12, b, c);
        a.imprimirClientes();
        a.imprimirVehiculos();
        a.OrdenacionBurbujaCliente();
        a.OrdenacionBurbujaVehiculos();
        System.out.println("¿Que cliente desea buscar?");
        
    }

}
