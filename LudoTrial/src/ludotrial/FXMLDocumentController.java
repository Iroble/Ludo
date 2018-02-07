/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludotrial;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author nele
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    // Method for dice
    private void handleButtonAction(ActionEvent event) {
        //The following Line is used to genrate a random num
        Random r = new Random();
        //Declaring result an integer
        int result = 0;
        //Result cannot be higher than 6
        result = r.nextInt(6);
        // This ensure you will not get 0
        result++;
        // Prints dice result on netbeans
        System.out.println(result);
        // Prints result on the label on the GUI
        label.setText(String.valueOf(result));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
