package fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Description.
 */
public class LoginController
{
    @FXML
    private MenuItem closeMenuItem;
    @FXML
    private MenuItem aboutMenuItem;
    @FXML
    private TextField usernameField;
    @FXML
    private Label errorUserField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button convertButton;
    @FXML
    private Button exitButton;


    @FXML
    public void loginClicked(ActionEvent actionEvent)
    {

    }

    @FXML
    public void exitPressed(ActionEvent actionEvent)
    {
    }

    @FXML
    public void showHelp(ActionEvent actionEvent)
    {
    }

    @FXML
    void initialize() {}
}
