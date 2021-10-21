import java.util.Locale;
import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int year;
    private String studentID;
    private String courses;
    private int tuitionbalance = 0;
    private static int costofcourse = 600;
    private static int id = 100;


    //constructor prompt user the name and year
    public Student() {
        Scanner n = new Scanner(System.in);
        System.out.println("please enter student first name: ");
        this.firstname = n.nextLine();
        System.out.println("please enter student lastname: ");
        this.lastname = n.nextLine();
        System.out.println("please enter year:\n1-freshman\n2-Sophomore\n3-Junior\n4-Senior ");
        this.year = n.nextInt();
        setStudentID();
        System.out.println(firstname + " " + lastname + " " + year + " " + studentID);


    }

    //generate an id
    private void setStudentID() {
        id++;
        this.studentID = year + "" + id;
    }

    //enroll in courses
    public void enrol() {
        do {
            System.out.println("please enter course to enroll or Q to quit");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            course = course.toUpperCase();
            System.out.println(course);
            if (!course.equals("Q")) {
                System.out.println("in loop");
                courses += "\n" + course;
                tuitionbalance += costofcourse;
            } else {
                System.out.println("break");
                break;
            }
            System.out.println("enroll in " + courses);
            System.out.println("Tuition balance:" + tuitionbalance);
        } while (1 != 0);

    }

    //view balance and pay tuition
    public int viewBalance() {
        System.out.println("the balance if the student is: " + tuitionbalance);
        return tuitionbalance;
    }

    // method called to generate the balance;
    public void payTuition() {
        double payment = 0.0;
        System.out.println("your total balance is" + tuitionbalance + "\n How much would you like to pay");
        Scanner r = new Scanner(System.in);
        int input = r.nextInt();
        if (input >= 0) {
            tuitionbalance = tuitionbalance - input;
            System.out.println("Thank you for your payment of  "+ input);
        }
    }
    //show status

}
