/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myhome.git_bangundatar;

/**
 *
 * @author rizal
 */
public abstract class BangunDatar {

    private String nama;
    private String sudut;

    public BangunDatar(String nama, String sudut) {
        this.nama = nama;
        this.sudut = sudut;
    }

    public BangunDatar() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSudut() {
        return sudut;
    }

    public void setSudut(String sudut) {
        this.sudut = sudut;
    }

    public abstract double hitungLuas();

    public abstract double hitungkeliling();

}
