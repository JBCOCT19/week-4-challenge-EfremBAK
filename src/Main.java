import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner key = new Scanner(System.in);

    //databases
    private static ArrayList<Admin> adminDB = new ArrayList<>();
    private static ArrayList<Student> studentDB = new ArrayList<>();
    private static ArrayList<Faculty> facultyDB = new ArrayList<>();

    //student Variables
   public static int sid ;
   public static String sname ;
    public static String semail ;
   public static  String spass;


    public static void main(String[] args) {

        buildAdminDB();
        buildStudentDB();
        buildFacultyDB();

        System.out.println("Welcome to Efrem's School System App!");
        while (true) { //login? y/n
            String userLogin = chooseLog();
            while (true) {//user chooses from admin/faculty/student
                if (userLogin.equalsIgnoreCase("y")) {//acount chooser
                    String userChoice = choosePerson();
                    if (userChoice.equalsIgnoreCase("a")) {
                        if (validateLogIn()) {
                            useAdmin(new Admin());
                        }
                    }
                    if (userChoice.equalsIgnoreCase("f")) {
                        useFaculty(new Faculty());
                    }
                    if (userChoice.equalsIgnoreCase("s")) {
                        useStudent(new Student());
                    }
                    if (userChoice.equalsIgnoreCase("q")) {
                        break;
                    }
                } // end account loop
                else if (userLogin.equalsIgnoreCase("n")) {
                    break;
                }
            }
            System.out.println("Bye Bye  from App!");
            break;

        }


    }

    private static void buildFacultyDB() {
        facultyDB.add(new Faculty(001, "Efrem", "efrembak@yahoo.com", "pass123"));
        facultyDB.add(new Faculty(002, "Berhane", "berhane@yahoo.com", "pass124"));
        facultyDB.add(new Faculty(001, "Efrem", "efrembak@yahoo.com", "pass123"));


    }

    private static void buildStudentDB() {

    }

    private static void buildAdminDB() {
        adminDB.add(new Admin("ad1", "pa1"));
        adminDB.add(new Admin("ad2", "pa2"));

    }  // list of admins

    private static void useStudent(Student student) {

        String userStr;
        System.out.println(student.login());
        System.out.println("You're in class!");
        System.out.println();

        while (true) {
            // use as student
            System.out.println("Would you like to learn (\"y\") or logout from your account (\"n\")?");
            userStr = key.nextLine();
            if (userStr.equalsIgnoreCase("y")) {
                System.out.println(addStudent());
            } else if (userStr.equalsIgnoreCase("n")) {
                System.out.println(student.logout());
                break;
            }
        }
    } //using the student class

    private static void useFaculty(Faculty faculty) {

        String userStr;
        System.out.println(faculty.login());
        System.out.println("You're in staff office");
        System.out.println();

        while (true) {
            // use as student
            System.out.println("Do you feel like teaching (\"t\") or logout from your account (\"x\")?");
            userStr = key.nextLine();
            if (userStr.equalsIgnoreCase("t")) {
                System.out.println(faculty.method1());
                ;
            } else if (userStr.equalsIgnoreCase("x")) {
                System.out.println(faculty.logout());
                ;
                break;
            }
        }
    } //use faculty class

    private static void useAdmin(Admin admin) {

        String userStr;
        System.out.println(admin.login());
        System.out.println("What would you like to do today?");

        while (true) {
            System.out.print("options \n" +
                    "\t[\"1\"] - Add Student\n" +
                    "\t[\"2\"] - Add Faculty\n" +
                    "\t[\"3\"] - Edit Student\n" +
                    "\t[\"4\"] - Edit Faculty\n" +
                    "\t[\"5\"] - Add Class\n" +
                    "\t[\"6\"] - Edit Class\n" +
                    "\t[\"7\"] - Enroll Student\n" +
                    "\t[\"8\"] - Hire a Faculty\n" +
                    "\t[\"9\"] View All information\n" +
                    "\t Enter \"Q\" to Quit ");
            System.out.println();
            userStr = key.nextLine();

            if (userStr.equalsIgnoreCase("1")) {
               addStudent();
                System.out.println(addStudent());
            } else if (userStr.equalsIgnoreCase("2")) {
                System.out.println(admin.method2());
                ;
            } else if (userStr.equalsIgnoreCase("3")) {
                System.out.println(admin.method3());
                ;
            } else if (userStr.equalsIgnoreCase("4")) {
                System.out.println(admin.method4());
                ;
            } else if (userStr.equalsIgnoreCase("5")) {
                System.out.println(admin.method5());
                ;
            } else if (userStr.equalsIgnoreCase("6")) {
                System.out.println(admin.method6());
                ;
            } else if (userStr.equalsIgnoreCase("7")) {
                System.out.println(admin.method7());
                ;
            } else if (userStr.equalsIgnoreCase("8")) {
                System.out.println(admin.method8());
                ;
            } else if (userStr.equalsIgnoreCase("Q")) {
                System.out.println(admin.logout());
                ;
                break;
            }
        }


        // System.out.println("ur in student");
    } //use admin class

    private static String addStudent() {
String x;

        System.out.println("fill out student's information ");
        System.out.println("Student ID: ");
        sid = key.nextInt();
        System.out.println("Student name: ");
        sname = key.nextLine();
        System.out.println("Student email: ");
        semail = key.nextLine();
        System.out.println("student password: ");
        spass = key.nextLine();
        x =  "you have entered the following to be staored in the arraylist"+ spass;
        return x;
    }

    private static boolean validateLogIn() {
        String adminName, adminPassword;
        int counter = 0;
        while (true) {
            System.out.print("Please enter user name: ");
            adminName = key.nextLine();
            System.out.print("Please enter a password: ");
            adminPassword = key.nextLine();

            for (Admin a : adminDB) {
                if (a.getName().equals(adminName)) {
                    if (a.getPassword().equals(adminPassword)) {
                        return true;
                    }
                    System.out.println("logged in admin ");
                }
            }
            counter++;
            if (counter < 3) {
                System.out.println("Invalid login. Please try again. ");
            } else {
                System.out.println("Three invalid logins. Sorry! Try again another day.");
                return false;
            }
        } //end while

    }//validate the admin

    private static String chooseLog() {
        System.out.println("Would you like to login ? (Y/N)");
        return key.nextLine();
    } //ask if they want to login or not

    private static String choosePerson() {
        System.out.println("Would you like to login as an (A)dmin, (F)aculty, (S)tudent, or (Q)uit?");
        return key.nextLine();
    } //choose what kind of user they are (admin/faculty/student)


}




