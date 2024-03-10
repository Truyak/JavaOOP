public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(25, "Mark", 7);
        Sheep sheep = new Sheep("Purple");
        Horse horse = new Horse(1250, "Atik", 12, 1.2, 25);

        dog.train();
        sheep.crop();
        horse.changeHorseShoe();
        System.out.println("Leg Length of the " + horse.getName() + " is " + horse.getLegLength() + "m.");
        dog.vaccine();
        sheep.giveFood("Grass");
        horse.giveFood("Oat");


    }
}