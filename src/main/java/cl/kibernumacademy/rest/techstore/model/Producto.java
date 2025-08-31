package cl.kibernumacademy.rest.techstore.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Es un auto incrementar para que el id vaya de +1
    private Long idProducto;

    @NotBlank(message = "El nombre no puede esar vacío")
    @Size(max = 100)
    private String nombre;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 100)
    private String descripcion;

    @NotBlank(message = "El precio no puede estar vacío")
    private Double precio;

    @NotBlank(message = "El stock no puede estar vacío")
    private Integer stock;

    @NotBlank(message = "La imagen no puede estar vacía")
    private String imagenUrl;

    @NotBlank(message = "La categoría no puede estar vacía")
    private String categoria;

    // get and set

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

}
