package sceneSwitcher;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PopUpStageController {

    public Button closeButton;

    public void close(ActionEvent actionEvent) {
        ((Stage)closeButton.getScene().getWindow()).close();
    }
}
