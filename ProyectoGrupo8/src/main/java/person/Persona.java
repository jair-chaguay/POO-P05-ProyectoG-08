/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import concurso.Ciudad;

/**
 *
 * @author Beatriz Quizhpi
 */
public class Persona {
    
    // variables de instancia
    private String nombre; 
    private String direccion; 
    private String telefono; 
    private Ciudad ciudad; 
    private String email; 
    // constructor

    public Persona(String nombre, String direccion, String telefono, Ciudad ciudad, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.email = email;
    }

    // Método to string que muestra la información del objeto de la clase persona
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", ciudad=" + ciudad.toString() + ", email=" + email + '}';
    }
// getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}