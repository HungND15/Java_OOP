public class Pig extends TerrestrialAnimal implements Color {

    @Override
    public void sound() {
        System.out.println("The pig is making oink-oink sound.");
    }

    @Override
    public void color() {
        System.out.println("The pig is pink");
    }
}
