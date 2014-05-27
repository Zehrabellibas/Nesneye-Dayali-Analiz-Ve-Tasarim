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
public class Sistem {

    private List<Siparis> siparisList;

    public Sistem() {
        siparisList = new ArrayList<Siparis>();
    }

    public List<Siparis> getSiparisList() {
        return siparisList;
    }

    public Siparis yeniSiparisOnline(Siparis s) {
        siparisList.add(s);
        return s;
    }

    public void urunEkle(Yemek yemek) {
        siparisList.get(siparisList.size() - 1).addYemek(yemek);
    }

    public void urunCikar(Yemek yemek) {
        siparisList.get(siparisList.size() - 1).removeYemek(yemek);
    }

    public void siparisiTamamla() {
        siparisList.get(siparisList.size() - 1).setSiparisOnay(true);
    }
}
