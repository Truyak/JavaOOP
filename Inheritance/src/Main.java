public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kerem", "1610Ke", 4);
        Teacher teacher = new Teacher("Fetih", "1234AA", 1610, 4.3, 623);

        System.out.println(teacher.getUserName());
        System.out.println(student.getUserName());

        student.login("Kerem", "1610Ke");
        teacher.login("Fetih", "1234AA");
        student.rate();
    }
}