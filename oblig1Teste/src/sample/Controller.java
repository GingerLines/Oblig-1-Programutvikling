package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private TextField txtNavn;

    @FXML
    private TextField txtAlder;

    @FXML
    private TextField txtEpost;

    @FXML
    private TextField txtTlfNr;

    @FXML
    private TextField txtDag;

    @FXML
    private TextField txtMåned;

    @FXML
    private TextField txtÅr;

    @FXML
    private Label lblFeilNavn;

    @FXML
    private Label lblFeilAlder;

    @FXML
    private Label lblFeilFødselsdato;

    @FXML
    private Label lblFeilEpost;

    @FXML
    private Label lblFeilTlfNr;

    @FXML
    void Registrer(ActionEvent event) {

    }

}

