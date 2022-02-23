package eu.emidas.Human;

public class Test {


    public static void main(String[] args) {
        Human krzysztof = new Human();
        System.out.println(krzysztof.name);
        System.out.println(krzysztof.getSurname());
        //System.out.println(krzysztof.age);
        //System.out.println(krzysztof.isMale);
        krzysztof.name="Krzysztof";
        krzysztof.setSurname("Jeżyna");
        System.out.println(krzysztof.name);
        System.out.println(krzysztof.getSurname());

        krzysztof.sayHello();

        Human milena = new Human("Milena","Dżabłońska",30, false);
        milena.sayHello();
        milena.sayHello("siemanko");
    }
}
