/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiadam.latihanmvc.model;

import edu.rizkiadam.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan biodata di layar.
 * 
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String nomorTelepon;
    private PelangganListener pelangganListener;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
        fireOnChange();
    }

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    protected void fireOnChange() {
        if (pelangganListener != null) {
            pelangganListener.onChange(this);
        }
    }
    
    public void resetForm() {
        setNama("");
        setEmail("");
        setNomorTelepon("");
    }
    
    public void simpanForm() {
        JOptionPane.showMessageDialog(null, "Berhasil disimpan");
        resetForm();
    }
}
