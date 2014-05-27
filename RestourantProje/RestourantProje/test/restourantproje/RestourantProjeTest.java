/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restourantproje;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tugce
 */
public class RestourantProjeTest {

    public RestourantProjeTest() {
    }

    /**
     * Yeni siparis olusturma deneniyor
     */
    @Test
    public void testYeniSiparis() {
        Konsol konsol1 = new Konsol();
        Siparis s1 = new Siparis();

        konsol1.yeniSiparis(s1);

        assertEquals(1, konsol1.siparisListeSize());
    }

    /**
     * Masa numarası girme ve dogru masa numarası atandigi deneniyor
     */
    @Test
    public void testMasaNoGir() {
        Konsol k1 = new Konsol();
        Siparis s1 = new Siparis();
        Siparis s2 = new Siparis();

        k1.yeniSiparis(s1);
        k1.masaNoGir(2);
        k1.yeniSiparis(s2);
        k1.masaNoGir(5);

        assertEquals(2, s1.getMasaNo());
        assertEquals(5, s2.getMasaNo());
    }

    /**
     * Yemek girisi yapıp dogru yere dogru yemek adı eklendigi deneniyor
     */
    @Test
    public void testYemekGirisi() {
        Konsol k1 = new Konsol();
        Siparis s1 = new Siparis();
        Siparis s2 = new Siparis();
        Yemek y1 = new Yemek("fasulye");
        Yemek y2 = new Yemek("pilav");

        k1.yeniSiparis(s1);
        k1.YemekEkle(y1);
        k1.yeniSiparis(s2);
        k1.YemekEkle(y2);
        k1.YemekEkle(y1);

        assertEquals(1, k1.getSiparisList().get(0).getYemekListesi().size());
        assertEquals(2, k1.getSiparisList().get(1).getYemekListesi().size());
        assertEquals("fasulye", k1.getSiparisList().get(1).getYemekListesi().get(1).getYemekAdi());
        assertEquals("fasulye", k1.getSiparisList().get(0).getYemekListesi().get(0).getYemekAdi());
        assertEquals("pilav", k1.getSiparisList().get(1).getYemekListesi().get(0).getYemekAdi());
    }

    /**
     * Siparisin onaylanmasi islemi deneniyor
     */
    @Test
    public void testSiparisOnayi() {
        Konsol k1 = new Konsol();
        Siparis s1 = new Siparis();
        Yemek y1 = new Yemek("fasulye");
        Yemek y2 = new Yemek("pilav");

        k1.yeniSiparis(s1);
        k1.YemekEkle(y1);
        k1.YemekEkle(y2);

        k1.siparisOnay(s1);

        assertEquals(true, k1.getSiparisList().get(0).isSiparisOnay());

    }
    
    /**
     * Login islemi deneniyor
     */

    @Test
    public void testLogin() {
        boolean accessGranted;
        Musteri m1 = new Musteri(1234, "parola");
        accessGranted = m1.login(m1.getAboneNo(), m1.getParola());

        assertEquals(true, accessGranted);

    }
    
    /**
     * Siparisin olusturma islemi deneniyor
     */

    @Test
    public void testYeniSiparisOnline() {
        Sistem sis1 = new Sistem();
        Siparis s1 = new Siparis();

        sis1.yeniSiparisOnline(s1);

        assertEquals(1, sis1.getSiparisList().size());

    }
    
    /**
     * Urun ekleme islemi deneniyor
     */

    @Test
    public void testUrunEkle() {
        Sistem sis1 = new Sistem();
        Siparis s1 = new Siparis();
        Yemek y1 = new Yemek("fasulye");
        Yemek y2 = new Yemek("pilav");

        sis1.yeniSiparisOnline(s1);
        sis1.urunEkle(y1);
        sis1.urunEkle(y2);

        assertEquals(2, s1.getYemekListesi().size());
        assertEquals("fasulye", s1.getYemekListesi().get(0).getYemekAdi());

        sis1.urunCikar(y1);

        assertEquals(1, s1.getYemekListesi().size());

    }
    
    /**
     * Urun cikarma islemi deneniyor
     */

    @Test
    public void testUrunCikar() {
        Sistem sis1 = new Sistem();
        Siparis s1 = new Siparis();
        Yemek y1 = new Yemek("fasulye");
        Yemek y2 = new Yemek("pilav");

        sis1.yeniSiparisOnline(s1);
        sis1.urunEkle(y1);
        sis1.urunEkle(y2);

        assertEquals(2, s1.getYemekListesi().size());

        sis1.urunCikar(y1);

        assertEquals(1, s1.getYemekListesi().size());
        assertEquals("pilav", s1.getYemekListesi().get(0).getYemekAdi());

    }
    
    /**
     * Siparisin onaylanmasi islemi deneniyor
     */

    @Test
    public void testSiparisiTamamla() {
        Sistem sis1 = new Sistem();
        Musteri m1 = new Musteri(1234, "parola");
        Siparis s1 = new Siparis();

        Yemek y1 = new Yemek("fasulye");
        Yemek y2 = new Yemek("pilav");

        sis1.yeniSiparisOnline(s1);
        sis1.urunEkle(y1);
        sis1.urunEkle(y2);

        sis1.siparisiTamamla();

        assertEquals(true, sis1.getSiparisList().get(0).isSiparisOnay());

    }
    
    /**
     * Hesap odeme baslatma islemi deneniyor
     */
    
    @Test
    public void testHesapOde(){
        
        Konsol k1 = new Konsol();
        Kasiyer kas1 = new Kasiyer();
        Siparis s1 = new Siparis();
        Yemek y1 = new Yemek("fasulye");
        Yemek y2 = new Yemek("pilav");
        
        y1.setYemekFiyatı(10);
        y2.setYemekFiyatı(15);
        k1.masaNoGir(2);
        k1.yeniSiparis(s1);
        k1.YemekEkle(y1);
        k1.YemekEkle(y2);
        
        kas1.hesapOdemeIslemiBaslat(s1.getMasaNo());
        
    }
    
     /**
     * Son tutar hesaplama islemi deneniyor
     */
    
    @Test
    public void testSontutar(){
        
        Konsol k1 = new Konsol();
        Kasiyer kas1 = new Kasiyer();
        Siparis s1 = new Siparis();
        Yemek y1 = new Yemek("fasulye");
        Yemek y2 = new Yemek("pilav");
        
        y1.setYemekFiyatı(10);
        y2.setYemekFiyatı(15);
        k1.masaNoGir(2);
        k1.yeniSiparis(s1);
        k1.YemekEkle(y1);
        k1.YemekEkle(y2);
        
        kas1.hesapOdemeIslemiBaslat(s1.getMasaNo());
        
    }
    
    
}
