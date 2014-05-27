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
public class Konsol {

    private int konsolID;
    private int garsonID;
    private List<Siparis> siparisList;

    public Konsol() {
        siparisList = new ArrayList<Siparis>();
    }

    public void setKonsolID(int konsolID) {
        this.konsolID = konsolID;
    }

    public int getKonsolID() {
        return konsolID;
    }

    public List<Siparis> getSiparisList() {
        return siparisList;
    }

    public int siparisListeSize() {
        return siparisList.size();
    }

    public Siparis yeniSiparis(Siparis s) {
        siparisList.add(s);
        return s;
    }

    public void masaNoGir(int masaNo) {
        int lastIndex = siparisList.size() - 1;
        siparisList.get(lastIndex).setMasaNo(masaNo);
    }

    public void YemekEkle(Yemek yemek) {
        siparisList.get(siparisList.size() - 1).addYemek(yemek);
    }

    public boolean siparisOnay(Siparis s) {
        boolean onay;
        siparisList.get(siparisList.size() - 1).setSiparisOnay(true);
        onay = siparisList.get(siparisList.size() - 1).isSiparisOnay();
        return onay;
    }
    

}
