package symulacja;

import Mapa.Mapa;
import jednostka.Dorosly;
import jednostka.Dziecko;
import jednostka.Jednostka;
import jednostka.Zwierze;
import pole.Skaly;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Symulacja {
    private Mapa mapa;

    public Symulacja(Mapa mapa)
    {
        this.mapa=mapa;
    }
    public static void main(String[] args)
    {
        Mapa mapa = new Mapa();
        Symulacja symulacja = new Symulacja(mapa);
    }
}
