public class func{
   
 String name ="Ayan"; //Global Scope (you can use it anywhere )
    public static void main(String[] args ){
        greeting();
     int a=30,b=20; //here a and b is global scope 
     int result=sum(a,b);
     System.out.println("Sum of "+ a +" and "+b+" is :"+result);

     int number=getnumeber();
     System.out.println(number);

    //Function chaining 
    fun1();

    }
     static void greeting(){
        System.out.println("Good Morning!");
        // return; //void functon  does not return anything     
    }
    static int sum(int a, int b){
        int result =a+b;
        return  result;
    }
    //no input  but return output
    static int  getnumeber(){
 return  100;
    }

    static void  fun1(){
     fun02();
     System.out.println("hope you are doing well");
    }
    static void fun02(){
        fun03();
        System.out.println("ohh good to see you brothers");

    }
    static void fun03(){
        System.out.println("hello !");
    }
}