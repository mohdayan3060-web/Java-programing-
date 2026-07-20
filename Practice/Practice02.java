
public class Practice02 {

    public static void main(String[] args) {
//         ### Conditional Statements

// 1. Check whether a number is positive, negative, or zero.
        int n = -21;
        if (n <= 0) {
            if (n == 0) {
                System.err.println("Zero");

            } else {
                System.out.println("Negative number ");
            }

        } else {
            System.out.println("Positive");
        }

// 2. Check whether a character is a vowel or consonant.
        char ch = 'a';
        switch (Character.toLowerCase(ch)) {
            
             case 'a':
                System.out.println("Vowel");
                break;
             case 'e':
                System.out.println("Vowel");
                break;
             case 'i':
                System.out.println("Vowel");
                break;
             case 'o':
                System.out.println("Vowel");
                break;
             case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
                break;                    
        }



     // 3. Create a simple calculator using `switch`.
double num1=100;
double num2=200;


// ### Loops
// 6. Print numbers from 1 to N.
// 7. Print even numbers between 1 and N.
// 8. Find the sum of first N natural numbers.
// 9. Find the factorial of a number.
// 10. Reverse a number.
// ### Functions
// 11. Create a function to find the square of a number.
// 12. Create a function that returns the maximum of two numbers.
// 13. Write a function to check whether a number is even.
// 14. Write a function to calculate the power (base, exponent).
// 15. Write a function to count digits in a number.   
    }


}
