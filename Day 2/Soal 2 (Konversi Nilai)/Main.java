import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to The Score Conversion");

        String ConvertScore = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Score = ");
        int score = input.nextInt();

        if (score >= 80 && score <= 100){
            ConvertScore = "A :)";
        } else if (score >=65 && score <=79){
            ConvertScore = "B+ :)";
        } else if (score >=50 && score <=64){
            ConvertScore = "B :)";
        } else if (score >=35 && score <=49){
            ConvertScore = "C :(";
        } else if (score >=0 && score <=34) {
            ConvertScore = "D :(";
        } else {
            ConvertScore = "Invalid";
        }

        System.out.println("Your Convert Score = " +ConvertScore);

    }
}