public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();
        int range1, range2;

        //Assigning values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //Assigning values to fields in sport-car
        sportCar.passengers = 2;
        sportCar.fuelCap = 14;
        sportCar.mpg = 12;

        //Calculating the travel distance with a full tank
        //minivan
        range1 = minivan.fuelCap * minivan.mpg;
        // sport-car
        range2 = sportCar.fuelCap * sportCar.mpg;
        System.out.println("The minivan can carry " + minivan.passengers +
                " passengers for a distance of " + range1 + " miles");

        System.out.println("The sport-car can carry " + sportCar.passengers +
                " passengers for a distance of " + range2 + " miles");
    }
}
