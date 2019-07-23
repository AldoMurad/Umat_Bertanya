package com.mardesago.umatbertanya.model;

import java.io.Serializable;

/**
 * Created by Dwi Randy Herdinanto on 11/3/2017.
 */

public class biografi implements Serializable {
    private int id_biografi;
    private String nama, keterangan;

    public biografi() {

    }

    public biografi(int id, String nama, String keterangan) {
        this.id_biografi = id;
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public int getId_biografi() {
        return id_biografi;
    }

    public void setId_biografi(int id_biografi) {
        this.id_biografi = id_biografi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
