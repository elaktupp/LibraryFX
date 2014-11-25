/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;

/**
 *
 * @author Ohjelmistokehitys
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Tab tabWelcomeSignIn;
    
    @FXML
    private Tab tabClient;
    
    @FXML
    private Tab tabAdmin;
    
    @FXML
    private void handleButtonSignIn(ActionEvent event) {
        tabWelcomeSignIn.setDisable(true);
        tabClient.setDisable(false);
        tabAdmin.setDisable(false);
    }

    @FXML
    private void handleButtonLogOut(ActionEvent event) {
        tabWelcomeSignIn.setDisable(false);
        tabClient.setDisable(true);
        tabAdmin.setDisable(true);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tabWelcomeSignIn.setDisable(false);
        tabClient.setDisable(true);
        tabAdmin.setDisable(true);
    }    
    
}
