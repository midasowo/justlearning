package eu.emidas.zoo;

public class Dog extends Mammal {

    public String bark() {
        return "I'm barking";
    }

    @Override
    public String eat() {
        return "I'm eating purina";
    }

    @Override
    public String makeSound() {
        return bark();
    }
}
