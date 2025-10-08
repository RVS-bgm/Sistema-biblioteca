package cl.colegioelbelloto.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

    @Entity
    @Builder
    @AllArgsConstructor
    @Data

    public class Libro {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idLibro;
        @NonNull
        private String titulo;
        @NonNull
        private String autor;
        @NonNull
        @Column(unique = true)
        private String isbn;
        private Integer anioPublicacion;
        private Integer stock;




    }









