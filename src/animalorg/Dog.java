package animalorg;

public class Dog extends TerrestrialAnimal implements Color {

    @Override
    public void sound() {
        System.out.println("The dog is making woof-woof sound.");
    }

    @Override
    public void color() {
        System.out.println("The dog is yellow");
    }

    public void doQuest(String questName) {
        System.out.println("This dog is doing " + questName);
    }
}
