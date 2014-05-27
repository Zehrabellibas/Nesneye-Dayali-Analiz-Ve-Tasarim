/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restourantproje;

/**
 *
 * @author tugce
 */
public class Musteri {

    private int aboneNo;
    private String parola;

    public Musteri(int aboneNo, String parola) {
        this.aboneNo = aboneNo;
        this.parola = parola;
    }

    public int getAboneNo() {
        return aboneNo;
    }

    public void setAboneNo(int aboneNo) {
        this.aboneNo = aboneNo;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public boolean login(int aboneNo, String parola) {

        if (this.aboneNo == aboneNo && (this.parola == null ? parola == null : this.parola.equals(parola))) {
            return true;
        } else {
            return false;
        }
    }
}
