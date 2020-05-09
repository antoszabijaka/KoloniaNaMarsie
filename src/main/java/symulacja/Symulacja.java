package symulacja;

import Mapa.Mapa;
import jednostka.Dorosly;
import jednostka.Dziecko;
import jednostka.Jednostka;
import jednostka.Zwierze;
import java.util.LinkedList;
import java.util.List;



public class Symulacja {
    private Mapa mapa;
    private List<Jednostka>listaJednostek=new LinkedList<>();

    private void startSymulacji(List<Jednostka>listaJednostek)
    {
        Dorosly mezczyzna = new Dorosly(100,100,0, mapa.tablicaPol[0][0],"Zbigniew");
        Dorosly kobieta = new Dorosly(100,100,0, mapa.tablicaPol[0][0],"Katarzyna");
        Dziecko dziecko = new Dziecko(100,100,0, mapa.tablicaPol[0][0],"Ludwik");
        Zwierze owca = new Zwierze(100,100,0 , mapa.tablicaPol[0][0],"Beczka");
        Zwierze swinia = new Zwierze(100,100,0, mapa.tablicaPol[0][0],"Chrumkas");
        listaJednostek.add(mezczyzna);
        listaJednostek.add(kobieta);
        listaJednostek.add(dziecko);
        listaJednostek.add(owca);
        listaJednostek.add(swinia);
        tura();
    }
    public void tura()
    {
        double odleglosc;
        int licznikTur=0;
        //while(listaJednostek.size()>=1)
        for (Jednostka jednostka:listaJednostek) {
            if(licznikTur==0) {
                jednostka.tablica[0]=0;
                jednostka.tablica[1]=0;
                do {
                    jednostka.Lokalizacja = jednostka.pobierzNowaLokalizacje(mapa.tablicaPol, mapa.dlugosc, mapa.szerokosc);
                    odleglosc = jednostka.obliczOdleglosc(jednostka);
                    System.out.println("Odleglosc "+jednostka.imie+": ");
                    System.out.format("%.2f%n",odleglosc);
                    if(jednostka.czyDobraOdlegosc(odleglosc)==false)
                        System.out.println("Za daleko. Pobieranie nowej lokalizacji...");
                } while (!jednostka.czyDobraOdlegosc(odleglosc));
            }
        }
        licznikTur++;
    }

    private Symulacja(Mapa mapa)
    {
        this.mapa=mapa;
    }
    public static void main(String[] args)
    {
        Mapa mapa = new Mapa();
        Symulacja symulacja = new Symulacja(mapa);
        mapa.losujkofiguracje(mapa.tablica);
        mapa.rozmiescpola(mapa.tablicaPol);
        symulacja.startSymulacji(symulacja.listaJednostek);
    }
}
