//Inheritence 
public class demo01{
    public static void main(String[] args){
       //multiLevel Inheritence  
      toyta t =new toyta();
    t.Start();
    t.setGear();
    t. brand();

    Eng_Student E1=new  Eng_Student();
    E1.markAttendence();

    Medical_Student M1=new  Medical_Student();
    M1.markAttendence();

    }
}

class vehical{
    void Start(){
        System.out.println("Starting .............");
    }
}

class car extends vehical{
    void setGear(){
        System.out.println("Gear is settings..........");
    }
}

class toyta extends car{
    void brand(){
             System.out.println("Toyta is Loading ...........");

    }
}
 //Herarical Inheritence 
class Student {
    void markAttendence(){
        System.out.println("Marking attendence ");
    }
}

class Eng_Student extends Student  {
    void AttendLab(){
         System.out.println("Lab attend for Eng Students  ");
    }

}


class Medical_Student extends Student  {
    void AttendLab(){
         System.out.println("Lab attend for Medical Student   ");
    }

}
