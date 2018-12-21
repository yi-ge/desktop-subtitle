package subtitle;

import com.google.common.io.Resources;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Resources.getResource("sample.fxml"));

        final int width = 1024;
        final int height = 50;

//        Label label = new Label();
//        label.setContentDisplay(ContentDisplay.CENTER);
//        label.setTextFill(Color.web("#0076a3"));
//        label.setFont(new Font(32));
//        label.setMinWidth(1024);
//        label.setPrefWidth(1024);
//        label.setBackground(Background.EMPTY);
//        label.setStyle("-fx-background:transparent;");

        final Scene scene = new Scene(root, width, height);
        scene.setFill(null);

        final Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primaryScreenBounds.getWidth() - width) / 2);
        stage.setY((primaryScreenBounds.getHeight() - height));
        stage.setAlwaysOnTop(true);

        // 拖动监听器
        DragUtil.addDragListener(stage, root);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
