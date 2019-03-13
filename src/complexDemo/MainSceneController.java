package complexDemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainSceneController {

    public Button performInputButton;
    public Button showOutputButton;

    private Employee emp = new Employee();

    public void performInputButtonClicked(ActionEvent actionEvent) throws IOException {
        // create a FXMLLoader object
        FXMLLoader loader = new FXMLLoader(getClass().getResource("InputStage.fxml"));

        // Create a Scene to contain the new GUI
        Scene inputScene = new Scene(loader.load());

        // Get a reference to the Controller for the new GUI
        InputStageController controller = loader.getController();

        // Tell the controller who its parent window is
        controller.setParent(MainSceneController.this);

        // Put the scene into a Stage and show it
        Stage inputStage = new Stage();
        inputStage.setScene(inputScene);
        inputStage.initModality(Modality.APPLICATION_MODAL);
        inputStage.show();
    }

    public void showOutputButtonClicked(ActionEvent actionEvent) throws IOException {
        // create a FXMLLoader object
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OutputStage.fxml"));

        // Create a Scene to contain the new GUI
        Scene outputScene = new Scene(loader.load());

        // Get a reference to the Controller for the new GUI
        OutputStageController controller = loader.getController();

        // Pass the data to be displayed to the controller
        controller.setEmployeeToDisplay(emp);

        // Put the scene into a Stage and show it
        Stage outputStage = new Stage();
        outputStage.setScene(outputScene);
        outputStage.initModality(Modality.APPLICATION_MODAL);
        outputStage.show();
    }


    public void setEmployee(String id, String sn, String fn, String dept) {
        emp = new Employee(id, sn, fn, dept);
    }
}
