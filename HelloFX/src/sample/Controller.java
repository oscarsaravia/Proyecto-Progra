package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    public void changeScreen(javafx.event.ActionEvent actionEvent)throws IOException {
        Parent ventanaparent = FXMLLoader.load(getClass().getResource("C:/Users/oscar/IdeaProjects/HelloFX/src/sample/ventana2.fxml"));
        Scene mitosView = new Scene(ventanaparent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(mitosView);
        window.show();

    }
    public javafx.scene.control.Button closeButton;
    public void closeButtonAction(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}