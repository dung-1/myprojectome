/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLDA_Model;

/**
 *
 * @author NGUYEN DUNG
 */
public class SANPHAM {

    String maSanpham;
    String loaiSanpham;
    String tenSanpham;
    String donVitinh;
    String giaBan;
   private byte[]   hinh;

    public SANPHAM() {
    }

    public SANPHAM(String maSanpham, String loaiSanpham, String tenSanpham, String donVitinh, String giaBan, byte[] hinh) {
        this.maSanpham = maSanpham;
        this.loaiSanpham = loaiSanpham;
        this.tenSanpham = tenSanpham;
        this.donVitinh = donVitinh;
        this.giaBan = giaBan;
        this.hinh = hinh;
    }

    public String getMaSanpham() {
        return maSanpham;
    }

    public void setMaSanpham(String maSanpham) {
        this.maSanpham = maSanpham;
    }

    public String getLoaiSanpham() {
        return loaiSanpham;
    }

    public void setLoaiSanpham(String loaiSanpham) {
        this.loaiSanpham = loaiSanpham;
    }

    public String getTenSanpham() {
        return tenSanpham;
    }

    public void setTenSanpham(String tenSanpham) {
        this.tenSanpham = tenSanpham;
    }

    public String getDonVitinh() {
        return donVitinh;
    }

    public void setDonVitinh(String donVitinh) {
        this.donVitinh = donVitinh;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public byte[] getHinh() {
        return hinh;
    }

    public void setHinh(byte[] hinh) {
        this.hinh = hinh;
    }


   }