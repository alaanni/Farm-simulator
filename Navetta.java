
package maatila;

import static java.lang.Math.ceil;
import java.util.List;


public class Navetta {
    private Lypsyrobotti robotti;
    private Maitosailio sailio;
    
    public Navetta(Maitosailio maitosailio) {
        this.sailio = maitosailio;
    }
    public Maitosailio getMaitosailio() {
        return this.sailio;
    }
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.robotti = lypsyrobotti;
        this.robotti.setMaitosailio(this.sailio);
    }
    public void hoida(Lehma lehma) {
        this.robotti.lypsa(lehma);
    }
    public void hoida(List<Lehma> lehmat) {
        lehmat.stream().forEach(lehma -> this.robotti.lypsa(lehma));
    }
    @Override
    public String toString() {
        return ceil(this.sailio.getSaldo())+"/"+ceil(this.sailio.getTilavuus());
    }
}
