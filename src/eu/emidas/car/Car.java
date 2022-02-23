package eu.emidas.car;

public class Car {

    public final String marka;
    public final String model;
    public final int liczbaDrzwi;
    int predkoscMax;
    int predkoscAktualna;
    Engine engine;

    public Car(String marka, String model, int liczbaDrzwi, int predkoscMax, Engine engine) {
        this.marka = marka;
        this.model = model;
        this.liczbaDrzwi = liczbaDrzwi;
        this.predkoscMax = predkoscMax;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "to jest auto: " + marka + " " + model + " który ma " + liczbaDrzwi + " drzwi" + " oraz ma " + predkoscAktualna + " km/h";
            }

    public String czyJedzie(){
        if (predkoscAktualna>0){
            return "to auto jedzie";
        }
        else{
            return "to auto stoi";
        }
    }
    public void przyspiesz(int v){
        if (engine.czyWlaczony){
        predkoscAktualna=predkoscAktualna+v;
        if (predkoscAktualna>predkoscMax){
            predkoscAktualna=predkoscMax;
            System.out.println("To nie wyścigówka");}
        } else {System.out.println("Silnik jest wyłączony");}


    }

    public void przekrecKlucz() {
        if (engine.czyWlaczony) {
            if (predkoscAktualna > 0) {
                System.out.println("Najpierw się zatrzymaj!");
            } else {
                engine.czyWlaczony = false;
            }
        } else {
            engine.czyWlaczony = true;
        }
    }


    public void zwolnij(int v){
        if (predkoscAktualna<=v) {
            predkoscAktualna = 0;
        }
        else {
            predkoscAktualna=predkoscAktualna-v;
        }
            }

    public static void main(String[] args) {
        Engine engineMazdy = new Engine("benzyna", 4,2.0,false,180);
        Car autoMileny = new Car ("Mazda", "CX30", 5, 200, engineMazdy);
        System.out.println(autoMileny.toString());
        System.out.println(autoMileny);
        autoMileny.predkoscAktualna=0;
        System.out.println(autoMileny);
        System.out.println(autoMileny.czyJedzie());
        autoMileny.przekrecKlucz();
        autoMileny.przyspiesz(200);
        System.out.println(autoMileny);
        System.out.println(autoMileny.czyJedzie());
        autoMileny.przekrecKlucz();
        System.out.println(autoMileny);
        autoMileny.zwolnij(50);
        autoMileny.przekrecKlucz();
        System.out.println(autoMileny.czyJedzie());
        System.out.println(autoMileny.predkoscAktualna);
        autoMileny.zwolnij(180);
        System.out.println(autoMileny.predkoscAktualna);
        autoMileny.przekrecKlucz();
        System.out.println(autoMileny.czyJedzie());
        System.out.println(autoMileny);



    }
}
