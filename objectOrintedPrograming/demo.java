public class demo{
    public static void main(String[] args){
         Student s1= new Student();
         Student s2= new Student();
         s1.name="ayan";
         s1.age=21;
         s1.collage="Integral University";
         s1.rollNumber=100867;

        s2.name="faiz";
        s2.age=19;
        s2.collage="Lucknow University";
        s2.rollNumber=100667;
        s1.markAttendence();
        s2.markAttendence();
        s2.infoPrint();
         



    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String collage;

    void markAttendence(){
        System.out.println(name+" Is present ");

    }
     void infoPrint(){
        System.out.println("name "+name+ "age : "+age +" roll number : "+rollNumber+"  collage :"+collage);
        
    }

}