/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author santiago.arce
 */
public class Empleado {
    String codigo;
    String departamento;

    public Empleado(String codigo, String departamento) {
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
    
    
}
