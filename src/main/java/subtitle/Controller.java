package subtitle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Task task = new Task(label);
        new Thread(task).start();

    }
}
