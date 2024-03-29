/*
       Question 1: *What year are you? (1, 2, 3, 4):*
       ○	  1: +2 pts Freshmen
       ○	Sophomore 0 points
       ○	Junior 0 points
       ○	  4: +2 pts senior
       ●	Question 2: *How old are you?*
       ○	  if age == 18 && age == 22 3pt
       ○	  if 20 or more, then no points
       Question 3: What is your GPA?
       If GPA > 3.0 +1point
       Question 4: Are you an international student? (y/n).
       If IS yes then +2
       else no
       Question 5: How many miles away are you from college?
       If miles =>25 then +4 point
       Question 6: Are you on academic probation? (y/n).
       If AP y then -1 point
       If AP n then 0 point
       Question 7: Have you been suspended before? (y/n).
       If Yes then -1 point
       If No then 0 points
       Output 8: Thank you for your time. Your total score is ……

*/

/*

Test Case 1: A freshman who is 18 years old, with a GPA of 3.5, not an international student, 10 miles away from college, not on academic probation, and has never been suspended.
For Test Case 1, the expected total score is +6 points (2 for being a freshman, 3 for age, 1 for GPA).

Test Case 2: A sophomore who is 20 years old, with a GPA of 2.8, not an international student, 30 miles away from college, on academic probation, and has been suspended before.
For Test Case 2, the expected total score is 2 point (-1 for being on academic probation. -1 for being suspended, 4 points for living far away).

Test Case 3: A junior who is 19 years old, with a GPA of 3.2, an international student, 5 miles away from college, not on academic probation, and has never been suspended.
For Test Case 3, the expected total score is +3 points (2 for being an international student, 1 for GPA).

Test Case 4: A senior who is 22 years old, with a GPA of 2.9, not an international student, 40 miles away from college, not on academic probation, and has never been suspended.
For Test Case 4, the expected total score is +9 points (2 for being a senior, 3 points for age ,4 points of living far away).

Test Case 5: A sophomore who is 20 years old, with a GPA of 3.7, not an international student, 15 miles away from college, not on academic probation, and has never been suspended.
For Test Case 5, the expected total score would be +3 points (1 for GPA).


 */


/*   // Scratch work
import java.util.Scanner;

public class HousingSelection {
    public static void main(String[] args) {

        int gradeNumber;
        int age;
        int housingScore = 0;
        float GPA;
        int miles;
        String academicProbation;
        String Suspension;
        String internationalStudent;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the housing app. You will be " +
                "asked some questions to see if you are eligible for housing. ");


        // What grade the user is in code.
        System.out.println("What grade are you in? : 1: Freshmen: , 2: Sophomore, 3: Junior, 4: Senior. Please enter the number. ");
        gradeNumber = scanner.nextInt();

        if (gradeNumber == 4 || gradeNumber == 1) {
            housingScore += 2; // adding housing score 2
            System.out.println("You will get 2 points because you are either a Freshmen or a Senior.\n "); // This is where I start my algorithim
        } else {
            System.out.println("You will get 0 points because you are either a Sophomore or Junior.\n");
            housingScore += 0;
        }
        // What age user is in code

        System.out.println("How old are you? : ");
        age = scanner.nextInt();

        if (age == 18 || age == 22) {
            System.out.println("You will get 3 points because you are either 18 years old or 22 years old.\n ");
            housingScore += 3;
        } else {
            System.out.println("You will get no points because you are not 18 or 22.\n");
        }

        // what is your GPA code

        System.out.println("What is your GPA? : ");
        GPA = scanner.nextFloat();

        if (GPA >= 3.0) {
            System.out.println("You will get 1 point because you have either 3.0 GPA or more.\n");
            housingScore += 1;
        } else {
            System.out.println("You will get no points because you have GPA lower than 3.0.\n");
        }

        // How many miles away are you from college?

        System.out.println("How many miles away are you from your college? ");
        miles = scanner.nextInt();

        if (miles > 25) {
            System.out.println("You will get 4 points because you are far away form the campus.\n ");
            housingScore += 4;
        } else {
            System.out.println("You will get no points because you are closer to the campus.\n");
        }

        //Are you on academic probation code
        System.out.println("Are you on probation? (y/n) ");
        academicProbation = scanner.next();

        if (academicProbation.equalsIgnoreCase("y")) {
            System.out.println("You will get -1 points because you are on academic probation.\n");
        else{

            }
            housingScore -= 1;
        }

        // Are you on suspension code
        System.out.println("Have you been suspended before? (y/n) ");
        Suspension = scanner.next();

        if (Suspension.equalsIgnoreCase("y")) {
            System.out.println("You will get -1 points because you have been suspended.\n ");
            else{
                System.out.println("You will get no points because you aren't a international student.\n");
            }
        }


        // Are you an international student code

        System.out.println("Are you an international student? (y/n) ");
        internationalStudent = scanner.next();

        if (internationalStudent.equalsIgnoreCase("y")) {
            System.out.println("You will get 2 points because you are a international student.\n");
        } else {
            System.out.println("You will get no points because you aren't a international student.\n");
            housingScore += 2;
        }

    }
}
 */


//System.out.println(housingScore); //printing housing score

// Reformatted and find draft code // Got confused on coding the upper part, so I made adjustments.

import java.util.Scanner;

public class HousingSelection {
    public static void main(String[] args) {

        int gradeNumber;
        int age;
        int housingScore = 0;
        float GPA;
        int miles;
        String academicProbation;
        String Suspension;
        String internationalStudent;

        Scanner scanner = new Scanner(System.in);

        // first step introduction
        System.out.println("Welcome to the housing app. You will be " +
                "asked some questions to see if you are eligible for housing. ");

        // What grade the user is in code. I used nextInt for the numbers to make it easier.
        System.out.println("What grade are you in? : 1: Freshmen: , 2: Sophomore, 3: Junior, 4: Senior. Please enter the number. ");
        gradeNumber = scanner.nextInt();

        //I used a lot of if and else for this. To explain, this is just what we did in birthday gift selector.

        if (gradeNumber == 4 || gradeNumber == 1) {
            housingScore += 2; // adding housing score 2
            System.out.println("You will get 2 points because you are either a Freshmen or a Senior.\n "); // This is where I start my algorithm
        } else {
            System.out.println("You will get 0 points because you are either a Sophomore or Junior.\n");
        }

        // What age the user is code. Second step if age == to something print something.
        System.out.println("How old are you? : ");
        age = scanner.nextInt();

        if (age == 18 || age == 22) {
            System.out.println("You will get 3 points because you are either 18 years old or 22 years old.\n ");
            housingScore += 3;
        } else {
            System.out.println("You will get no points because you are not 18 or 22.\n");
        }

        // What is your GPA code. Used float for this one because GPA are in decimals.
        System.out.println("What is your GPA? : ");
        GPA = scanner.nextFloat();

        if (GPA >= 3.0) {
            System.out.println("You will get 1 point because you have a GPA of 3.0 or more.\n");
            housingScore += 1;
        } else {
            System.out.println("You will get no points because your GPA is lower than 3.0.\n");
        }

        // How many miles away are you from college?
        System.out.println("How many miles away are you from your college? ");
        miles = scanner.nextInt();

        if (miles > 25) {
            System.out.println("You will get 4 points because you are far away from the campus.\n ");
            housingScore += 4;
        } else {
            System.out.println("You will get no points because you are closer to the campus.\n");
        }

        // Are you on academic probation code. Used string to match the letter y.
        //This is the code that professor gave us for Strings in birthday gift selector.

        System.out.println("Are you on probation? (y/n) ");
        academicProbation = scanner.next();

        if (academicProbation.equalsIgnoreCase("y")) {
            System.out.println("You will get -1 point because you are on academic probation.\n");
            housingScore -= 1;
        } else {
            System.out.println("You will get no points because you are not on academic probation.\n");
        }

        // Are you on suspension code. Again used string for y. I had some difficulty connecting these with this '}'
        // But I eventually figured it out.

        System.out.println("Have you been suspended before? (y/n) ");
        Suspension = scanner.next();

        if (Suspension.equalsIgnoreCase("y")) {
            System.out.println("You will get -1 point because you have been suspended.\n ");
            housingScore -= 1;
        } else {
            System.out.println("You will get no points because you haven't been suspended.\n");
        }

        // Are you an international student code. Same thing used string for international student.
        System.out.println("Are you an international student? (y/n) ");
        internationalStudent = scanner.next();

        if (internationalStudent.equalsIgnoreCase("y")) {
            System.out.println("You will get 2 points because you are an international student.\n");
            housingScore += 2;
        } else {
            System.out.println("You will get no points because you are not an international student.\n");
        }
        // Calculating the total of the housing score.
        System.out.println("Thank you for your time. Your housing score is: " + housingScore);


        // Highest point you can get is 12 points.
    }
}


















