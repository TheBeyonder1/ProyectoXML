package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Empleado extends Persona {
    String codigo;
    String departamento;

    public Empleado() {}
    
    public Empleado(String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);
    }
    public Empleado(String codigo, String departamento, String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);
        this.codigo = codigo;
        this.departamento = departamento;
    }  

    public String getCodigo() {
        return codigo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return " Empleado " + " , " + codigo + " , " + departamento ;
    }
    
    public boolean crearFile(LinkedList<Empleado>Lista)
    {   
            boolean g=false;
        try{
            Element company= new Element("company");
            Document doc= new Document(company);
            for (int i = 0; i < Lista.size(); i++) {
                
            Element empleado= new Element ("empleado");
            empleado.addContent(new Element("Nombre").setText(Lista.get(i).getNombre()));
            empleado.addContent(new Element("Direccion").setText(Lista.get(i).getDireccion()));
            empleado.addContent(new Element("edad").setText(String.valueOf(Lista.get(i).getEdad())));
            empleado.addContent(new Element("Codigo").setText(Lista.get(i).getCodigo()));
            empleado.addContent(new Element("Departamento").setText(Lista.get(i).getDepartamento()));
            
            doc.getRootElement().addContent(empleado);
            
            }
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc,new FileWriter("company.xml"));
            g=true;
            
        }catch(IOException io){
            System.out.println(io.getMessage());
            g=false;
        }
        return false;    
    }

        
}
