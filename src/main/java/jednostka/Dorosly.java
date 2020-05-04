package jednostka;

import Mapa.Mapa;

public class Dorosly extends Jednostka {
    public String imie;
    public Dorosly(Mapa mapa, int iloscZdrowia, int poziomWytrzymalosci, int poziomGlodu, String imie)
    {
        super(mapa,iloscZdrowia,poziomWytrzymalosci,poziomGlodu);
        this.imie=imie;
    }
}
