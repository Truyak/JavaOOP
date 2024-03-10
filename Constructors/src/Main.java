public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student ahmet = new Student("Ahmet", "Gözüpek", 1504, 2010);

        System.out.println("Student: "+ student.toString());
        System.out.println("Ahmet: "+ ahmet.toString());

    }
}