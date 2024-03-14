package animalorg;

public class Main {
    public static void main(String[] args) {
        TerrestrialAnimal pig = new Pig();
        pig.sound();
        pig.setName("The pig");
        pig.move(NumberOfLeg.FOURLEGS, pig.getName());

        Dog dog = new Dog();
        dog.color();
        dog.setName("Mic");
        // If dog name is equal Mic, then play with Mic
        if (dog.getName().equals("Mic")) {
            dog.doQuest("Take care children");
        } else if (dog.getName().equals("Rex")) {
            dog.doQuest("Catch thieves");
        } else {
            dog.doQuest("Take care house!");
        }
        int x = 0;
        switch (dog.getName()) {
            case "Mic":
                dog.doQuest("Take care children");
                x = 1;
                break;
            case "Rex":
                dog.doQuest("Catch thieves");
                x = 2;
                break;
            default:
                dog.doQuest("Take care house!");
        }
        System.out.println(x);
    }
}
