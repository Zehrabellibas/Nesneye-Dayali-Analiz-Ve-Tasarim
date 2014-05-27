/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restourantproje;

/**
 *
 * @author tugce
 */
public class Odeme {

    Siparis s = new Siparis();
    double tutar;

    public Odeme() {
    }
    
    

    public double sontutarHesap() {
        for (int i=0; i<s.getYemekListesi().size(); i++) {
            tutar = tutar+s.getYemekListesi().get(i).getYemekFiyatı();
        }
    
    return tutar;
        }
    }
