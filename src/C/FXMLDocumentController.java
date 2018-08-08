/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

import Modelo.Empleado;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author santiago.arce
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField textoNombre;
    @FXML
    private TextField textoCodigo;
   @FXML
    private TextField textoEdad;
    @FXML
    private TextField textoDireccion;
    @FXML
    private TextField textoDepto;
    @FXML
    private Label lnombre;
    @FXML
    private Label ledad;
    @FXML 
    private Label lcodigo;
    @FXML
    private Label ldireccion;
    @FXML
    private Label ldepto;
    @FXML
    private Button botonGuardar;
    @FXML
    private Button botonxml;
    LinkedList<Empleado>Lista;

      
    @FXML
    private void AgregarLista(ActionEvent event) {
      
       String nom=textoNombre.getText();
       String dir=textoDireccion.getText();
       int edad=Integer.parseInt(textoEdad.getText());
       String cod=textoCodigo.getText();
       String depto=textoDepto.getText();
        
       Empleado empleado=new Empleado (cod,depto,nom,edad,dir);
       Lista.add(empleado);
       
    }
    
    @FXML
    private void GuardarXML(ActionEvent event) {
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Lista=new LinkedList<>();  
    }    
    
}
