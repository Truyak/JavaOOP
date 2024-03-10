public class Sheep extends Animal {
    private String woolColor;

    public Sheep(int id, String name, int age, String woolColor) {
        super(id, name, age);
        this.woolColor = woolColor;
    }

    public Sheep(String woolColor) {
        this.woolColor = woolColor;
    }

    public Sheep(int id, String name, int age) {
        super(id, name, age);
        this.woolColor = "Undefined Color";
    }

    public Sheep() {
        this.woolColor = "Undefined";
    }

    public void crop(){
        System.out.println("Sheep with " + this.woolColor + " wool has cropped.");
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }
}
