/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerveiculosjavierm;

import java.util.Random;

/**
 *
 * @author javi
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public Vehiculo() {
        Random rdm = new Random();
        int a = rdm.nextInt(5);
         int b = rdm.nextInt(5);
         int c = rdm.nextInt(5);
        double g = rdm.nextDouble();
        boolean z =rdm.nextBoolean();
                 
         switch (a){
             case 0:
                 this.matricula="5423 GSH";
                 break;
                 case 1:
                 this.matricula="8698 DAS";
                 break;
                 case 2:
                 this.matricula="8769 UDI";
                 break;
                 case 3:
                 this.matricula="2389 PDS";
                 break;
                 case 4:
                 this.matricula="4592 SWA";
                 break;
         }
         switch (b){
             case 0:
                 this.marca="Abarth";
                 this.modelo="124 Spider";
                                  break;
                 case 1:
                 this.marca="Alfa Romeo.";
                 this.modelo="4C";
                 break;
                 case 2:
                 this.marca="Audi";
                  this.modelo="A1";
                 break;
                 case 3:
                 this.marca="BMW";
                  this.modelo="X5";
                 break;
                 case 4:
                 this.marca="Bugatti";
                  this.modelo="Chiron";
                 break;
         }
        switch (c){
             case 0:
                 this.color="azul";
                 break;
                 case 1:
                  this.color="amarillo";
                 break;
                 case 2:
                  this.color="rojo";
                 break;
                 case 3:
                  this.color="dorado";
                 break;
                 case 4:
                  this.color="blanco";
                 break;
         }
 
        this.tarifa = g;
        this.disponible = z;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }
                  
}
