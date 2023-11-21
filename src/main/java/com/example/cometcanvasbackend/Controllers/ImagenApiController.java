package com.example.cometcanvasbackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cometcanvasbackend.Iservice.IimagenService;
import com.example.cometcanvasbackend.modelo.Imagen;

import java.util.List;

/**
 * Controlador REST encargado de gestionar las operaciones relacionadas con las imágenes.
 */
@RestController // Anotación que marca esta clase como un controlador REST
@RequestMapping("/api/imagenes") // Mapea todas las solicitudes a "/api/imagenes" a este controlador
public class ImagenApiController {

    @Autowired // Anotación para la inyección de dependencias de Spring
    private IimagenService imagenService; // Inyección de la interfaz IimagenService

    /**
     * Método para listar imágenes (comentado por razones desconocidas).
     *
     * @return ResponseEntity con una lista de imágenes y código de estado OK (200).
     */
    // @GetMapping("/listar")
    // public ResponseEntity<List<Imagen>> listarImagenes() {
    //     List<Imagen> imagenes = imagenService.listar();
    //     return new ResponseEntity<>(imagenes, HttpStatus.OK);
    // }
}
