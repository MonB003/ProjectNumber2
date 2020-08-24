/* Project Number 2 Amount class
By: Monica Bacatan
 */

package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Amount extends Controller {
    // Fields for Amount object
    double transportationAmt;
    double lodgingAmt;
    double foodAmt;
    double miscellaneousAmt;
    double totalAmt;


    // Default constructor for Amount object
    Amount() {
        transportationAmt = 0;
        lodgingAmt = 0;
        foodAmt = 0;
        miscellaneousAmt = 0;
    }


    // Constructor with parameters for Amount object
    public Amount(double transportationAmt, double lodgingAmt, double foodAmt, double miscellaneousAmt) {
        this.transportationAmt = transportationAmt;
        this.lodgingAmt = lodgingAmt;
        this.foodAmt = foodAmt;
        this.miscellaneousAmt = miscellaneousAmt;
    }


    // Getters for fields
    public double getTransportationAmt() {
        return transportationAmt;
    }

    public double getLodgingAmt() {
        return lodgingAmt;
    }

    public double getFoodAmt() {
        return foodAmt;
    }

    public double getMiscellaneousAmt() {
        return miscellaneousAmt;
    }


    // toString method to print user's input
    public String toString() {
        return "Transportation Amount: " + transportationAmt + ", Lodging Amount: " + lodgingAmt + ", Food Amount: " + foodAmt + ", Miscellaneous Amount: " + miscellaneousAmt;
    }


    // Method to get the total amount of money the user inputs
    public double getTotalAmt() {
        // Total variable stores the sum of the amounts from each category
        totalAmt = transportationAmt + lodgingAmt + foodAmt + miscellaneousAmt;
        return totalAmt;
    }


    // Method to write Amount object into tripExpenses text file
    public void writeAmt() throws IOException {
        // Create a FileWriter and BufferedWriter to write into the tripExpenses text file
        FileWriter fw = new FileWriter("tripExpenses.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        // Write each category of the trip plan on a new line in the text file
        bw.write("TRIP EXPENSES" + "\r");
        bw.write("Transportation Amount: $" + transportationAmt + ",\r");
        bw.write("Lodging Amount: $" + lodgingAmt + ",\r");
        bw.write("Food Amount: $" + foodAmt + ",\r");
        bw.write("Miscellaneous Amount: $" + miscellaneousAmt + ",\r");
        bw.write("Your Total: $" + totalAmt + "\r");
        bw.write(";\r");
        bw.write("Thank you for using the Trip Expense Planner App!" + "\r");
        bw.write("\r");
        bw.close();
    }

}
