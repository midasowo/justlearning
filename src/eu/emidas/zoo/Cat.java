package eu.emidas.zoo;

public class Cat extends Mammal {

    private String moaw(){
        return "I'm moawing";
    }

    @Override
    public String eat() {
        return "I'm eating whiskas";
    }

    @Override
    public String makeSound() {
        return moaw();
    }
}
