# 🎮 BedroomGameDev

> *Portal comunitario para desarrolladores independientes de videojuegos*

---

## 📋 Descripción del Proyecto

BedroomGameDev es un portal web diseñado para conectar y apoyar a la comunidad de desarrolladores independientes de videojuegos. Nuestro objetivo es crear un espacio donde amateurs, entusiastas y profesionales puedan compartir conocimientos, recursos y experiencias en todas las disciplinas del desarrollo de juegos.

### 🎯 Misión

Facilitar el viaje de aprendizaje autodidacta en el desarrollo de videojuegos, proporcionando un ambiente colaborativo y accesible para todos los niveles de experiencia.

---

## 🛠️ Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| **Java** | 17+ | Backend principal |
| **Spring Boot** | 3.x | Framework web |
| **Thymeleaf** | 3.x | Motor de plantillas |
| **HTML5/CSS3** | - | Frontend responsivo |
| **Maven** | 3.x | Gestión de dependencias |

---

## 🏗️ Estructura del Proyecto

```
bedroomgamedev/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/evaluacion/spring/bedroomgamedev/
│       │       ├── BedroomgamedevApplication.java
│       │       └── controllers/
│       │           └── CentralRestController.java
│       └── resources/
│           └── templates/
│               ├── landing.html
│               ├── home.html
│               ├── login.html
│               ├── settings.html
│               ├── register.html
│               ├── recover.html
│               ├── nosotros.html
│               ├── tutoriales.html
│               └── añadir.html
└── README.md
```

---

## 🎨 Características del Portal

### 🌟 Áreas de Especialización

- **🎵 Diseño de Sonido**: Producción, compresión, ecualización y gain staging
- **💻 Programación**: Recursos educativos para múltiples lenguajes
- **🗺️ World Design**: Análisis de mundos, arte y estilos temáticos

### 📱 Funcionalidades Principales

- **Portal de Bienvenida**: Introducción al ecosistema de desarrollo
- **Sistema de Usuarios**: Registro, login y recuperación de cuentas
- **Centro de Recursos**: Tutoriales, proyectos y assets compartidos
- **Comunidad**: Perfiles de desarrolladores y colaboración
- **Configuración**: Personalización de la experiencia del usuario

---

## 🚀 Instalación y Configuración

### Prerrequisitos

- Java 17 o superior
- Maven 3.6+
- IDE compatible (IntelliJ IDEA, Eclipse, VS Code)

### Pasos de Instalación

1. **Clonar el repositorio**
   ```bash
   git clone [url-del-repositorio]
   cd bedroomgamedev
   ```

2. **Compilar el proyecto**
   ```bash
   mvn clean compile
   ```

3. **Ejecutar la aplicación**
   ```bash
   mvn spring-boot:run
   ```

4. **Acceder al portal**
   ```
   http://localhost:8080
   ```

---

## 🗺️ Rutas y Navegación

| Ruta | Descripción | Estado |
|------|-------------|--------|
| `/` | Página de bienvenida | ✅ Activa |
| `/home` | Portal principal | ✅ Activa |
| `/login` | Inicio de sesión | 🚧 En desarrollo |
| `/register` | Registro de usuarios | 🚧 En desarrollo |
| `/settings` | Configuración | 🚧 En desarrollo |
| `/nosotros` | Equipo de desarrollo | 🚧 En desarrollo |
| `/tutoriales` | Centro de aprendizaje | 🚧 En desarrollo |
| `/añadir` | Subir contenido | 🚧 En desarrollo |
| `/recover` | Recuperar cuenta | 🚧 En desarrollo |

---

## 👥 Equipo de Desarrollo

| Desarrollador | Especialidad |
|---------------|--------------|
| **Camila Rojas** | Diseñadora de narrativa y diálogo |
| **Felipe Mendoza** | Programador de gameplay (Unity/C#) |
| **Daniela Espinoza** | Artista 2D / Ilustradora de personajes |
| **Carlos "Charly" Silva** | Sound designer y compositor indie |
| **María José "Majo" Pizarro** | Productora y community manager |
| **Joaquín "Quino" Fuentes** | QA tester y diseñador de niveles |

---

## 🎨 Diseño Visual

### Paleta de Colores

- **Primario**: Gradiente azul-púrpura (`#667eea` → `#764ba2`)
- **Acento**: Coral vibrante (`#ff6b6b`)
- **Fondo**: Glassmorphism con transparencias
- **Texto**: Blanco con sombras suaves

### Principios de Diseño

- **Responsividad**: Adaptable a todos los dispositivos
- **Accesibilidad**: Contraste adecuado y navegación intuitiva
- **Minimalismo**: Enfoque en contenido sin distracciones
- **Consistencia**: Elementos visuales unificados

---

## 🔧 Desarrollo y Contribución

### Estructura del Controlador

El `CentralRestController` maneja todas las rutas principales:

```java
@Controller
public class CentralRestController {
    
    @GetMapping("/")
    public String landing(Model model) {
        // Configuración de atributos para la vista
        return "landing";
    }
    
    // Más endpoints...
}
```

### Convenciones de Código

- **Nomenclatura**: CamelCase para Java, kebab-case para CSS
- **Comentarios**: Documentación clara y concisa
- **Responsividad**: Mobile-first approach
- **Accesibilidad**: Etiquetas semánticas y ARIA labels

---

## 📈 Roadmap de Desarrollo

### Fase 1 - Fundación ✅
- [x] Estructura básica del proyecto
- [x] Sistema de rutas
- [x] Diseño visual base
- [x] Páginas principales

### Fase 2 - Funcionalidad 🚧
- [ ] Sistema de autenticación
- [ ] Base de datos
- [ ] Gestión de usuarios
- [ ] Subida de contenido

### Fase 3 - Comunidad 📋
- [ ] Sistema de comentarios
- [ ] Valoraciones y reviews
- [ ] Mensajería entre usuarios
- [ ] Eventos y game jams

### Fase 4 - Expansión 📋
- [ ] API REST
- [ ] Aplicación móvil
- [ ] Integración con herramientas de desarrollo
- [ ] Marketplace de assets

---

## 📞 Contacto y Soporte

Para consultas, sugerencias o reportes de bugs:

- **Email**: [contacto@bedroomgamedev.com]
- **Discord**: [Servidor de la comunidad]
- **GitHub**: [Repositorio del proyecto]

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

---

*Desarrollado con ❤️ por la comunidad indie de videojuegos*