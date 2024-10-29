public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportCar = new Vehicle(2, 14, 12);
        double gallons;
        int distance = 252;

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
