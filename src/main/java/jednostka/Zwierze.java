package jednostka;

import Mapa.Mapa;
import pole.Pole;

public class Zwierze extends Jednostka {
    public Zwierze(int iloscZdrowia, int poziomWytrzymalosci, int poziomGlodu, Pole lokalizacja, String imie)
    {
        super( iloscZdrowia, poziomWytrzymalosci, poziomGlodu, lokalizacja,imie);
    }

    @Override
    public int zmniejszWytrzymalosc() {
        return 0;
    }
}
