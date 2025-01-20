package pe.edu.upc.resta.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="Productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int producto_id;

    @Column(name="nombre_producto", nullable=false)
    private String nombre_producto;

    @Column(name="descripcion",nullable=false)
    private String descripcion;

    @Column(name="precio", nullable=false)
    private double precio;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name= "categoria_id")
    private Categoria categoria;

    public Productos() {
    }

    public Productos(int producto_id, String nombre_producto, String descripcion, double precio, Categoria categoria) {
        this.producto_id = producto_id;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
