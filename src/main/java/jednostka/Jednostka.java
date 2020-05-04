package jednostka;

import Mapa.Mapa;
import pole.Pole;
import symulacja.Symulacja;

import java.util.Random;

public abstract class Jednostka {

    public Pole staraLokalizacja;
    public Pole nowaLokalizacja;
    private Random generator = new Random();
    private int poziomZdrowia;
    private int poziomWytrzymalosci;
    private int poziomGlodu;
    public Jednostka(Mapa mapa, int poziomZdrowia, int poziomWytrzymalosci, int poziomGlodu)
    {
        //Symulacja.mapa=mapa;
        this.poziomZdrowia=poziomZdrowia;
        this.poziomWytrzymalosci=poziomWytrzymalosci;
        this.poziomGlodu=poziomGlodu;
    }
    public int zwiekszZdrowie()
    {
        return poziomZdrowia+10;
    }
    public int zmniejszZdrowie()
    {
        return poziomZdrowia-10;
    }
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
    public Pole pobierzNowaLokalizacje(Pole[][]tablicaPol,int dlugosc, int szerokosc)
    {
        int i=generator.nextInt(szerokosc);
        int j=generator.nextInt(dlugosc);
        return tablicaPol[i][j];
    }




}
