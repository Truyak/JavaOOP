import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student st = new Student();

        do{
            System.out.print("Please Enter Your Name: ");
            st.setName(scan.nextLine());
        }while(st.getName() == null);
        do{
            System.out.print("Please Enter Your Surname: ");
            st.setSurname(scan.nextLine());
        }while(st.getSurname() == null);
        do{
            System.out.print("Please Enter Your Age: ");
            st.setAge(scan.nextInt());
        }while(st.getAge() == 0);
        do{
            System.out.print("Please Enter Your Student Number: ");
            st.setNumber(scan.nextInt());
        }while(st.getNumber() == 0);
        do{
            System.out.print("Please Enter Your Semester Level: ");
            st.setSemester(scan.nextInt());
        }while(st.getSemester() == 0);
        do{
            System.out.print("Please Enter Your Grade: ");
            st.setGrade(scan.nextDouble());
        }while(st.getGrade() == 0);

        st.printStudent();

    }
}