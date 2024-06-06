package TP4_CI.controllers;

import TP4_CI.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("producto")
public class ProductoController {
    @Autowired
    ProductoServiceImpl productoService;

    @GetMapping("/busquedaPorNombre")
    public ResponseEntity<?> busquedaPorNombre(@RequestParam String nombre){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.busquedaPorNombre(nombre));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

}
