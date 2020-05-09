package symulacja;

import Mapa.Mapa;
import jednostka.Dorosly;
import jednostka.Dziecko;
import jednostka.Jednostka;
import jednostka.Zwierze;
import pole.Pozywienie;
import pole.Schronienie;
import pole.Skaly;
import pole.Woda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Symulacja {
    private Mapa mapa;
    private List<Jednostka>listaJednostek=new ArrayList<>();

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
    }
    public void tura(List<Jednostka>listaJednostek)
    {
        double odleglosc;
        int licznikTur=1;
        //int licznikJednostek=0;
        while (listaJednostek.size()>=1){
        //while (licznikTur<5){
            System.out.println("Tura "+licznikTur+":");
        for (int i=0;i<listaJednostek.size();i++)
        {
                listaJednostek.get(i).tablica[0] = listaJednostek.get(i).tablica[2];
                listaJednostek.get(i).tablica[1] = listaJednostek.get(i).tablica[3];
                System.out.println(listaJednostek.get(i).imie + ":");
                System.out.println("Obecna lokalizacja: Pole[" + listaJednostek.get(i).tablica[0] + "][" + listaJednostek.get(i).tablica[1] + "]");
                if(listaJednostek.get(i).Lokalizacja.getClass()==Pozywienie.class)
                    System.out.println("Rodzaj pola: Pozywienie");
                if(listaJednostek.get(i).Lokalizacja.getClass()==Schronienie.class)
                    System.out.println("Rodzaj pola: Schronienie");
                if(listaJednostek.get(i).Lokalizacja.getClass()==Skaly.class)
                    System.out.println("Rodzaj pola: Skaly");
                if(listaJednostek.get(i).Lokalizacja.getClass()==Woda.class)
                    System.out.println("Rodzaj pola: Woda");
                do {
                    listaJednostek.get(i).Lokalizacja = listaJednostek.get(i).pobierzNowaLokalizacje(mapa.tablicaPol, mapa.dlugosc, mapa.szerokosc);
                    System.out.println("Nowa lokalizacja: Pole[" + listaJednostek.get(i).tablica[2] + "][" + listaJednostek.get(i).tablica[3] + "]");
                    if(listaJednostek.get(i).Lokalizacja.getClass()==Pozywienie.class)
                        System.out.println("Rodzaj pola: Pozywienie");
                    if(listaJednostek.get(i).Lokalizacja.getClass()==Schronienie.class)
                        System.out.println("Rodzaj pola: Schronienie");
                    if(listaJednostek.get(i).Lokalizacja.getClass()==Skaly.class)
                        System.out.println("Rodzaj pola: Skaly");
                    if(listaJednostek.get(i).Lokalizacja.getClass()==Woda.class)
                        System.out.println("Rodzaj pola: Woda");
                    odleglosc = listaJednostek.get(i).obliczOdleglosc(listaJednostek.get(i));
                    System.out.println("Odleglosc: " + odleglosc);
                    if (!listaJednostek.get(i).czyDobraOdlegosc(odleglosc))
                        System.out.println("Za daleko. Pobieranie nowej lokalizacji...");
                } while (!listaJednostek.get(i).czyDobraOdlegosc(odleglosc));
                listaJednostek.get(i).poziomWytrzymalosci=listaJednostek.get(i).zmniejszWytrzymalosc(odleglosc);
                if(listaJednostek.get(i).Lokalizacja.getClass()==Pozywienie.class)
                {
                    if(listaJednostek.get(i).poziomGlodu>=10)
                    listaJednostek.get(i).poziomGlodu=listaJednostek.get(i).zmniejszGlod();
                }
                else if(listaJednostek.get(i).Lokalizacja.getClass()==Schronienie.class)
                {
                    if(listaJednostek.get(i).poziomWytrzymalosci<=90)
                    listaJednostek.get(i).poziomWytrzymalosci=listaJednostek.get(i).zwiekszWytrzymalosc();
                }
                else if(listaJednostek.get(i).Lokalizacja.getClass()==Skaly.class)
                {
                    if(listaJednostek.get(i).poziomZdrowia>=20)
                    listaJednostek.get(i).poziomZdrowia=listaJednostek.get(i).zmniejszZdrowie();
                    if(listaJednostek.get(i).poziomGlodu<=80)
                    listaJednostek.get(i).poziomGlodu=listaJednostek.get(i).zwiekszGlod();
                }
                else if(listaJednostek.get(i).Lokalizacja.getClass()==Woda.class)
                {
                    if(listaJednostek.get(i).poziomZdrowia<=90)
                    listaJednostek.get(i).poziomZdrowia=listaJednostek.get(i).zwiekszZdrowie();
                }
                System.out.println("Poziom wytrzymalosci:"+listaJednostek.get(i).poziomWytrzymalosci);
                System.out.println("Poziom zdrowia:"+listaJednostek.get(i).poziomZdrowia);
                System.out.println("Poziom glodu:"+listaJednostek.get(i).poziomGlodu);
                if(listaJednostek.get(i).poziomWytrzymalosci<=0||listaJednostek.get(i).poziomZdrowia<=0||listaJednostek.get(i).poziomGlodu>=100)
                    {
                        System.out.println("Jednostka "+listaJednostek.get(i).imie+ " umiera");
                        listaJednostek.remove(i);
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
        symulacja.startSymulacji(symulacja.listaJednostek);//symulacja.listaJednostek);
        symulacja.tura(symulacja.listaJednostek);
    }
}
