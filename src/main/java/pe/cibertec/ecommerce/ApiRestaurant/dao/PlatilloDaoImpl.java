/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiRestaurant.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import pe.cibertec.ecommerce.ApiRestaurant.dto.PlatilloDto;
import pe.cibertec.ecommerce.ApiRestaurant.entity.Platillo;

/**
 *
 * @author DIEGO
 */
public class PlatilloDaoImpl implements PlatilloDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void agregarPlatillo(PlatilloDao platillo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Platillo obtenerPlatilloPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Platillo> obtenerTodosLosPlatillos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
}
