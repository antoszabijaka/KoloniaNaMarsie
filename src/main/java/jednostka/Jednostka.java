package jednostka;

import Mapa.Mapa;
import pole.Pole;
import symulacja.Symulacja;

import java.util.List;
import java.util.Random;

public abstract class Jednostka implements IJednostka {

    public int[]tablica;
    public Pole Lokalizacja;
    public Pole nowaLokalizacja;
    private Random generator = new Random();
    private int poziomZdrowia;
    private int poziomWytrzymalosci;
    private int poziomGlodu;
    public Jednostka(Mapa mapa, int poziomZdrowia, int poziomWytrzymalosci, int poziomGlodu, Pole Lokalizacja)
    {
        this.Lokalizacja=Lokalizacja;
        this.poziomZdrowia=poziomZdrowia;
        this.poziomWytrzymalosci=poziomWytrzymalosci;
        this.poziomGlodu=poziomGlodu;
    }
    public int zwiekszZdrowie()
    {
        return poziomZdrowia+10;
    }
    public int zmniejszZdrowie() { return poziomZdrowia-10; }
    public int zwiekszWytrzymalosc()
    {
        return poziomWytrzymalosci+10;
    }
    public int zmniejszWytrzymalosc()
    {
        return poziomWytrzymalosci-10;
    }
    public int zwiekszGlod()
    {
        return poziomGlodu+10;
    }
    public int zmniejszGlod()
    {
        return poziomGlodu-10;
    }
    public double obliczOdlegloscPoczatkowa(Jednostka jednostka)
    {
        double odlegloscPoczatkowa;
        odlegloscPoczatkowa = Math.sqrt(Math.pow(jednostka.tablica[0],2)+Math.pow(jednostka.tablica[1],2));
        return odlegloscPoczatkowa;
    }
    public Pole pobierzNowaLokalizacje(Pole[][]tablicaPol,int dlugosc, int szerokosc)
    {
        int i=generator.nextInt(szerokosc);
        tablica[0]=i;
        int j=generator.nextInt(dlugosc);
        tablica[1]=j;
        return tablicaPol[i][j];
    }

}
