/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiRestaurant.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiRestaurant.dto.PlatilloDto;
import pe.cibertec.ecommerce.ApiRestaurant.entity.Platillo;
import pe.cibertec.ecommerce.ApiRestaurant.dao.PlatilloDao;

@Service
@Transactional
public abstract class PlatilloServiceImpl implements PlatilloService {

private PlatilloDao platilloDao;
    private ModelMapper modelMapper;

    @Autowired
    public PlatilloServiceImpl(PlatilloDao platilloDao, ModelMapper modelMapper) {
        this.platilloDao = platilloDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public void agregarPlatillo(PlatilloDto platillo) {
        platilloDao.agregarPlatillo(platilloDao);
    }

    @Override
    public PlatilloDto obtenerPlatilloPorId(Long id) {
        Platillo platillo = platilloDao.obtenerPlatilloPorId(id);
        return modelMapper.map(platillo, PlatilloDto.class);
    }
}

