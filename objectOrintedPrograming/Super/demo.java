// Super keyWords ;

public class demo{
    public static void main(String[] args ){
        child ch= new child();
ch.print();
ch.info();



    }

}

class parents{
    String name;
    int age ;

    int x=4;

    //constructor 
    // parents(String name , int age ){
    //     this.name = name ;
    //     this.age =age ;

    // }
  void info(){
    System.out.println("Parents Info .........");
  }

}

class child extends parents{
     int x=100; 
    void info(){
        super.info(); // calling parents methods cd
    System.out.println("child .........");
        
    }

  public void print(){
    System.out.println(super.x);  // calling parrents instence variable 
    System.out.println(this.x);

    //calling constructor using super keywords 
    // child(String name , int age ){
    //      super(name,age );
    // }

  }
}
