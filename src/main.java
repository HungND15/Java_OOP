public class main {
    public static void main(String[] args) {
        TerrestrialAnimal pig = new Pig();
        pig.sound();
        pig.setName("The pig");
        pig.move(NumberOfLeg.FOURLEGS, pig.getName());

        Dog dog = new Dog();
        dog.color();
    }
}
