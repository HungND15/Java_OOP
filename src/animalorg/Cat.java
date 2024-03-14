package animalorg;

public class Cat extends TerrestrialAnimal implements Color {

    @Override
    public void sound() {
        System.out.println("The cat is making meow-meow sound.");
    }

    @Override
    public void color() {
        System.out.println("The cat is black");
    }
}
