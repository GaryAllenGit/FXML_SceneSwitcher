package complexDemo;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InputStageController {
    public TextField idTF;
    public TextField surnameTF;
    public TextField firstnameTF;
    public TextField departmentTF;

    private MainSceneController parent;

    public Button inputStageDoneButton;

    public void setParent(MainSceneController p){
        // Remember the reference to the parent GUI, then we can call its methods
        parent = p;
    }

    public void inputStageDoneButtonClicked(ActionEvent actionEvent) {
        // call the setEmployee method of the parent GUI
        parent.setEmployee(idTF.getText(), surnameTF.getText(), firstnameTF.getText(), departmentTF.getText());

        // close the pop-up window
        ((Stage)inputStageDoneButton.getScene().getWindow()).close();
    }
}
