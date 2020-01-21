package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtFødtDag;

    @FXML
    private TextField txtAlder;

    @FXML
    private TextField txtNavn;

    @FXML
    private TextField txtFødtMåned;

    @FXML
    private TextField txtFødtÅr;

    @FXML
    void sendSvar(ActionEvent event) {
        int innAlder, innFødtDag, innFødtMåned, innFødtÅr;
        try{
            innAlder = Integer.parseInt(txtAlder.getText());
        }

    }

}
