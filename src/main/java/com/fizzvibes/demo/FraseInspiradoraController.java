package com.fizzvibes.demo;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/frases")
public class FraseInspiradoraController {

    private final FraseInspiradoraService service;

    public FraseInspiradoraController(FraseInspiradoraService service) {
        this.service = service;
    }

    @GetMapping
    public List<FraseInspiradora> obtenerTodas() {
        return service.obtenerTodas();
    }

    @PostMapping
    public FraseInspiradora guardar(@RequestBody FraseInspiradora frase) {
        return service.guardar(frase);
    }

    @GetMapping("/{id}")
    public FraseInspiradora obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}