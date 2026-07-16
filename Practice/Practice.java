
public class Practice {

    public static void main(String[] args) {
        //Practice question based on conditional Statements 

        // questi on-1 Postive number check
        int n = 10;
        if (n >= 0) {
            System.out.println("Positive numbers ");
        } else {
            System.out.println("Negative numebers");
        }
        // question-2 Even or Odd
        if (n % 2 == 0) {
            System.out.println("Even numebrs ");
        } else {
            System.err.println("Odd numbers ");
        }

        // question-3 Vote eligblity test
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible ");
        } else {
            System.out.println("You are not eligible ");
        }

        //question 4 Grading system 
        int marks = 40;
        if (marks >= 90) {
            System.out.println("GRADE : A");
        } else if (marks >= 75) {
            System.out.println("GRADE : B");

        } else if (marks >= 60) {
            System.out.println("GRADE : C");

        } else if (marks >= 40) {
            System.out.println("GRADE : D");
        } else {
            System.err.println("FAIL");
        }

        //Question -5 find the largest number among three 
        int a = 10;
        int b = 20;
        int c = 32;
        if ((a > b) && (b > c)) {
            System.out.println("A is greater ");
        } else if ((a < b) && (b < c)) {
            System.out.println("C is greater ");
        } else {
            System.out.println("B is greater ");
        }
        //Question -6  Days of week 
        int days=3;
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
             case 2:
                System.out.println("Tuesday");
                break;

             case 3:
                System.out.println("Wednesday");
                break;
             case 4:
                System.out.println("Thursday");
                break;
             case 5:
                System.out.println("friday");
                break; 
             case 6:
                System.out.println("Saturday");
                break; 
            case 7:
                System.out.println("Sunday");
                break; 




            default:
               System.out.println("No Days Exist ");
        }

        //question --> Make simple calculator using simple swithc statements
        int number01=100;
        int number02=200;
        //bounus Question --> Check wheter is Leap year or not
        int year=1932;
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println("Leap year");
} else {
    System.out.println("Not a leap year");
}

    }
}
