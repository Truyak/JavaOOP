public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Ceo ceo = new Ceo();


        student.signUp();
        student.login("admin", "admin1");
        teacher.signUp();
        ceo.signUp();
        ceo.login("admin", "admin12");
    }
}