/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Clases;

/**
 *
 * @author pc lenovo
 */
public class Laptop {
    
  private static int CUENTA=0;
  private  int tamañoMemoria=0;
  private  double precio=0.0;
  private  String modelo="";
  private  String marca="";

    public Laptop() {
    incrementarCuenta();
    }
    
     public Laptop(int tamañoM,double precio,String marca, String modelo) {
         this.tamañoMemoria=tamañoM;
         this.precio=precio;
         this.marca=marca;
         this.modelo=modelo;
         incrementarCuenta();
         
         
    }
     
       public Laptop(int tamañoM,int precio,String marca, String modelo) {
         this.tamañoMemoria=tamañoM;
         this.precio= (double) precio;
         this.marca=marca;
         this.modelo=modelo;
           incrementarCuenta();
         
         
    } 

    public int getTamañoMemoria() {
        return tamañoMemoria;
    }
    
/*
 Sobrecargar los métodos modificadores de memoria y de precio para
que acepten double e int correspondientemente
    */
    public void setTamañoMemoria(int tamañoMemoria) {
        this.tamañoMemoria = tamañoMemoria;
    }
       public void setTamañoMemoria(double tamañoMemoria) {
        this.tamañoMemoria = (int)tamañoMemoria;
    }
      public void setPrecio(double precio) {
        this.precio = precio;
    }
        public void setPrecio(int precio) {
        this.precio = (double) precio;
    }
        
      public double getPrecio() {
        return precio;
    }     

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
       
     
    /*
    observaciones se definieron los metodos estaticos ya que una variable estatica no se puede acceder 
    desde un contexto que no sea estatico
    */
     public int retornarVariableCuenta2() {

        return retornarVariableCuenta();

    }

    private static int retornarVariableCuenta() {

        return CUENTA;
    }

    public double retornarVariableCuentad2() {

        return retornarVariableCuentad();

    }

    private static double retornarVariableCuentad() {
        return (double) CUENTA;
    }

    private static void incrementarCuenta() {

        CUENTA = CUENTA + 1;

    }

    @Override
    public String toString() {
        return "Laptop: "  + "tamaño de memoria  = " + tamañoMemoria + ", precio = " + precio + ", modelo = " + modelo + ", marca = " + marca ;
    }
    
    
  
}
