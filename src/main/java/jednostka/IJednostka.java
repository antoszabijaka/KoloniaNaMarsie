package jednostka;

import pole.Pole;

public interface IJednostka {

    Pole pobierzNowaLokalizacje(Pole[][]tablicaPol,int dlugosc, int szerokosc);
    int zmniejszGlod();
    int zwiekszGlod();
    int zwiekszWytrzymalosc();
    int zmniejszWytrzymalosc();
    int zwiekszZdrowie();
    int zmniejszZdrowie();
}
