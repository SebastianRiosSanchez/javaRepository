package com.apirest.apirest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.apirest.Repositories.IProductoRepository;
import com.apirest.apirest.Entities.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoRepository productoRepository;

    // GET ALL
    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    // GET ONE
    @GetMapping("/{id}")
    public Producto getProductById(@PathVariable Long id) {
        return productoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("No se encontró el producto con el id " + id));
    }

    // POST
    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    // PUT
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        Producto productoEntcontrado = productoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("No se econtró el producto con el id " + id));

        productoEntcontrado.setNombre(producto.getNombre());
        productoEntcontrado.setPrecio(producto.getPrecio());
        return productoRepository.save(productoEntcontrado);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable Long id) {
        Producto productoEncontrado = productoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("No se encontró el producto con el id " + id));

        productoRepository.delete(productoEncontrado);
        return "El producto con el " + id + " se eliminó correctamente";
    }

}
