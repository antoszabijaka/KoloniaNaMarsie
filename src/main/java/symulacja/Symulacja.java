package symulacja;

import Mapa.Mapa;
import jednostka.Dorosly;
import jednostka.Dziecko;
import jednostka.Jednostka;
import jednostka.Zwierze;
import java.util.LinkedList;
import java.util.List;


public class Symulacja {
    public static void main(String[] args)
    {
        List<Jednostka>listaJednostek=new LinkedList<>();
        Mapa mapa = new Mapa();
        mapa.losujkonfiguracje(mapa.tablica);
        mapa.rozmiescPola(mapa.tablicaPol);
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
        while (listaJednostek.size()<=1)
        {
            for (Jednostka jednostka :listaJednostek) {
               jednostka.pobierzNowaLokalizacje(mapa.tablicaPol,10,10);
            }
        }
        System.out.println("ZBIJEW TO ZIOMAL");
        for (int i=0;i<mapa.dlugosc;i++)
        { for(int j=0;j<mapa.szerokosc;j++)
                System.out.println("tablica["+i+"]["+j+"]="+mapa.tablica[i][j]);}
    }
}
