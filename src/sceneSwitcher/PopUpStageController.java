package sceneSwitcher;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class PopUpStageController {

    public Button closeButton;

    public void close(ActionEvent actionEvent) {
        closeButton.getScene().getWindow().hide();
    }
}
