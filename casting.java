public  class casting{

    public static void main(String[] args) {
        //Implicit conversion 
        //destination datatype  should be greater then source datatype 
        //auto 
        byte b=30;
        short a=b;
        System.out.println(a);
        short x=400;
        int y=x;
        System.out.println(y);
        
        //Explicit conversion 
        //Required type casting 
        //Destination datatype should be smaller then source datatype 
        int z=1000;
        byte z2;
        z2=(byte)z;
        System.out.println(z2); //1000 % 256
        

        //unicode char
        char c='b';
        int c2=c;
        System.out.println(c2);

        //Truncating conversion (basically decimal values truncate )
        //Floating,decimal values convert into Integer(int)
        float f=8.12343f;
        double d=8.12343;

        System.out.println((int)f);
        System.out.println((int)d);

       //Automatic type promotions 
       byte nums=50;
       nums=(byte)(50*2);
       System.out.println(nums);

    }
}