
package maatila;

import static java.lang.Math.ceil;
import java.util.Random;


public class Lehma implements Lypsava, Eleleva{
    private String nimi;
    private double tilavuus;
    private double maara;
    
    public Lehma() { 
        this.nimi = NIMIA[new Random().nextInt(NIMIA.length)];
        this.tilavuus = 15 + new Random().nextInt(26);
    }
    public Lehma(String nimi) {
        this.nimi = nimi;
        this.tilavuus = 15 + new Random().nextInt(26);
    }
    public String getNimi() {
        return this.nimi;
    }
    public double getTilavuus() {
        return this.tilavuus;
    }
    public double getMaara() {
        return this.maara;
    }
    @Override
    public String toString() {
        return this.nimi+" "+ceil(this.maara)+"/"+ceil(this.tilavuus);
    }

    @Override
    public double lypsa() {
        double lypsetty = this.maara;
        this.maara = 0;
        return lypsetty;
    }
    
    @Override
    public void eleleTunti() {
       this.maara += 0.7 + new Random().nextDouble();
       if (this.maara > this.tilavuus) {
           this.maara = this.tilavuus;
       }
    }
    
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};



    
}
