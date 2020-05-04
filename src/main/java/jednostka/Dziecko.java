package jednostka;

import Mapa.Mapa;

public class Dziecko extends Jednostka {
    public String imie;
    public Dziecko(Mapa mapa, int iloscZdrowia, int poziomWytrzymalosci, int poziomGlodu, String imie)
    {
        super(mapa, iloscZdrowia, poziomWytrzymalosci, poziomGlodu);
        this.imie=imie;
    }
}
