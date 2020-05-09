package jednostka;

import Mapa.Mapa;
import pole.Pole;

public class Dorosly extends Jednostka {
    public Dorosly(int iloscZdrowia, int poziomWytrzymalosci, int poziomGlodu, Pole lokalizacja, String imie)
    {
        super(iloscZdrowia,poziomWytrzymalosci,poziomGlodu,lokalizacja,imie);
    }

    @Override
    public int zmniejszWytrzymalosc() {
        return 0;
    }
}
