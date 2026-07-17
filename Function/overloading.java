public class overloading{
    public static void main(String[] args) {
        //Function overloading 
        //diffrent no. Parameter 
        sum(10,20);
        sum(10,20,30);
        //diffrent  return type 
        sum(1.5,1.4);
    }
    
    static int sum(int a, int b,int c){
        return a+b+c;
    }
     static int sum(int a, int b){
        return a+b;
    } 
    static double  sum(double  a, double  b){
        return a+b;
    }
}