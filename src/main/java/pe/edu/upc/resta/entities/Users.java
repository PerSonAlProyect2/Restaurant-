package pe.edu.upc.resta.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(length = 30, unique = true)
    private String username;

    @Column(length = 200)
    private String password;
    private Boolean enabled;

    @Column(name = "nombres", length = 30)
    private String nombres;

    @Column(name = "apellidos", length = 30)
    private String apellidos;

    @Column(name = "telefono")
    private int telefono;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Direccion> direcciones;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private List<Rol> roles;

    public Users() {
    }

    public Users(int idUsuario, String username, String password, Boolean enabled, String nombres, String apellidos, int telefono, List<Direccion> direcciones, List<Rol> roles) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direcciones = direcciones;
        this.roles = roles;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
