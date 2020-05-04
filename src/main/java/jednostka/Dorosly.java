package jednostka;

import Mapa.Mapa;
import pole.Pole;

public class Dorosly extends Jednostka {
    public String imie;
    public Dorosly(Mapa mapa, int iloscZdrowia, int poziomWytrzymalosci, int poziomGlodu, Pole lokalizacja, String imie)
    {
        super(mapa,iloscZdrowia,poziomWytrzymalosci,poziomGlodu,lokalizacja);
        this.imie=imie;
    }
}
