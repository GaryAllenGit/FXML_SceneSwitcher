package simpleDemo;

import complexDemo.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainController {

    public Button changeSceneButton;
    public Button showPopUpStageButton;

    public void changeScene(ActionEvent actionEvent) throws IOException {
        Window mainWindow = changeSceneButton.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("ChangedScene.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }

    public void showPopUpStage(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("popUpStage.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

    }
}
