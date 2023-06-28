/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiRestaurant.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiRestaurant.dto.PlatilloDto;


public interface PlatilloService {
    
     void agregarPlatillo(PlatilloDto platillo);
    PlatilloDto obtenerPlatilloPorId(Long id);
    List<PlatilloDto> obtenerTodosLosPlatillos();
}
