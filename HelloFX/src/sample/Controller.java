package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {

    public void screenBiblioteca(javafx.event.ActionEvent actionEvent)throws IOException {
        Parent screenBiblio = FXMLLoader.load(getClass().getResource("Cultivos.fxml"));
        Scene biblio = new Scene(screenBiblio);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(biblio);
        window.show();

    }

    public void screenCultivos(javafx.event.ActionEvent actionEvent)throws IOException {
        Parent screenCultiv = FXMLLoader.load(getClass().getResource("Cultivos.fxml"));
        Scene cultiv = new Scene(screenCultiv);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(cultiv);
        window.show();

    }

    public void screenCalendario(javafx.event.ActionEvent actionEvent)throws IOException {
        Parent screenCal = FXMLLoader.load(getClass().getResource("Calendario.fxml"));
        Scene calen = new Scene(screenCal);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(calen);
        window.show();

    }

    public void screenTutoriales(javafx.event.ActionEvent actionEvent)throws IOException {
        Parent screenT = FXMLLoader.load(getClass().getResource("Tutoriales.fxml"));
        Scene tutor = new Scene(screenT);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tutor);
        window.show();

    }

    public void screenContactos(javafx.event.ActionEvent actionEvent)throws IOException {
        Parent screenC = FXMLLoader.load(getClass().getResource("Contactos.fxml"));
        Scene contac = new Scene(screenC);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(contac);
        window.show();

    }

    public javafx.scene.control.Button closeButton;
    public void closeButtonAction(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}