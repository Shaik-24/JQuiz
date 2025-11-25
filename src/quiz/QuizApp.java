package quiz;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which keyword is used to define a class in Java?\nA) class\nB) def\nC) struct\nD) define",
            "2. Which data type is used to store decimal values?\nA) int\nB) float\nC) char\nD) boolean",
            "3. Which OOP concept is related to code reusability?\nA) Abstraction\nB) Encapsulation\nC) Inheritance\nD) Polymorphism",
            "4. What is the default value of int in Java?\nA) 1\nB) 0\nC) null\nD) -1",
            "5. Which method is the entry point of a Java program?\nA) start()\nB) begin()\nC) run()\nD) main()"
        };

        char[] answers = {'A', 'B', 'C', 'B', 'D'};
        int score = 0;

        System.out.println("***** JAVA QUIZ *****");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Your answer: ");
            char userAns = Character.toUpperCase(sc.next().charAt(0));

            if (userAns == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + answers[i]);
            }
        }

        System.out.println("\n***** QUIZ COMPLETED *****");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}