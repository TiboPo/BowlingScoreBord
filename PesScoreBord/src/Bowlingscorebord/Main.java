package Bowlingscorebord;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        // FXML View
        FXMLLoader lader = new FXMLLoader(getClass().getResource("FXMLView.fxml"));
        Parent root = lader.load();
        
        // Controller
        Controller controller = lader.getController();
        
        // hoofdvenster
        Scene scene = new Scene(root, 1280, 720);
        stage.setScene(scene);
        stage.setTitle("Scorebord Canadian bowling");
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
