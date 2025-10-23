package cl.colegioelbelloto.biblioteca.service;

import cl.colegioelbelloto.biblioteca.model.Libro;
import cl.colegioelbelloto.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class LibroServiceImpl implements ILibroService{

    @Autowired
    LibroRepository libroRepository;

    @Override
    public Libro saveLibro(Libro libro) {
        libroRepository.save(libro);
        return libro;
    }

    @Override
    public List<Libro> AllLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro updateLibro(Long idLibro) {
        return null;
    }

    @Override
    public void eliminarLibro(Long idLibro) {
        libroRepository.deleteById(idLibro);

    }

    @Override
    public Libro guardarLibro(Libro libro) {
        return null;
    }


    public void deleteLibro(Long idLibro){
        libroRepository.deleteById(IdLibro);

    }
    public Libro findByIdLibro(Long id){
        return libroRepository.findById(id).orElse(null);

    }



}
