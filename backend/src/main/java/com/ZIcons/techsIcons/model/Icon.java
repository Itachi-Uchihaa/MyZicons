package com.ZIcons.techsIcons.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Icon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String format; // Peut être "SVG" ou "PNG"
    private String svgFileName;
    private String pngFileName;

    // Getter pour l'ID
    public Long getId() {
        return id;
    }

    // Setter pour l'ID (facultatif si vous n'avez pas besoin de le modifier manuellement)
    public void setId(Long id) {
        this.id = id;
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Setter pour le nom
    public void setName(String name) {
        this.name = name;
    }

    // Getter pour le format
    public String getFormat() {
        return format;
    }

    // Setter pour le format
    public void setFormat(String format) {
        this.format = format;
    }

    // Getter pour le nom du fichier SVG
    public String getSvgFileName() {
        return svgFileName;
    }

    // Setter pour le nom du fichier SVG
    public void setSvgFileName(String svgFileName) {
        this.svgFileName = svgFileName;
    }

    // Getter pour le nom du fichier PNG
    public String getPngFileName() {
        return pngFileName;
    }

    // Setter pour le nom du fichier PNG
    public void setPngFileName(String pngFileName) {
        this.pngFileName = pngFileName;
    }

}



