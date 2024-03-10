public class Animal {
    private int id;
    private String name;
    private int age;

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Animal() {
        this.id = 0;
        this.name = "Undefined Name ";
        this.age = -1;
    }

    public void giveWater(){
        System.out.println(this.name + " is drinking water");
    }

    public void vaccine(){
        System.out.println(this.name + " vaccined.");
    }

    public void clean(){
        System.out.println(this.name + " cleaned.");
    }

    public void giveFood(String food){
        System.out.println(this.name + " " + food + " given");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
