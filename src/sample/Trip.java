/* Project Number 2 Trip class
By: Monica 
 */

package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Trip extends Amount {
    // Fields for Trip object
    String transportation;
    String lodging;
    String food;


    // Default constructor for Trip object
    Trip() {
        transportation = "";
        lodging = "";
        food = "";
    }


    // Constructor with parameters for Trip object
    public Trip(String transportation, String lodging, String food) {
        this.transportation = transportation;
        this.lodging = lodging;
        this.food = food;
    }


    // Getters for fields
    public String getTransportation() {
        return transportation;
    }

    public String getLodging() {
        return lodging;
    }

    public String getFood() {
        return food;
    }


    // toString method to print user's choices
    public String toString() {
        return "Transportation: " + transportation + ", Lodging: " + lodging + ", Food: " + food;
    }


    // Method to write Trip object into tripExpenses text file
    public void writeToFile() throws IOException {
        // Create a FileWriter and BufferedWriter to write into the tripExpenses text file
        FileWriter fw = new FileWriter("tripExpenses.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        // Write each category of the trip plan on a new line in the text file
        bw.write("TRIP PLAN RECEIPT" + "\r");
        bw.write("Transportation: " + transportation + ",\r");
        bw.write("Lodging: " + lodging + ",\r");
        bw.write("Food: " + food + "\r");
        bw.write(";\r");
        bw.close();
    }

}
