public class Teacher extends User{
    private int teacherNo;
    private double rate;
    private int balance;

    public Teacher(String userName, String password, int teacherNo, double rate, int balance) {
        super(userName, password);
        this.teacherNo = teacherNo;
        this.rate = rate;
        this.balance = balance;
    }

    public int getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(int teacherNo) {
        this.teacherNo = teacherNo;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void showStudents(){
        System.out.println("Students Listed!");
    }

    public void withdrawMoney(int amount){
        this.balance -= amount;
        System.out.println("Money Withdrew");
    }

    @Override
    public void login(String userName, String password) {
        if(this.getUserName().equals(userName) && this.getPassword().equals(password)){
            System.out.println("Login Successful, Forwarding to the Teacher Panel.");
        }
        else{
            System.out.println("Login Unsuccessful");
        }
    }



}
