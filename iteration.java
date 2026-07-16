

public class iteration{
    public static void main(String[] args){

        //Iteration 

        //while , do-while , for 
        // while /For loop is entry controlled loops  and  do-while  is Exit controlled loops(first check the condition then evaluate the body)
        // while (experssion ) --> booleans expression       
        // {
        //     do something
        //     updation
        // }

        int i =1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        //reverse while 
        System.out.println("Reverse while loops ");
        int j=20;
        while (j>=1){
            System.out.println(j);
            j--;
        }

        //do - while (Exit controlled loops ) 
        //First execute once then evalute the conditions 

        System.out.println("do-while loops ");
        int k=2;
        do { 
            System.out.println(k);
            k++;
        } while (k<10);
         
        //using for loops 
        for(int z=1; z<=5;z++){
        System.out.println(z);
        }
        //flow of control
        //1. define the variable 
        //evaluate the condtional statements like z<=5
        //then Execute the body of the loops  
        //then updation 
        //then again evalute the condtions 
         
        // comma Seprated variation 
        System.out.println("Comma seperated variations ");
        for (int a=1,b=1 ;a<10 && b<5 ; a++,b+=2){
            System.out.println(a*b);
        }

        //cheack wheather the number is prime or not
        int number=3;
        for( i=2; i<number;i++){
            if (number%i==0){
                System.out.println("This is not prime numeber");
                break;
            }
        }
        if (i==number ){
            System.out.println("this is prime number ");
        }
    }

}