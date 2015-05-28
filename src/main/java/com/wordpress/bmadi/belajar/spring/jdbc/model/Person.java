package com.wordpress.bmadi.belajar.spring.jdbc.model;

import java.util.Date;

public class Person {

    private Integer id;
    private String nama;
    private Date tanggaLahir;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggaLahir() {
        return tanggaLahir;
    }

    public void setTanggaLahir(Date tanggaLahir) {
        this.tanggaLahir = tanggaLahir;
    }

}
