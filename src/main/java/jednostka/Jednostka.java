package jednostka;

import Mapa.Mapa;
import pole.Pole;
import java.util.Random;

public abstract class Jednostka implements IJednostka {

    public int[]tablica = {0,0,0,0};
    public Pole Lokalizacja;
    private Random generator = new Random();
    public String imie;
    public int poziomZdrowia;
    public int poziomWytrzymalosci;
    public int poziomGlodu;
    public Jednostka(int poziomZdrowia, int poziomWytrzymalosci, int poziomGlodu, Pole Lokalizacja, String imie)
    {
        this.imie=imie;
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
    public double obliczOdleglosc(Jednostka jednostka)
    {
        double odleglosc;
        odleglosc = Math.sqrt(Math.pow((jednostka.tablica[2]-jednostka.tablica[0]),2)+Math.pow((jednostka.tablica[3]-jednostka.tablica[1]),2));
        return odleglosc;
    }
    public boolean czyDobraOdlegosc(double odleglosc)
    {
        if(odleglosc<=10)
            return true;
        else if(odleglosc>10)
            return false;
        else return false;
    }
    public Pole pobierzNowaLokalizacje(Pole[][]tablicaPol,int dlugosc, int szerokosc)
    {
        int i=generator.nextInt(szerokosc);
        tablica[2]=i;
        int j=generator.nextInt(dlugosc);
        tablica[3]=j;
        return tablicaPol[i][j];
    }

}
