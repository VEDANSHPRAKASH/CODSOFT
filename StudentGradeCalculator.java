import java.util.Scanner;

public class StudentGradeCalculator 
{
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter no.of subjects");
        int sub = input.nextInt();

        double[] subject = new double[sub];

        System.out.println("Enter the marks obtained by the student in each subject out of 100");
        for(int i=0; i<sub; i++) {
            subject[i] = input.nextDouble();                     //marks in each subject
        }

        double sum = 0.0d;
        for(int i=0; i<sub; i++) {
            sum = sum + subject[i];                          //total marks in all the subject
        }

        double avgper = sum/sub;                              //average percentage of the student

        if(avgper > 90) {
            System.out.println("Total marks of the student is "+sum);
            System.out.println("Average percentage of the student is "+avgper);
            System.out.println("Grade of the student is A+");
        } else if(avgper > 80 && avgper <= 90) {
            System.out.println("Total marks of the student is "+sum);
            System.out.println("Average percentage of the student is "+avgper);
            System.out.println("Grade of the student is A");
        } else if(avgper > 70 && avgper <= 80) {
            System.out.println("Total marks of the student is "+sum);
            System.out.println("Average percentage of the student is "+avgper);
            System.out.println("Grade of the student is B+");
        } else if(avgper > 60 && avgper <= 70) {
            System.out.println("Total marks of the student is "+sum);
            System.out.println("Average percentage of the student is "+avgper);
            System.out.println("Grade of the student is B");
        } else if(avgper > 50 && avgper <= 60) {
            System.out.println("Total marks of the student is "+sum);
            System.out.println("Average percentage of the student is "+avgper);
            System.out.println("Grade of the student is C");
        } else if(avgper > 40 && avgper <= 50) {
            System.out.println("Total marks of the student is "+sum);
            System.out.println("Average percentage of the student is "+avgper);
            System.out.println("Grade of the student is D");
        } else {
            System.out.println("Total marks of the student is "+sum);
            System.out.println("Average percentage of the student is "+avgper);
            System.out.println("Grade of the student is Fail");
        }
    }   
}
