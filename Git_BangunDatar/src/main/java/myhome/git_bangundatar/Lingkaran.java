/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myhome.git_bangundatar;

/**
 *
 * @author rizal
 */
public class Lingkaran extends BangunDatar{
    private double radius;
    double phi = 3.14;

    public Lingkaran(double radius, double , String nama, String sudut) {
        super(nama, sudut);
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return phi * Math.pow(phi, 2);
    }

    @Override
    public double hitungkeliling() {
        
    }
    
   
}
