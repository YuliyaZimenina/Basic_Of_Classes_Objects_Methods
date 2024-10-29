public class Vehicle {
    int passengers; // number of passengers
    int fuelCap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    // Vehicle class constructor
    Vehicle(int numberOfPassengers, int fuelCapacity, int fuelConsumption){
        passengers = numberOfPassengers;
        fuelCap = fuelCapacity;
        mpg = fuelConsumption;
    }

    // Method for displaying trip distance
    int range() {
        return fuelCap * mpg;
    }

    /*
    The method for calculating the amount of fuel
    required to a given distance
     */
    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }


}
