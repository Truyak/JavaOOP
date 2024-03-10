public class Student {
    private String name;
    private String surname;
    private int studentNo;
    private int birthYear;

    public Student(String name, String surname, int studentNo, int birthYear){
        this.name = name;
        this.surname = surname;
        this.studentNo = studentNo;
        this.birthYear = birthYear;
    }

    public Student(){
        this.name = "Undefined";
        this.surname = "Undefined";
        this.studentNo = -1;
        this.birthYear = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentNo=" + studentNo +
                ", birthYear=" + birthYear +
                '}';
    }
}
