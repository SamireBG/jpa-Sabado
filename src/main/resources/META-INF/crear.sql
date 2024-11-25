-- Crear tabla Categoria
CREATE TABLE biclioteca.categoria(
    codigo varchar(100) NOT NULL,
    nombre varchar(100) NULL,
    CONSTRAINT categoria_pk PRIMARY KEY (codigo)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Crear tabla libros
CREATE TABLE biblioteca.libros (
    isbn VARCHAR(100) NOT NULL,
    titulo VARCHAR(100) NULL,
    autor VARCHAR(100) NULL,
    fecha DATE NULL,
    precio DOUBLE NULL,
    CONSTRAINT libros_pk PRIMARY KEY (isbn)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE biblioteca.estudiantes (
    idEstudiante varchar(100) NOT NULL,
    nombres varchar(100) NULL,
    apellidos varchar(100) NULL,
    correo varchar(100) NULL,
    fechaNacimiento DATE NULL,
    CONSTRAINT estudiantes_pk PRIMARY KEY (idEstudiante)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `cursos` (
    `idCurso` varchar(100) NOT NULL,
    `nombre` varchar(100) DEFAULT NULL,
    `especialidad` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE biblioteca.matricula (
    idEstudiante varchar(100) NOT NULL,
    idCurso varchar(100) NOT NULL,
    CONSTRAINT matricula_pk PRIMARY KEY (idEstudiante,idCurso),
    CONSTRAINT matricula_cursos_FK FOREIGN KEY (idCurso) REFERENCES biblioteca.cursos(idCurso),
    CONSTRAINT matricula_estudiantes_FK FOREIGN KEY (idEstudiante) REFERENCES biblioteca.estudiantes(idEstudiante)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;