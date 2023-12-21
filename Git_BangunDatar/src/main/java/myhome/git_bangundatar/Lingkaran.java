/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myhome.git_bangundatar;

/**
 *
 * @author rizal
 */
public class Lingkaran extends BangunDatar {

    private double jariJari;

    // Konstruktor untuk mengatur jari-jari lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
        
    }

    @Override
    public double hitungkeliling() {
        return 2 * Math.PI * jariJari;

    }

}
