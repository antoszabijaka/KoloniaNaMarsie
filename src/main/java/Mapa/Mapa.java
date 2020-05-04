package Mapa;

import pole.*;

import java.util.Random;

public class Mapa {
    public int dlugosc=10;
    public int szerokosc=10;

    public Pole[][] tablicaPol = new Pole[dlugosc][szerokosc];
    public int[][]tablica = new int[dlugosc][szerokosc];
    public Mapa()//Pole[][]tablicaPol,int[][]tablica)
    {
        //this.tablica=tablica;
        //Mapa.tablicaPol = tablicaPol;
        //losujkonfiguracje(tablica);
        //rozmiescPola(tablicaPol);
    }

    public void losujkonfiguracje(int[][]tablica)
    {
        //int licznik2=0;
        Random generator = new Random();
        for (int i=0;i<dlugosc;i++)
        for (int j=0;j<szerokosc;j++)
        {
            tablica[i][j]=generator.nextInt(4);
            //if(tablica[i][j]==0) licznik2++;
            //System.out.println(licznik2);
            //System.out.println(tablica[i][j]);
        }
    }
    public void rozmiescPola(Pole[][]tablicaPol)
    {
        //int licznik=0;
        for(int i=0;i<dlugosc;i++)
        for(int j=0;j<szerokosc;j++)
        {
            if(tablica[i][j]==0)
            {tablicaPol[i][j] = new Schronienie(i, j);}//licznik++;System.out.println("jestemfajny"+licznik);}
            else if(tablica[i][j]==1)
                tablicaPol[i][j] = new Pozywienie(i,j,10);
            else if(tablica[i][j]==2)
                tablicaPol[i][j] = new Skaly(i,j);
            else if(tablica[i][j]==3)
                tablicaPol[i][j] = new Woda(i,j,10);
        }
    }
}
