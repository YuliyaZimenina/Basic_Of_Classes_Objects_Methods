public class Vehicle {
    int passengers; // number of passengers
    int fuelCap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    // Method for displaying trip distance
    void range(){
        System.out.println("Range in miles on a full tank: " + fuelCap * mpg);
    }
}
