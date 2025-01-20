package pe.edu.upc.resta.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "nombreRol"})})
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;

    @Column(name= "nombreRol", nullable = false)
    private String nombreRol;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private Users user;

    public Rol() {}

    public Rol(int idRol, String nombreRol, Users user) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.user = user;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
