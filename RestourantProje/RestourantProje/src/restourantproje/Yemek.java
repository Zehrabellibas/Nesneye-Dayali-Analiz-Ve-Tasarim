/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restourantproje;

/**
 *
 * @author tugce
 */
public class Yemek {

    private String yemekAdi;
    private int yemekID;
    private double yemekFiyatı;

    public Yemek(String yemekAdi) {
        this.yemekAdi = yemekAdi;
    }

    public String getYemekAdi() {
        return yemekAdi;
    }

    public double getYemekFiyatı() {
        return yemekFiyatı;
    }

    public void setYemekFiyatı(double yemekFiyatı) {
        this.yemekFiyatı = yemekFiyatı;
    }
    
    
}
