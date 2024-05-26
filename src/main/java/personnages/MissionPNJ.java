package personnages;


import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import application.Main;

public class MissionPNJ extends PNJ {
    private String dialogue;

    public MissionPNJ(double x, double y, String imagePath, String dialogue) {
        super(x, y, imagePath);
        this.dialogue = dialogue;
    }

    @Override
    public void interactWithPlayer(Player player) {
        showDialogue();
    }

    private void showDialogue() {
        Platform.runLater(() -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Mission PNJ");
            alert.setHeaderText(null);
            alert.setContentText(dialogue);
            alert.showAndWait();
        });
    }
}

