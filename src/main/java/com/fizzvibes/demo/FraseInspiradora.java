package com.fizzvibes.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class FraseInspiradora {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String contenido;
        private String autor;
        private String fuente;
        private String categoria;
        private LocalDate fecha;

        // Getters y setters

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getContenido() { return contenido; }
        public void setContenido(String contenido) { this.contenido = contenido; }

        public String getAutor() { return autor; }
        public void setAutor(String autor) { this.autor = autor; }

        public String getFuente() { return fuente; }
        public void setFuente(String fuente) { this.fuente = fuente; }

        public String getCategoria() { return categoria; }
        public void setCategoria(String categoria) { this.categoria = categoria; }

        public LocalDate getFecha() { return fecha; }
        public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    }


