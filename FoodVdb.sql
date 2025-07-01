CREATE DATABASE IF NOT EXISTS base1;
USE base1;

CREATE TABLE IF NOT EXISTS Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    correo VARCHAR(255) UNIQUE,
    telefono VARCHAR(20),
    nombre VARCHAR(255),
    Apellidos VARCHAR(255)
);

INSERT INTO Usuarios (correo, telefono, nombre, Apellidos)
VALUES ('xmontanoga@ucvvirtual.edu.pe', '+51955567189', 'Xavier', 'Montaño García');
INSERT INTO Usuarios (correo, telefono, nombre, Apellidos)
VALUES ('ncutipaga@ucvvirtual.edu.pe', '+51965128475', 'Naomi', 'Cutipa Gaspar');
INSERT INTO Usuarios (correo, telefono, nombre, Apellidos)
VALUES ('aguzmanza@ucvvirtual.edu.pe', '+51962393534', 'Ariadna', 'Guzman Zamudio');

SELECT * FROM Usuarios;