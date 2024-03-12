public class AnimalManager {
    public Animal animal;

    public AnimalManager(Animal animal) {
        this.animal = animal;
    }

    public void soundOut(){
        animal.sound();
    }
}
