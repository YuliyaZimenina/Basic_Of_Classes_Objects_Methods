public class Vehicle {
    int passengers; // number of passengers
    int fuelCap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    // Method for displaying trip distance
    int range(){
       return fuelCap * mpg;
    }
}
