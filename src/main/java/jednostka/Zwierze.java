package jednostka;

import Mapa.Mapa;

public class Zwierze extends Jednostka {
    public String nazwa;
    public Zwierze(Mapa mapa, int iloscZdrowia, int poziomWytrzymalosci, int poziomGlodu, String nazwa)
    {
        super(mapa, iloscZdrowia, poziomWytrzymalosci, poziomGlodu);
        this.nazwa=nazwa;
    }
}
