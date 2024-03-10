public class Horse extends Animal{
    private double legLength;
    private double speed;

    public Horse(int id, String name, int age, double legLength, double speed) {
        super(id, name, age);
        this.legLength = legLength;
        this.speed = speed;
    }

    public Horse(double legLength, double speed) {
        this.legLength = legLength;
        this.speed = speed;
    }

    public Horse() {
        this.legLength = 0;
        this.speed = 0;
    }

    public Horse(int id, String name, int age) {
        super(id, name, age);
    }

    public void changeHorseShoe(){
        System.out.println("HorseShoe Changed.");
    }

    public void train(){
        System.out.println("Trained.");
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
