public class Konto {
    private String kontoinhaber;
    private double kontostand;

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public void setKontoinhaber(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
        kontostand = 0;

    }

    public double getKontostand() {

        return kontostand;

    }

    public void setKontostand(double kontostand) {

        kontostand = kontostand;
    }

   public void aufbuchen(double betrag) {
        if(betrag > 0) { kontostand = kontostand + betrag; }
        else {
            System.out.println("Nur Werte > 0 sind erlaubt");
        }
        
   }

}
