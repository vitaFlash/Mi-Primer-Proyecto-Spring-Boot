package com.fizzvibes.demo;
import com.fizzvibes.demo.FraseInspiradora;
import com.fizzvibes.demo.FraseInspiradoraRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FraseInspiradoraService {

    private final FraseInspiradoraRepository repository;

    public FraseInspiradoraService(FraseInspiradoraRepository repository) {
        this.repository = repository;
    }

    public List<FraseInspiradora> obtenerTodas() {
        return repository.findAll();
    }

    public FraseInspiradora guardar(FraseInspiradora frase) {
        return repository.save(frase);
    }

    public FraseInspiradora obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
