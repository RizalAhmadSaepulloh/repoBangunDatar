/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myhome.git_bangundatar;

/**
 *
 * @author rizal
 */
public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi(double sisi, String nama, String sudut) {
        super(nama, sudut);
        this.sisi = sisi;
    }

    public Persegi() {
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi*2;
    }

    @Override
    public double hitungkeliling() {
        return 4*sisi;
    }

}
