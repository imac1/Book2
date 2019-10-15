import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Course course = new Course();

        Attendant[] attendantsArray = new
                Attendant[course.attendantsNr];


        try {
            for (int i = 0; i < course.attendantsNr; i++) {
                Attendant attendant = new Attendant();
                System.out.println("Please, enter your name");

                attendant.setName(s.next());
                System.out.println("Please, enter your age");

                attendant.setAge(s.nextInt());
                System.out.println("Please, enter your salary");

                attendant.setSalary(s.nextInt());
                System.out.println("Please, enter your gender");

                attendant.setGender(s.next());

                attendantsArray[i] = attendant;

            }
        } catch (Exception error) {
            System.out.println("Error");
        }

        for (Attendant attendant : attendantsArray) {
            System.out.println(attendant.toString());

        }


        System.out.println("The number of course attendants is " + course.attendantsNr);
        System.out.println("The average age of the attendants is " + course.calculateAvrAge(attendantsArray));
        System.out.println("The number of males at the course is " + course.malesNr(attendantsArray));


    }
}
