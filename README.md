# FoodV - Sistema de Pedidos de Comida

Sistema de pedidos de comida desarrollado en Java con interfaz gráfica para gestionar pedidos de bebidas, snacks y postres.

## Descripción

FoodV es una aplicación de escritorio que permite a los usuarios realizar pedidos de comida, gestionar un carrito de compras y procesar pagos. El sistema incluye características como:

- Gestión de productos por categorías (Bebidas, Snacks, Postres)
- Carrito de compras interactivo
- Sistema de autenticación de usuarios
- Opciones de envío (Delivery y Tienda)
- Métodos de pago (Efectivo y Yape)
- Interfaz gráfica intuitiva

## Requisitos del Sistema

- Java JDK 8 o superior
- MySQL Server
- NetBeans IDE (recomendado para desarrollo)

## Instalación

1. Clonar el repositorio:

```bash
git clone https://github.com/xavierdev25/foodv-app.git
```

2. Importar la base de datos:

```bash
mysql -u [usuario] -p < FoodVdb.sql
```

3. Abrir el proyecto en NetBeans IDE

4. Configurar la conexión a la base de datos en `src/Conexion/Parametros.java`

## Estructura del Proyecto

```
FoodV/
├── src/
│   ├── Conexion/           # Clases para la conexión a la base de datos
│   ├── Vista/              # Interfaces gráficas y lógica de presentación
│   └── img/               # Recursos gráficos
├── build.xml              # Archivo de configuración de construcción
└── FoodVdb.sql           # Script de la base de datos
```

## Uso

1. Ejecute la aplicación desde NetBeans o mediante el archivo JAR generado
2. Inicie sesión con sus credenciales
3. Navegue por las diferentes categorías de productos
4. Agregue productos al carrito
5. Seleccione el método de envío y pago
6. Confirme su pedido

## Contribución

1. Fork el proyecto
2. Cree una rama para su función (`git checkout -b feature/AmazingFeature`)
3. Commit sus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abra un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT - vea el archivo [LICENSE](LICENSE) para más detalles.

## Contacto

David Montaño - xavierdev25@icloud.com
