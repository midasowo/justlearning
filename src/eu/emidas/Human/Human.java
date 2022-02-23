package eu.emidas.Human;

public class Human {

    public static final String SPECIES="homo sapiens";
    public String name;
    private String surname;
    private int age;
    private boolean isMale;

    public Human() {
    }

    public Human(String name, String surname, int age, boolean isMale) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void sayHello(){
        System.out.println("Cześć, jestem " + name);
    }
    public void sayHello(String str){
            System.out.println(str+" jestem "+ name);
    }





    public static void main(String[] args) {
        Human krzysztof = new Human();
        System.out.println(krzysztof.name);
        System.out.println(krzysztof.surname);
        System.out.println(krzysztof.age);
        System.out.println(krzysztof.isMale);
        krzysztof.name="Krzysztof";
        System.out.println(krzysztof.name);
    }



}
