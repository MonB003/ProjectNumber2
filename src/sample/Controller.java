/* Project Number 2 Controller class
By: Monica Bacatan
 */

package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.io.IOException;

public class Controller {
    // Fields

    // Text field and button for Transportation category
    public TextField textGetTransportationAmount;
    public Button btnAddTransportationAmount;

    // Text field and button for Lodging category
    public TextField textGetLodgingAmount;
    public Button btnAddLodgingAmount;

    // Text field and button for Food category
    public TextField textGetFoodAmount;
    public Button btnAddFoodAmount;

    // Text field and button for Miscellaneous category
    public TextField textGetMiscellaneousAmount;
    public Button btnAddMiscellaneousAmount;

    // Label displays how much money the user has spent
    public Label lblMoneySpent;

    // Double variable used to add each amount the user inputs into a text field
    public double totalAmount = 0;

    // Text field for user to input their budget
    public TextField textUserBudget;

    // Label that's displayed when the user is close to or exceeding their budget
    public Label lblAmountWarning;

    // Button to save user input into text file
    public Button btnSave;

    // Choice boxes of the trip planner display the options for each category
    public ChoiceBox<String> transportChoiceBox = new ChoiceBox<>();
    public ChoiceBox<String> lodgingChoiceBox = new ChoiceBox<>();
    public ChoiceBox<String> foodChoiceBox = new ChoiceBox<>();

    // Strings store user's choices for methods of transportation, lodging, and food
    public String transportChoice;
    public String foodChoice;
    public String lodgingChoice;

    // Double variables store user's input in the text fields
    double transportationAmount;
    double lodgingAmount;
    double foodAmount;
    double miscellaneousAmount;



    // Methods

    // Method to create choice boxes for each category in the trip planner
    public void initialize(){
        // Add options to the Food category choice box of the trip planner
        foodChoiceBox.getItems().addAll("Restaurant", "Take Out", "Fast Food", "Delivery");
        foodChoiceBox.setValue("Restaurant");
        // foodChoice variable stores the option that the user selects for the Food category
        foodChoice = foodChoiceBox.getValue();

        // Add options to the Transportation category choice box of the trip planner
        transportChoiceBox.getItems().addAll("Airplane", "Car", "Taxi", "Bike", "Bus", "Foot");
        transportChoiceBox.setValue("Airplane");
        // transportChoice variable stores the option that the user selects for Transportation category
        transportChoice = transportChoiceBox.getValue();

        // Add options to the Lodging category choice box of the trip planner
        lodgingChoiceBox.getItems().addAll("Hotel", "Cabin", "Tent", "Camper");
        lodgingChoiceBox.setValue("Hotel");
        // lodgingChoice variable stores the option that the user selects for Lodging category
        lodgingChoice = lodgingChoiceBox.getValue();

        // Method for when user selects an option for transportation choice box
        // The Listener grabs what the user selects for transportation
        transportChoiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // User's choice becomes the value of transportChoice
                transportChoice = newValue;
            }
        });

        // Method for when user selects an option for food choice box
        // The Listener grabs what the user selects for food
        foodChoiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // User's choice becomes the value of foodChoice
                foodChoice = newValue;
            }
        });

        // Method for when user selects an option for lodging choice box
        // The Listener grabs what the user selects for lodging
        lodgingChoiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // User's choice becomes the value of lodgingChoice
                lodgingChoice = newValue;
            }
        });
    }



    // Transportation methods

    // Method to add transportation amount to the total amount of money spent
    public void addTransportationAmount(ActionEvent actionEvent) {
        // Create a double variable to store user input
        transportationAmount = Double.parseDouble(textGetTransportationAmount.getText());

        // Add user input to the total amount of money spent
        totalAmount += transportationAmount;

        // Display the new total amount of money
        lblMoneySpent.setText(Double.toString(totalAmount));

        // Disable text field and button for transportation
        textGetTransportationAmount.setDisable(true);
        btnAddTransportationAmount.setDisable(true);
    }



    // Lodging methods

    // Method to add lodging amount to the total amount of money spent
    public void addLodgingAmount(ActionEvent actionEvent) {
        // Create a double variable to store user input
        lodgingAmount = Double.parseDouble(textGetLodgingAmount.getText());

        // Add user input to the total amount of money spent
        totalAmount += lodgingAmount;

        // Display the new total amount of money
        lblMoneySpent.setText(Double.toString(totalAmount));

        // Disable text field and button for lodging
        textGetLodgingAmount.setDisable(true);
        btnAddLodgingAmount.setDisable(true);
    }



    // Food methods

    // Method to add food amount to the total amount of money spent
    public void addFoodAmount(ActionEvent actionEvent) {
        // Create a double variable to store user input
        foodAmount = Double.parseDouble(textGetFoodAmount.getText());

        // Add user input to the total amount of money spent
        totalAmount += foodAmount;

        // Display the new total amount of money
        lblMoneySpent.setText(Double.toString(totalAmount));

        // Disable text field and button for food
        textGetFoodAmount.setDisable(true);
        btnAddFoodAmount.setDisable(true);
    }



    // Miscellaneous methods

    // Method to add miscellaneous amount to the total amount of money spent
    public void addMiscellaneousAmount(ActionEvent actionEvent) {
        // Create a double variable to store user input
        miscellaneousAmount = Double.parseDouble(textGetMiscellaneousAmount.getText());

        // Add user input to the total amount of money spent
        totalAmount += miscellaneousAmount;

        // Display the new total amount of money
        lblMoneySpent.setText(Double.toString(totalAmount));

        // Disable text field and button for miscellaneous
        textGetMiscellaneousAmount.setDisable(true);
        btnAddMiscellaneousAmount.setDisable(true);
    }



    // Method to check if total amount of money spent exceeds budget
    public void checkMoneySpent() {
        // Create double variables to compare user's budget with the total amount of money spent
        double moneySpent = Double.parseDouble(lblMoneySpent.getText());
        double userBudget = Double.parseDouble(textUserBudget.getText());

        // If statement to check if total amount of money spent is greater than the budget amount
        if (moneySpent > userBudget) {
            // Label warns user that they exceeded their budget
            lblAmountWarning.setText("You have exceeded your budget!");
        }

        // If statement to check if total amount of money spent is close to the budget amount
        else if (moneySpent >= (userBudget - 20)) {
            lblAmountWarning.setText("You may exceed your budget!");
        }

        // Else statement for if total amount is within the budget
        else {
            // Label does not need to be displayed because user is not close to exceeding their budget
            lblAmountWarning.setText("");
        }
    }


    // Method to save user's input into the tripExpenses text file
    public void saveExpenses(ActionEvent actionEvent) throws IOException {
        // Create a Trip object with all of the user's choices as the parameters
        Trip userTrip = new Trip(transportChoice, lodgingChoice, foodChoice);

        // Create an Amount object with all of the user's amount inputs as the parameters
        Amount userAmount = new Amount(Double.parseDouble(textGetTransportationAmount.getText()), Double.parseDouble(textGetLodgingAmount.getText()), Double.parseDouble(textGetFoodAmount.getText()), Double.parseDouble(textGetMiscellaneousAmount.getText()));

        // Get the total amount of the user's amount inputs
        userAmount.getTotalAmt();

        // Write the Trip object to the tripExpenses text file using the writeToFile method
        userTrip.writeToFile();

        // Write the Amount object to the tripExpenses text file using the writeAmt method
        userAmount.writeAmt();
    }


    // Method to reset everything and clear all the variables
    // User can use the trip planner again after pressing the reset button
    public void resetAll(ActionEvent actionEvent) {
        // Reset label for amount of money spent
        lblMoneySpent.setText("0");

        // Reset variable that keeps track of the amount of money the user inputs
        totalAmount = 0;

        // Reset warning label for if amount spent is more than budget
        lblAmountWarning.setText("");

        // Clear text fields
        textGetTransportationAmount.clear();
        textGetLodgingAmount.clear();
        textGetFoodAmount.clear();
        textGetMiscellaneousAmount.clear();
        textUserBudget.clear();

        // Enable text fields
        textGetTransportationAmount.setDisable(false);
        textGetLodgingAmount.setDisable(false);
        textGetFoodAmount.setDisable(false);
        textGetMiscellaneousAmount.setDisable(false);

        // Reset amount spend on each category
        transportationAmount = 0;
        lodgingAmount = 0;
        foodAmount = 0;
        miscellaneousAmount = 0;

        // Enable add buttons
        btnAddTransportationAmount.setDisable(false);
        btnAddLodgingAmount.setDisable(false);
        btnAddFoodAmount.setDisable(false);
        btnAddMiscellaneousAmount.setDisable(false);
    }

}
