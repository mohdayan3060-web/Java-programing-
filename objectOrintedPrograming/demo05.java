//Encapsulation ---------->>>>>
import collage.helper;  // import packageName.ClassName;



public class demo05 {

    public static void main(String[] args) {
        Bank s1 = new Bank(2324452232L, "Mohd Faiz ", 8573862343L, "Saving ");
        System.out.println(s1.accountHolderName);
        System.out.println(s1.accountNumber);
        System.out.println(s1.mobileNumber);
        // System.out.println(s1.accountBalance);//... this is private variable you cannot acces outside of the class 
        System.out.println(s1.accountType);
        // System.out.println(s1.branchName);
        //we can also access static variable(class variable using the class name )
        System.out.println(Bank.branchName);
    
    //we can update private instance variable using methods 
    System.out.println(s1.toCheckBalance());
    s1.Deposit(23000);
    System.out.println(s1.toCheckBalance());
    s1.withdrwal(1000);
    System.out.println(s1.toCheckBalance());

Student s2= new Student("fiazalam",29,"IUL");
System.out.println(s2.getName());
s2.setName("raheem ");
System.out.println(s2.getName());
//creating object of class which present in diifrent folder using package 
 helper h1= new helper();
//  collage.helper h2=new helper(); --> the you avoid import package 
 h1.displayMsg(); 
 



    }
}

class Bank {

    long accountNumber;
    String accountHolderName;
    long mobileNumber;
    private  long accountBalance=12000; // private acccess modifiers 
    String accountType;
    static final String branchName;

    Bank(long accountNumber, String accountHolderName, long mobileNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
       
        this.accountType = accountType;

    }

    static {
        branchName = "phoolpur branch ";

    }

    public long toCheckBalance() {
       return accountBalance;
    }

    public void Deposit(int amount) {
        accountBalance = accountBalance + amount;
        System.out.println("Your Current Balance is :" + accountBalance);
    }

    public void withdrwal(int amount) {
        if (accountBalance >= amount) {
            accountBalance = accountBalance - amount;
            System.out.println("Withdrwal Successfull");
            System.out.println("Your Current Balance is :" + accountBalance);

        } else {
            System.out.println("Insufficent Balnace ");
        }
    }

}


class Student{
    private String name;
    private int age;
    private String collage;
//constructors 
Student(String name, int age, String collage){
    this.name=name;
    this.age=age;
    this.collage=collage;


}

//getter and setter 
public String getName(){

    return name;

}
public void setName(String name){

    // we can also add sum validation here 
    this.name=name;

}

}