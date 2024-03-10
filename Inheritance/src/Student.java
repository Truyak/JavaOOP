public class Student extends User{
    private int courseNumber;

    public Student(String userName, String password, int courseNumber) {
        super(userName, password);
        this.courseNumber = courseNumber;
    }

    public void rate(){
        System.out.println("Rated!");
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public void login(String userName, String password) {
        if(this.getUserName().equals(userName) && this.getPassword().equals(password)){
            System.out.println("Login Successful, Forwarding to the Student Panel.");
        }
        else{
            System.out.println("Login Unsuccessful");
        }
    }
}
