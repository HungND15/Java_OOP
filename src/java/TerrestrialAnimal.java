package java;

public class TerrestrialAnimal extends Animal {
    @Override
    public void sound() {
        System.out.println("The terrestrial animal is making a sound.");
    }
    public void move(NumberOfLeg numberOfLeg, String name) {
        System.out.println(name + " moves = " + numberOfLeg);
    }
}
