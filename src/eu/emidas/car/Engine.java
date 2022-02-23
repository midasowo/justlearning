package eu.emidas.car;

public class Engine {

    public String rodzajPaliwa;
    public int iloscCylindrow;
    public double pojemnosc;
    public boolean czyTurbo;
    public int konieMech;
    public boolean czyWlaczony;

    public Engine(String rodzajPaliwa, int iloscCylindrow, double pojemnosc, boolean czyTurbo, int konieMech) {
        this.rodzajPaliwa = rodzajPaliwa;
        this.iloscCylindrow = iloscCylindrow;
        this.pojemnosc = pojemnosc;
        this.czyTurbo = czyTurbo;
        this.konieMech = konieMech;
    }
}
