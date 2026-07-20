
public class demo3 {

    public static void main(String[] args) {
        Student s1= new Student();
        System.out.println(s1.name+s1.age+s1.rollNumebr); //null , 0 , 0

        Student s2= new Student("aditya"); 
        System.out.println(s2.name+s2.age+s2.rollNumebr); //Aditya , 0 , 0
        
        Student s3= new Student("aditya",21); 
        System.out.println(s3.name+s3.age+s3.rollNumebr); //Aditya , 21 , 0

        Student s4= new Student("aditya",22,103); 
        System.out.println(s4.name+s4.age+s4.rollNumebr); // Aditya , 21 , 103
    }
}

class Student {

    String name;
    int age;
    int rollNumebr;

    //constructor over loading 
    Student() {

    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumebr = rollNumber;

    }

    void marksAttendence() {
        System.out.println("Attendence marked for the Student " + name);

    }
}
