/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiadam.latihanmvc.controller;

import edu.rizkiadam.latihanmvc.model.PelangganModel;
import edu.rizkiadam.latihanmvc.view.PelangganView;
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
public class PelangganController {
    private PelangganModel pelangganModel;

    public void setPelangganModel(PelangganModel pelangganModel) {
        this.pelangganModel = pelangganModel;
    }
    
    public void resetForm(PelangganView pelangganView) {
        String nama = pelangganView.getTxtNama().getText();
        String email = pelangganView.getTxtEmail().getText();
        String nomorTelepon = pelangganView.getTxtNomorTelepon().getText();
        if (nama.equals("") && email.equals("") && nomorTelepon.equals("")) {
            
        } else {
            pelangganModel.resetForm();
        }
    }
    
    public void simpanForm(PelangganView pelangganView) {
        String nama = pelangganView.getTxtNama().getText();
        String email = pelangganView.getTxtEmail().getText();
        String nomorTelepon = pelangganView.getTxtNomorTelepon().getText();
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(pelangganView, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(pelangganView, "Email Masih Kosong");
        } else if (nomorTelepon.trim().equals("")) {
            JOptionPane.showMessageDialog(pelangganView, "Nomor Telepon Masih Kosong");
        } else {
            pelangganModel.simpanForm();
        }
    }
}
