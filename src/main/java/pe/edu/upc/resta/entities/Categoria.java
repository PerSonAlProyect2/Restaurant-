package pe.edu.upc.resta.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoria_id;

    @Column(name="nombre_categoria", nullable=false)
    private String nombre_categoria;


    @OneToMany(mappedBy = "categoria")
    private List<Productos> products;

    public Categoria() {
    }

    public Categoria(int categoria_id, String nombre_categoria, List<Productos> products) {
        this.categoria_id = categoria_id;
        this.nombre_categoria = nombre_categoria;
        this.products = products;
    }


    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public List<Productos> getProducts() {
        return products;
    }

    public void setProducts(List<Productos> products) {
        this.products = products;
    }
}
