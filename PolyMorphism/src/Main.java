public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        AnimalManager animalManager1 = new AnimalManager(animal);
        animalManager1.soundOut();
        AnimalManager animalManager2 = new AnimalManager(dog);
        animalManager2.soundOut();
        AnimalManager animalManager3 = new AnimalManager(cat);
        animalManager3.soundOut();
    }
}