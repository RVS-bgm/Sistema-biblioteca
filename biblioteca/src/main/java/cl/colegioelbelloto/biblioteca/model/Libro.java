package cl.colegioelbelloto.biblioteca.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

    @Entity
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

        public Libro(Long idLibro, @NonNull String titulo, @NonNull String autor, @NonNull String isbn, Integer anioPublicacion, Integer stock ){
            this.idLibro = idLibro;
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
            this.anioPublicacion = anioPublicacion;
            this.stock = stock;


        }

        public Libro() {
        }

        public Long getIdLibro() {
            return idLibro;
        }

        public void setIdLibro(Long idLibro) {
            this.idLibro = idLibro;
        }

        public @NonNull String getTitulo() {
            return titulo;
        }

        public void setTitulo(@NonNull String titulo) {
            this.titulo = titulo;
        }

        public @NonNull String getAutor() {
            return autor;
        }

        public void setAutor(@NonNull String autor) {
            this.autor = autor;
        }

        public @NonNull String getIsbn() {
            return isbn;
        }

        public void setIsbn(@NonNull String isbn) {
            this.isbn = isbn;
        }

        public Integer getAnioPublicacion() {
            return anioPublicacion;
        }

        public void setAnioPublicacion(Integer anioPublicacion) {
            this.anioPublicacion = anioPublicacion;
        }

        public Integer getStock() {
            return stock;
        }

        public void setStock(Integer stock) {
            this.stock = stock;
        }





    }









