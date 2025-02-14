package abtraction;

abstract class Vehicle
{ abstract void engine();
}
class Car extends Vehicle
{  void engine(){
   System.out.println("1000 CC");
 }
}
class Bike extends Vehicle
{  void engine(){
  System.out.println("300 CC");
 }
}
public class first
{ public static void main(String x[])
 { Car c = new Car();
	c.engine();
     Bike b = new Bike();
	b.engine();
 }
}
