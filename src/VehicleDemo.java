public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        //Assigning values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        //Calculating the travel distance with a full tank
        range = minivan.fuelCap * minivan.mpg;
        System.out.println("The minivan can carry " + minivan.passengers +
                " passengers for a distance of " + range + " miles");
    }
}
