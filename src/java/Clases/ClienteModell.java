/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jdara
 */
public class ClienteModell {

    
    
    public String direccion, correo, codigo, telefono, nombre;
    private String appelido;
    
    public ClienteModell (){
    
     
    String nombre = "No ha sido registrado";
    String apellido ="No ha sido registrado";
    String direccion ="No ha sido registrado";
    String correo = "No ha sido registrado";
    String codigo ="No ha sido registrado";
    String telefono ="No ha sido registrado";
        
        
    }

    public ClienteModell(String claseCodigo, String claseNombre, String claseDireccion, String claseCorreo, String claseTelefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  

   
    
    
}
