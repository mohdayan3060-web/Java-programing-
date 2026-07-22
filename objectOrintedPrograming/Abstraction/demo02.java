public class demo02{
    public static void main(String[] args){
//Abstarct class 
// 1. can not be intilized directly 
// 2. can contain abstarct methods (methods without Implementation )
// 3. can also contain  normal methods 
// 4. Is meant to be extended

Animal a= new Dog("brunoo");
a.makeSound();

    }
}

   abstract  class Animal{
    String name;

    Animal(String name ) {
        this.name=name;

    }
    

    abstract  void makeSound();

     final void sleep(){
        System.out.println("Animal is sleeping ........");
    }
}

class Dog extends  Animal{
    Dog( String name){
         super(name);
    }
    @Override
    void makeSound(){
        System.out.println("Making barking Sound ");
    }
}