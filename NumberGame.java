import java.util.Random;
import java.util.Scanner;;

public class NumberGame 
{
    public static void main(String[] args) 
    {
        Random rnumber = new Random();
        int target = rnumber.nextInt(1,100);                                  //Range of random number is 1-100

        int count = 0;
        int count2 = 0;
        Scanner input = new Scanner(System.in);

        int r = 5;                                                                       //No.of attempts in which you have to guess the number
        int r2 = r;

        System.out.println("Welcome to the number guessing game");
        System.out.println();

        while (r > 0) 
        {
            System.out.println("You have "+r2+" attempts to guess the number");          //Shows no.of attempts left, after wrong number is guessed
            System.out.println();
            r2--;

            System.out.println("Enter the guess number:");
            int gnum = input.nextInt();
            count2++;

            if(target == gnum) {
                System.out.println("Correct number is guessed, You won!!!!");
                System.out.println();
                count++;
                break;
            }  else if(gnum < target) {
                System.out.println("Entered number is small, enter a large number than this number");
                System.out.println();
                r--;
            }  else {
                System.out.println("Entered number is big, enter a small number than this number");
                System.out.println();
                r--;
            }
        }
        if(r == 0) {
            System.out.println("You loss the game");                               //When you can't guess the number in given no.of attempts
            System.out.println();
        }

        System.out.println("Your score is "+count+" in "+count2+" attempts");           //it tells your score out of no.of limits, that you have already set as 5
    }
}
