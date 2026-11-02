package upi.mbiproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main aplikasi Kalkulator MBI.
 * Memuat BMI-project.fxml yang berada di root source/resources.
 *
 * @author muama
 */
public class MBIproject extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/BMI-project.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Kalkulator MBI");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}