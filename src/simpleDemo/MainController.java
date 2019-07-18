package simpleDemo;

import complexDemo.Employee;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Random;

public class MainController {

    public Button changeSceneButton;
    public Button showPopUpStageButton;

    public void changeScene(ActionEvent actionEvent) throws IOException {
        Window mainWindow = changeSceneButton.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("ChangedScene.fxml"));

        // Let's have a bit of fun here with some transition effects as the new scene is displayed
        // Pick a random number, 1 to 3:
        int rand = new Random().nextInt(3) + 1;

        // Use the random number to pick a random transition
        switch (rand) {
            case 1: // Rotation
                RotateTransition rot = new RotateTransition();
                rot.setDuration(Duration.millis(500));
                rot.setFromAngle(0.0);
                rot.setToAngle(360.0);
                rot.setNode(newRoot);
                rot.play();
                break;

            case 2: // Fade
                FadeTransition fader = new FadeTransition();
                fader.setDuration(Duration.millis(2000));
                fader.setFromValue(0.1);
                fader.setToValue(1.0);
                fader.setNode(newRoot);
                fader.play();
                break;

            case 3: // Scale
                ScaleTransition scaler = new ScaleTransition();
                scaler.setDuration(Duration.millis(500));
                scaler.setFromX(0.1);
                scaler.setToX(1.0);
                scaler.setFromY(0.1);
                scaler.setToY(1.0);
                scaler.setNode(newRoot);
                scaler.play();
                break;
        }

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
