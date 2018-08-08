package Modelo;

import java.util.LinkedList;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;

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
        return "Empleado{" + "codigo=" + codigo + ", departamento=" + departamento + '}';
    }
    
    public boolean CrearFile(LinkedList<Empleado>Lista)
    {   
        try{
            Element company= new Element("company");
            Document doc= new Document(company);
            for (int i = 0; i < Lista.size(); i++) {
                
            Element empleado= new Element ("empleado");
            empleado.addContent(new Element("Nombre").setText(Lista.get(i).getNombre()));
           // empleado.addContent(new Element("edad").setInt(Lista.get(i).getEdad()));
            empleado.addContent(new Element("Direccion").setText(Lista.get(i).getDireccion()));
            empleado.addContent(new Element("Codigo").setText(Lista.get(i).getCodigo()));
            empleado.addContent(new Element("Departamento").setText(Lista.get(i).getDepartamento()));
            }
            
        }
        return false;    
    }
    
}
