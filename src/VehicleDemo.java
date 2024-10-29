public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();
        double gallons;
        int distance = 252;

        //Assigning values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //Assigning values to fields in sport-car
        sportCar.passengers = 2;
        sportCar.fuelCap = 14;
        sportCar.mpg = 12;

        /*
        Calculating of the volume of fuel required for
        a minivan to travel a given distance
         */
        gallons = minivan.fuelNeeded(distance);
        System.out.println("The minivan needs " + gallons + " gallons of fuel to" +
                " travel " + distance + " miles");

        gallons = sportCar.fuelNeeded(distance);
        System.out.println("The sport-car needs " + gallons + " gallons of fuel to" +
                " travel " + distance + " miles");




    }
}
