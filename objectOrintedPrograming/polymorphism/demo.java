//Polymorphism --> Ablity of object behave diffrently 
//polymorphism achive through methods overloading and methods overridding 
//Polymorphism are two type Runtime(methods overridding ) and Compile(methods overloading ) time 

public class demo{
    public static void main(String[] args) {
        // demonstrating polymorphism at runtime
        Person p= new Father();
        p.role();
        
    }
}

class Person{

    void role(){
        System.out.println("I am Person");
    }
}

class Father extends Person{
    @Override
    void role (){
        System.out.println("I am Father ");
    }
}