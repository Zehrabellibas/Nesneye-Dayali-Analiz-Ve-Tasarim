/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restourantproje;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tugce
 */
public class Siparis {
    
    private int siparisID;
    private int masaNo;
    private List<Yemek> yemekListesi = null;
    private boolean siparisOnay;
    private double hesap;
    
    public Siparis() {
        siparisID = generateSiparisID();
        yemekListesi = new ArrayList<Yemek>();
    }
    
    private int generateSiparisID() {
        int sID;
        sID = 5 + (int) (Math.random() * ((10 - 5) + 1));
        return sID;
    }

    public double getHesap() {
        return hesap;
    }

    public void setHesap(double hesap) {
        this.hesap = hesap;
    }
    
    
    
    public int getMasaNo() {
        return masaNo;
    }
    
    public void setMasaNo(int masaNo) {
        this.masaNo = masaNo;
    }
    
    public int getSiparisID() {
        return siparisID;
    }
    
    public boolean isSiparisOnay() {
        return siparisOnay;
    }
    
    public void setSiparisOnay(boolean siparisOnay) {
        this.siparisOnay = siparisOnay;
    }
    
    public List<Yemek> getYemekListesi() {
        return yemekListesi;
    }
    
    public void addYemek(Yemek yemek) {
        yemekListesi.add(yemek);
    }
    
    public void removeYemek(Yemek yemek) {
        yemekListesi.remove(yemek);
    }
}
