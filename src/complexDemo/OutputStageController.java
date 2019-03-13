package complexDemo;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OutputStageController {

    public Label outputLabel;
    public Button outputStageDoneButton;

    private Employee empToDisplay;

    public void setEmployeeToDisplay(Employee employee){
        // store the data received from the parent GUI
        empToDisplay = employee;

        // display the data on the GUI
        outputLabel.setText(employee.toString());
    }

    public void outputStageDoneButtonClicked(ActionEvent actionEvent) {
        // close the pop-up window
        ((Stage)outputStageDoneButton.getScene().getWindow()).close();
    }
}
