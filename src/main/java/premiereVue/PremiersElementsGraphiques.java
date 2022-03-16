package premiereVue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class PremiersElementsGraphiques extends Application {
    public void start(Stage stage)   {
        VBox root = new VBox(10);
        Label labelHello = new Label("Hello");
        root.getChildren().add(labelHello);
        Label labelHelloBis = new Label("Hello Java FX");
        root.getChildren().add(labelHelloBis);
        Scene scene = new Scene(root,600,90);
        stage.setScene(scene);
        stage.setTitle("NOproblem");
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch();
    }

}
