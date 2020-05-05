package symulacja;

import Mapa.Mapa;
import jednostka.Dorosly;
import jednostka.Dziecko;
import jednostka.Jednostka;
import jednostka.Zwierze;
import pole.Pole;
import pole.Skaly;

import java.util.LinkedList;
import java.util.List;



public class Symulacja {
    private Mapa mapa;
    private List<Jednostka>listaJednostek=new LinkedList<>();

    public void startSymulacji(List<Jednostka>listaJednostek)
    {
        mapa.losujkofiguracje(mapa.tablica);
        mapa.rozmiescpola(mapa.tablicaPol);
        Dorosly mezczyzna = new Dorosly(mapa,100,100,0, mapa.tablicaPol[0][0],"Zbigniew");
        Dorosly kobieta = new Dorosly(mapa,100,100,0, mapa.tablicaPol[0][0],"Katarzyna");
        Dziecko dziecko = new Dziecko(mapa,100,100,0, mapa.tablicaPol[0][0],"Ludwik");
        Zwierze owca = new Zwierze(mapa,100,100,0 , mapa.tablicaPol[0][0],"Beczka");
        Zwierze swinia = new Zwierze(mapa,100,100,0, mapa.tablicaPol[0][0],"Chrumkas");
        listaJednostek.add(mezczyzna);
        listaJednostek.add(kobieta);
        listaJednostek.add(dziecko);
        listaJednostek.add(owca);
        listaJednostek.add(swinia);
        tura();
    }
    public void tura()
    {   while(listaJednostek.size()>=1)
        for (Jednostka jednostka:listaJednostek) {
            jednostka.nowaLokalizacja=jednostka.pobierzNowaLokalizacje(mapa.tablicaPol,mapa.dlugosc,mapa.szerokosc);
            
        }
    }
    public Symulacja(Mapa mapa)
    {
        this.mapa=mapa;
    }
    public static void main(String[] args)
    {
        Mapa mapa = new Mapa();
        Symulacja symulacja = new Symulacja(mapa);
        symulacja.startSymulacji(symulacja.listaJednostek);
    }
}
