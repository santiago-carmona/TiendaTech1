/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repository;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author santi
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
    //Se crea una consulta derivada para recuperar solo las productos activas
    public List<Producto> findByActivoTrue();
    
}
