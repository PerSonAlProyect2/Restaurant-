package pe.edu.upc.resta.entities;


import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.List;

@Entity
@Table(name="Direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int direccion_id;

    @Column(name="direccion",nullable=false)
    private String direccion;

    @Column(name = "ciudad", nullable=false)
    private String ciudad;

    @Column(name="provincia", nullable=false)
    private String provincia;

    @Column(name="pais", nullable=false)
    private String Pais;

    @Column(name = "telefono", nullable=false)
    private int telefono;

    @ManyToOne
    @JoinColumn(name="user_id")
    private Users user;


    public Direccion() {
    }

    public Direccion(int direccion_id, String direccion, String ciudad, String provincia, String pais, int telefono, Users user) {
        this.direccion_id = direccion_id;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        Pais = pais;
        this.telefono = telefono;
        this.user = user;
    }

    public int getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(int direccion_id) {
        this.direccion_id = direccion_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
