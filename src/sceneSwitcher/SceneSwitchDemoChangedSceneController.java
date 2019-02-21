package sceneSwitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Window;

import java.io.IOException;

public class SceneSwitchDemoChangedSceneController {
    public Button goBackButton;

    public void goBack(ActionEvent actionEvent) throws IOException {
        Window mainWindow = goBackButton.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("sceneSwitchDemoMainScene.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
}
