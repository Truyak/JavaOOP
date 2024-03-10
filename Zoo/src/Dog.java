public class Dog extends Animal{

    public Dog(int id, String name, int age) {
        super(id, name, age);
    }

    public Dog() {
        System.out.println("Didn't give anything.");
    }

    public void walk(){
        System.out.println("Walked.");
    }

    public void train(){
        System.out.println("Trained.");
    }

    @Override
    public void vaccine() {
        super.vaccine();
        System.out.println("Rabies vaccination was also given");
    }
}
