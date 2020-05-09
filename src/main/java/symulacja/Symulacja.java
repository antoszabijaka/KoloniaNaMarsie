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
        int licznikTur=1;
        //while(listaJednostek.size()>=1)
        while (licznikTur<5){
            System.out.println("Tura "+licznikTur+":");
        for (Jednostka jednostka:listaJednostek) {
            if (licznikTur == 1) {
                jednostka.tablica[0] = 0;
                jednostka.tablica[1] = 0;
                System.out.println(jednostka.imie + ":");
                System.out.println("Obecna lokalizacja: Pole[" + jednostka.tablica[0] + "][" + jednostka.tablica[1] + "]");
                do {
                    jednostka.Lokalizacja = jednostka.pobierzNowaLokalizacje(mapa.tablicaPol, mapa.dlugosc, mapa.szerokosc);
                    System.out.println("Nowa lokalizacja: Pole[" + jednostka.tablica[2] + "][" + jednostka.tablica[3] + "]");
                    odleglosc = jednostka.obliczOdleglosc(jednostka);
                    System.out.println("Odleglosc: " + odleglosc);
                    if (!jednostka.czyDobraOdlegosc(odleglosc))
                        System.out.println("Za daleko. Pobieranie nowej lokalizacji...");
                } while (!jednostka.czyDobraOdlegosc(odleglosc));
            } else {
                jednostka.tablica[0] = jednostka.tablica[2];
                jednostka.tablica[1] = jednostka.tablica[3];
                System.out.println(jednostka.imie + ":");
                System.out.println("Obecna lokalizacja: Pole[" + jednostka.tablica[0] + "][" + jednostka.tablica[1] + "]");
                do {
                    jednostka.Lokalizacja = jednostka.pobierzNowaLokalizacje(mapa.tablicaPol, mapa.dlugosc, mapa.szerokosc);
                    System.out.println("Nowa lokalizacja: Pole[" + jednostka.tablica[2] + "][" + jednostka.tablica[3] + "]");
                    odleglosc = jednostka.obliczOdleglosc(jednostka);
                    System.out.println("Odleglosc: " + odleglosc);
                    if (!jednostka.czyDobraOdlegosc(odleglosc))
                        System.out.println("Za daleko. Pobieranie nowej lokalizacji...");
                } while (!jednostka.czyDobraOdlegosc(odleglosc));
            }
        }
        licznikTur++;
        }
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
