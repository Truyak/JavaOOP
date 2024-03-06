public class Student {
    private String name;
    private String surname;
    private int age;
    private int number;
    private int semester;
    private double grade;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 100)
            this.age = age;
        else
            System.out.println("Please Enter A Valid Age!");
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        if(semester > 0 && semester < 13)
            this.semester = semester;
        else
            System.out.println("Please Enter A Valid Semester Level!");
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade > 0 && grade <= 4)
            this.grade = grade;
        else
            System.out.println("Please Enter A Valid Grade!");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number > 0)
            this.number = number;
        else
            System.out.println("Please Enter A Valid Student Number!");
    }

    public void printStudent(){
        System.out.print(name + " " + surname + ",\n" + age + " Years,\n" + number + ",\n" + name + " is on the "
        + semester + " semester with " + grade + " grade.");
    }
}
