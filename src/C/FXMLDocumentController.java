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

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField textNombre;
    @FXML
    private TextField textCodigo;
   @FXML
    private TextField textEdad;
    @FXML
    private TextField textDireccion;
    @FXML
    private TextField textDepto;
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
//    @FXML
//    private Button botonGuardar;
//    @FXML
//    private Button botonxml;
    LinkedList<Empleado>Lista;

      
    @FXML
    private void AgregarLista(ActionEvent event) {
      
       String nom=textNombre.getText();
       String dir=textDireccion.getText();
       int edad=Integer.parseInt(textEdad.getText());
       String cod=textCodigo.getText();
       String depto=textDepto.getText();
        
       Empleado empleado=new Empleado (cod,depto,nom,edad,dir);
       Lista.add(empleado);
       
    }
    
    @FXML
    private void GuardarXML(ActionEvent event) {
        Empleado empleado=new Empleado();
        
        boolean guardar=crearFile(Lista);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Lista=new LinkedList<>();  
    }    
    
}
