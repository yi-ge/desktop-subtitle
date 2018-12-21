package subtitle;

import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * Created by yi-ge
 * 2018-12-21 22:13
 */
public class DragUtil {
    public static void addDragListener(Stage stage, Node root) {
        new DragListener(stage).enableDrag(root);
    }
}
