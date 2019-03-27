
package maatila;


class Lypsyrobotti {
    private Maitosailio kiinnitetty;
    
    public Lypsyrobotti() {
        this.kiinnitetty = null;
    }
    public Maitosailio getMaitosailio() {
        return this.kiinnitetty;
    }
    public void setMaitosailio(Maitosailio maitosailio) {
        this.kiinnitetty = maitosailio;
    }
    public void lypsa(Lypsava lypsava) {
        if (this.kiinnitetty == null) {
            throw new IllegalStateException("Maidot menevät hukkaan!");        
        }
        this.kiinnitetty.lisaaSailioon(lypsava.lypsa());
    }
}
