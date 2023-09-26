-- Création de la table techIcons
CREATE TABLE techIcons (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    svg_filename VARCHAR(255),
    png_filename VARCHAR(255),
    format ENUM('SVG', 'PNG')
);