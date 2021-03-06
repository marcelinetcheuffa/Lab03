
/**
 * Sample Skeleton for 'SpellChecker.fxml' Controller Class
 */

package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.controller.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class SpellCheckerController {
	
	private Dictionary dictionary ;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="cmb"
    private ComboBox<String> cmb; // Value injected by FXMLLoader

    @FXML // fx:id="txtMessageInput"
    private TextArea txtMessageInput; // Value injected by FXMLLoader

    @FXML // fx:id="btnSpellCheck"
    private Button btnSpellCheck; // Value injected by FXMLLoader

    @FXML // fx:id="txtMessageOutPut"
    private TextArea txtMessageOutPut; // Value injected by FXMLLoader

    @FXML // fx:id="btnClearText"
    private Button btnClearText; // Value injected by FXMLLoader

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doLanguage(ActionEvent event) {
    	dictionary.loadDictionary(cmb.getValue());

    }

    @FXML
    void doSpellCheck(ActionEvent event) {
    	//txtMessageInput.setText("");
    	dictionary.loadDictionary("Italian");
    	
    	

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert cmb != null : "fx:id=\"cmb\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtMessageInput != null : "fx:id=\"txtMessageInput\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnSpellCheck != null : "fx:id=\"btnSpellCheck\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtMessageOutPut != null : "fx:id=\"txtMessageOutPut\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        
        cmb.getItems().add("Italian");
        cmb.getItems().add("English");
        cmb.getSelectionModel().selectFirst();


    }
    
    /**
	 * @param dictionary the dictionary to set
	 */
	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
}


