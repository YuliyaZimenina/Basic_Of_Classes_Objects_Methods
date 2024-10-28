public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();
        int range1, range2;

        //Assigning values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        range1 = minivan.range(); // Calculating the range of minivan on a full tank

        //Assigning values to fields in sport-car
        sportCar.passengers = 2;
        sportCar.fuelCap = 14;
        sportCar.mpg = 12;

        range2 = sportCar.range(); // Calculating the range of sport-car on a full tank

        System.out.println("The minivan can carry " + minivan.passengers +
                " passengers for " + range1 + " miles on a full tank");

        System.out.println("The sport-car can carry " + sportCar.passengers +
                " passengers for " + range2 + " miles on a full tank");


    }
}
