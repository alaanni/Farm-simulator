
package maatila;

import java.util.ArrayList;

public class Maatila implements Eleleva{
    private String omistaja;
    private Navetta navetta;
    private ArrayList<Lehma> lehmat;
    
    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }

    @Override
    public void eleleTunti() {
        lehmat.stream().forEach(lehma -> lehma.eleleTunti());
    }
    public String getOmistaja() {
        return this.omistaja;
    }
    public void lisaaLehma(Lehma lehma) {
        lehmat.add(lehma);
    }
    public void hoidaLehmat() {
        this.navetta.hoida(lehmat);
    }
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti robo) {
        this.navetta.asennaLypsyrobotti(robo);
    }
    public String toString() {
        if (lehmat.isEmpty()) {
            System.out.println("Ei lehmiä. ");
        }
        String lehmatListana = "";
        for (Lehma lehma: lehmat) {
            lehmatListana += lehma.toString()+"\n";
        }
        return lehmatListana;
    }
}
