
public class demo {

    public static void main(String[] args) {
        //Autoboxing 
        int x = 10;
        Integer y = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(y.intValue());

        //unboxing 
        Integer a = 200;
        int b = x;
        System.out.println(a);
        System.out.println(b);

        //sum

        Integer nums1=20;
        Integer nums2=30;
        // int sum=nums1+nums2;
        int sum= nums1.intValue()+nums2.intValue();
        System.out.println("Sum : "+sum);

        Integer number01=128;
        Integer number02=128;
 System.out.println(number01==number02); // gives False becouse it compare  
 //Another methods 
      System.out.println(number01.equals(number02));

    }
}
