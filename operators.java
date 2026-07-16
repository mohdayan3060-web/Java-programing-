
public class operators {

    public static void main(String[] args) {
        //Operators in java 
        //Airthmatics operators --> +  -  *  /  %   +=  -=  /=  %= 
        byte a=10;
        int b=20;
        System.out.println(a + b); //30
        System.out.println(a - b);// -10
        System.out.println(a / b);// 0
        System.out.println(a % b); // 10
        
        a +=30; // a = a + 30;
        //Simlarly  a -=20;  //  a = a-20; 
        System.out.println(a);

        //Increment and Decrement
        a++;
        b++;
        System.out.println("After Increment  a and b "+ a +" and " + b);
        //Pre Increments
        byte k=++a; //k=a;  a=a+1;
        System.out.println("k : "+k+ " a :"+a);
        //Post Increments
        byte l=a++; //l =  a+1;
        System.out.println("l : "+l+ " a :"+a);

        // Relational operators (It's give true/false values)
        //== != <  >  <=  >=  
        System.out.println(a==b); //False
        System.out.println(a!=b); //True 
        System.out.println(a<b);  //False
        System.out.println(a>b);  //True
        System.out.println(a<=b); //False
        System.out.println(a>=b); //True
        // Bitwise operators (works on the basis of bits )
        // &  |  ^  ~
        byte x=2;
        byte y=3;
        System.out.println(x&y); //2
        System.out.println(x|y); //3
        System.out.println(x^y); //1
        System.out.println(~x);  //-3
        System.out.println(~y);  //-4

       //Shift Operators 
       //Left Shift 
       byte nums=1;
    //    nums=(byte) (nums<<1);
       System.out.println(nums); //1
       nums =(byte) (nums<<7);
       System.err.println(nums); // -128
    //What is type cast into integrs 
    int z= nums<<1;
    System.out.println(" z : "+z); //-256
    

    //Right Shift
    byte r= 32;
    r=(byte) (r>>1); //16
    System.out.println(r);
    r=(byte) (r>>1); //8
    r=(byte) (r>>1); //4
    r=(byte) (r>>1); //2
    r=(byte) (r>>1); //1
    System.out.println(r);

    //Shift Right with zeros 
    byte  r2=-128;
    r2=(byte) (r2>>>1);
    System.out.println(r2); //-64

    //Logical operators 
    // &&  -->when both condition is true then It's give True Otherwise False ((a<b)&&(b<c))
    // ||  --> Atlest on condith should be True then It's give True Otherwise False ((a<b)||(b<c))

    



    




        

    






    }
}
