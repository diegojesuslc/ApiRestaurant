
package pe.cibertec.ecommerce.ApiRestaurant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiRestaurant.dto.PlatilloDto;
import pe.cibertec.ecommerce.ApiRestaurant.service.PlatilloService;


@RestController
@RequestMapping("/api/platillos")
public class PlatilloController {
    
     private PlatilloService platilloService;

    @Autowired
    public PlatilloController(PlatilloService platilloService) {
        this.platilloService = platilloService;
    }

    @PostMapping
    public ResponseEntity<String> agregarPlatillo(@RequestBody PlatilloDto platilloDto) {
        platilloService.agregarPlatillo(platilloDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Platillo agregado correctamente");
    }

    @GetMapping("/id")
    public ResponseEntity<PlatilloDto> obtenerPlatilloPorId(@PathVariable Long id) {
        PlatilloDto platilloDto = platilloService.obtenerPlatilloPorId(id);
        if (platilloDto != null) {
            return ResponseEntity.ok(platilloDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<PlatilloDto>> obtenerTodosLosPlatillos() {
        List<PlatilloDto> platillos = platilloService.obtenerTodosLosPlatillos();
        return ResponseEntity.ok(platillos);
    }
}
