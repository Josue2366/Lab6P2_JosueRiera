/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_josuerivera;

/**
 *
 * @author josue
 */
public class Equipos {
    protected String pais;
    protected String nombre;
    protected String Ciudad;
    protected String Estadio;

    public Equipos(String pais, String nombre, String Ciudad, String Estadio) {
        this.pais = pais;
        this.nombre = nombre;
        this.Ciudad = Ciudad;
        this.Estadio = Estadio;
    }

    public Equipos() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
