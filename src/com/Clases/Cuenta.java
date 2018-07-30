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
public class Cuenta {
    private int numeroCuenta;
    private String nombreUsuario;
    private int saldo;


    public Cuenta() {
    }
    
    

    public Cuenta(int numeroCuenta, String nombreUsuario, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreUsuario = nombreUsuario;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    @Override
    public String toString() {
        return  "Número de cuenta : " + numeroCuenta + "\n"
                + "Usuario : " + nombreUsuario+ "\n"
                + "Saldo: "+ saldo;
    }
    
    
}
