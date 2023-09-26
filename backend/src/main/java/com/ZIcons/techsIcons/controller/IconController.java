package com.ZIcons.techsIcons.controller;

import com.ZIcons.techsIcons.model.Icon;
import com.ZIcons.techsIcons.repositorie.IconRepository;
import com.ZIcons.techsIcons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/icon")
public class IconController {

    @Autowired
    IconRepository iconRepository;

    @GetMapping
    public List<Icon> getAllIcons() {
        return iconRepository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Icon> getIconById(@PathVariable Long id) {
        Optional<Icon> icon = iconRepository.findById(id);
        if (icon.isPresent()) {
            return ResponseEntity.ok(icon.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //Fait la recherhce par tag
    @GetMapping("/name/{name}")
    public ResponseEntity<List<Icon>> getIconsByName(@PathVariable String name) {
        List<Icon> icons = iconRepository.findByName(name);
        if (!icons.isEmpty()) {
            return ResponseEntity.ok(icons);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
