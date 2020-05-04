package jednostka;

import Mapa.Mapa;
import pole.Pole;

public class Zwierze extends Jednostka {
    public String nazwa;
    public Zwierze(Mapa mapa, int iloscZdrowia, int poziomWytrzymalosci, int poziomGlodu, Pole lokalizacja, String nazwa)
    {
        super(mapa, iloscZdrowia, poziomWytrzymalosci, poziomGlodu, lokalizacja);
        this.nazwa=nazwa;
    }
}
