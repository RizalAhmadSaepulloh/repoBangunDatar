/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myhome.git_bangundatar;

/**
 *
 * @author M Alif Mi'raj Jabbar
 */
public class PersegiPanjang extends BangunDatar{
    private int panjang;
    private int lebar;

    public PersegiPanjang() {
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungkeliling() {
        return 2 * (panjang + lebar);
    }
    
}
