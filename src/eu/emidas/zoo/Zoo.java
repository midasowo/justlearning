package eu.emidas.zoo;

public class Zoo {

    public static void main(String[] args) {

        Dog sonia = new Dog();
        Cat maniek = new Cat();
        Cat lila = new Cat();
        Fish nemo = new Fish();
        Animal kuba = new Cat();

        System.out.println(sonia.eat());
        System.out.println(lila.eat());
        System.out.println(maniek.eat());
        System.out.println(nemo.eat());


    }
}
