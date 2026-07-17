public class Recursion{
    public static void main(String[] args) {
        int result=fun(1);
        System.out.println(result);
        
    }
    //print 1 to 20 number using recursion 
    static int fun(int n){
        //base case 
        if (n==20){
            return n;
        }
        System.out.println(n);
        n++;
        return fun(n);

    }
}