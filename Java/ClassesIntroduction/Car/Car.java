
package car;

public class Car {
    
    int modelYear;
   String ModelName;
   int prize;
   
 //Constructor Method 
   public Car(int year, String name,int initialPrize){
   
       modelYear = year;
       ModelName = name;   
       prize = initialPrize;
   }
   
   public int prizeIncrement(int increment){
   
   prize = prize + increment;
        return prize;
   
   }

    public static void main(String[] args) {
Car myCar = new Car(1969,  "Mustang", 2000);
System.out.println(myCar.ModelName + " " + myCar.modelYear + " " + myCar.prize);
myCar.prizeIncrement(500);
System.out.println(myCar.ModelName + " " + myCar.modelYear + " " + myCar.prize);
myCar.prizeIncrement(800);
System.out.println(myCar.ModelName + " " + myCar.modelYear + " " + myCar.prize);
myCar.prizeIncrement(300);
System.out.println(myCar.ModelName + " " + myCar.modelYear + " " + myCar.prize);
    }
    
}
