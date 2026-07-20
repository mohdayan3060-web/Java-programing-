
public class demo2 {

    public static void main(String[] args) {
        //defualt and non parameterised  constructor when used 
        // Student s1 = new Student();
        // System.out.println(s1.name);
        // System.out.println(s1.age);

        //Prameterized constructor 
        Student s1 = new Student("faiz ",21);
        System.out.println(s1.name);
        System.out.println(s1.age);




    }

}

class Student {

    String name;
    int age;

    //defualt constructors 
    // Student () {}

    //creating consturctor (non-parametrazied )
    // Student(){
    //     name="ayan";
    //     age=21;
    // }
    //Prameterized Constructors (also use this keywords )
    Student(String name, int age) {
     this.name = name;
     this.age = age;
    }
}
