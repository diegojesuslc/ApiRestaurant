/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiRestaurant.dao;

import java.util.List;
import pe.cibertec.ecommerce.ApiRestaurant.entity.Platillo;


public interface PlatilloDao {
    
    void agregarPlatillo(PlatilloDao platillo);
    Platillo obtenerPlatilloPorId(Long id);
    List<Platillo> obtenerTodosLosPlatillos();

}
