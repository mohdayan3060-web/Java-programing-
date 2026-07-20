
public class demo4 {

    public static void main(String[] args) {
        Student s1= new Student();
        // System.out.println(s1.name+s1.age+s1.rollNumebr); //null , 0 , 0
   

      
}
}

class Student {

    String name;
    int age;
    int rollNumber;

    //constructor over loading 
    Student() {
        this("aditya");

    }

    Student(String name) {
     this("Faiz",21);
    }

    Student(String name, int age) {
     this("Faiz",21,104);
       
    }

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;

    }

    void marksAttendence() {
        System.out.println("Attendence marked for the Student " + name);

    }
}
