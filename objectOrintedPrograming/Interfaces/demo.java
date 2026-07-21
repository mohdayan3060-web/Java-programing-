// Interface ------>>>

public class demo {

    public static void main(String[] args) {
      Car c1= new ElectricCar();
      c1.Start();
      c1.Accelerate();
      c1.Break();
    }
}

 

interface Car {  

    void Start(); //only declear

    void Accelerate();

    void Break();
}

class FuelCar implements  Car {
  
    public void Start(){
        System.out.println("Fuel car is starting .....");
    }

  
    public void Accelerate() {
        System.out.println("Fuel Car is Accelrating ");

    }

    public void Break() {
        System.out.println("stoping car.......");

    }

}

class ElectricCar implements  Car {
    public  void Start(){
        System.out.println("Electric  car is starting .....");
    }



    public void Accelerate() {
        System.out.println("Electric  Car is Accelrating ");

    }

    
    public void Break() {
        System.out.println("stoping car.......");
    }

}
