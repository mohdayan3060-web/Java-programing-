// Abstrction --->>>

public class demo {

    public static void main(String[] args) {
        Car c1= new FuelCar();
        c1.Start();
        c1.Accelerate();
        c1.Break();

        Car c2= new ElectricCar();
        c2.Start();
        c2.Accelerate();
        c2.Break();
      
    }
}

abstract class Car {

    void Start() {
        System.out.println("Car is starting..........");
    }

    abstract void Accelerate();

    abstract void Break();
}

class FuelCar extends Car {

    @Override
    void Accelerate() {
        System.out.println("Fuel Car is Accelrating ");

    }

    void Break() {
        System.out.println("stoping car.......");


    }

}

class ElectricCar extends Car {

    @Override
    void Accelerate() {
        System.out.println("Electric  Car is Accelrating ");

    }

    @Override
    void Break() {
  System.out.println("stoping car.......");
    }

}
