package com.ZIcons.techsIcons.service;

import com.ZIcons.techsIcons.model.Icon;
import com.ZIcons.techsIcons.repositorie.IconRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class IconService {

    @Autowired
    private IconRepository iconRepository;

    @PostConstruct
    public void initData() {
        // Supposons que vous ayez des fichiers dans les répertoires "svgAll" et "PngAll"
        File svgDirectory = new File("icons/svgAll");
        File pngDirectory = new File("icons/pngAll");

        System.out.println(pngDirectory);
        System.out.println("png en haut");
        System.out.println(svgDirectory);
        System.out.println("ici");

        if (svgDirectory.exists() && svgDirectory.isDirectory() && svgDirectory.listFiles() != null) {
            for (File svgFile : svgDirectory.listFiles()) {
                if (svgFile.isFile() && svgFile.getName().endsWith(".svg")) {
                    String iconName = svgFile.getName().replace(".svg", "");
                    Icon icon = new Icon();
                    icon.setName(iconName);
                    icon.setFormat("SVG");
                    icon.setSvgFileName(svgFile.getName());
                    iconRepository.save(icon);
                }
            }
        }

        if (pngDirectory.exists() && pngDirectory.isDirectory() && pngDirectory.listFiles() != null) {
            for (File pngFile : pngDirectory.listFiles()) {
                if (pngFile.isFile() && pngFile.getName().endsWith(".png")) {
                    String iconName = pngFile.getName().replace(".png", "");
                    Icon icon = new Icon();
                    icon.setName(iconName);
                    icon.setFormat("PNG");
                    icon.setPngFileName(pngFile.getName());
                    iconRepository.save(icon);
                }
            }
        }

    }

}
