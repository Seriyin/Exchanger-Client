package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Client is the main class that springs up user interaction.
 */
public class Client extends Application
{
    @Override
    public void start(Stage stage)
            throws IOException
    {
        Parent root =
                FXMLLoader
                        .load(getClass()
                                      .getResource("../fx/convert.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login Menu");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}