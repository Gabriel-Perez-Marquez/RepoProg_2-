-- ============================================
-- PASO 0: TEMPORADA
-- ============================================
INSERT INTO temporada (nombre) VALUES ('Temporada MotoGP 2025');

-- ============================================
-- PASO 1: MECÁNICOS (Ahora se crean PRIMERO)
-- ============================================
-- Creamos solo 2 mecánicos para repartirselos entre los 5 equipos
INSERT INTO mecanico (nombre, cuota) VALUES ('Santi Hernández', 1500);
INSERT INTO mecanico (nombre, cuota) VALUES ('Giacomo Guidotti', 1200);


-- ============================================
-- PASO 2: EQUIPOS (Ahora llevan la referencia al mecánico)
-- ============================================

-- Santi Hernández (ID 1) se encarga de Ducati, Aprilia y KTM
INSERT INTO equipo (nombre, dinero, patrocinador, total_puntos, temporada_id, mecanico_id) 
VALUES ('Ducati Factory', 50000, 'Michelin', 0, (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'),(SELECT id FROM mecanico WHERE nombre='Santi Hernández'));

INSERT INTO equipo (nombre, dinero, patrocinador, total_puntos, temporada_id, mecanico_id) 
VALUES ('Aprilia Racing', 40000, 'Red_Bull', 0, 
    (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'),
    (SELECT id FROM mecanico WHERE nombre='Santi Hernández'));

INSERT INTO equipo (nombre, dinero, patrocinador, total_puntos, temporada_id, mecanico_id) 
VALUES ('KTM Factory', 35000, 'Qatar_Airways', 0, 
    (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'),
    (SELECT id FROM mecanico WHERE nombre='Santi Hernández'));


-- Giacomo Guidotti (ID 2) se encarga de Yamaha y Honda
INSERT INTO equipo (nombre, dinero, patrocinador, total_puntos, temporada_id, mecanico_id) 
VALUES ('Yamaha Monster', 45000, 'Monster_Energy', 0, 
    (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'),
    (SELECT id FROM mecanico WHERE nombre='Giacomo Guidotti'));

INSERT INTO equipo (nombre, dinero, patrocinador, total_puntos, temporada_id, mecanico_id) 
VALUES ('Honda Repsol', 30000, 'Repsol', 0, 
    (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'),
    (SELECT id FROM mecanico WHERE nombre='Giacomo Guidotti'));
-- ============================================
-- PASO 2: MOTOS
-- ============================================
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('Ducati', 1000, 'V4', 0);
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('Aprilia', 1000, 'V4', 0);
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('KTM', 1000, 'V4', 0);
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('Yamaha', 1000, 'Inline-4', 0);
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('Honda', 1000, 'V4', 0);

-- ============================================
-- PASO 3: PILOTOS
-- ============================================

-- Ducati
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Francesco Bagnaia', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Marc Marquez', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Alex Marquez', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);

-- Aprilia
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Jorge Martin', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Marco Bezzecchi', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Maverick Viñales', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);

-- KTM
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Pedro Acosta', NULL, 0, (SELECT id FROM equipo WHERE nombre='KTM Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Brad Binder', NULL, 0, (SELECT id FROM equipo WHERE nombre='KTM Factory'), 0, 0, 0, 0);

-- Yamaha
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Fabio Quartararo', NULL, 0, (SELECT id FROM equipo WHERE nombre='Yamaha Monster'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Alex Rins', NULL, 0, (SELECT id FROM equipo WHERE nombre='Yamaha Monster'), 0, 0, 0, 0);

-- Honda
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Joan Mir', NULL, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Luca Marini', NULL, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'), 0, 0, 0, 0);

-- ============================================
-- PASO 4: ASIGNAR MOTO SEGÚN EL EQUIPO
-- ============================================
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='Ducati') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='Ducati Factory');
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='Aprilia') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='Aprilia Racing');
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='KTM') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='KTM Factory');
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='Yamaha') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='Yamaha Monster');
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='Honda') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='Honda Repsol');

-- ============================================
-- PASO 5: CARRERAS
-- Importante: FORMATO DE FECHA CORREGIDO (YYYY-MM-DD) para evitar errores de parseo
-- ============================================
INSERT INTO carrera (nombre_circuito, fecha, temporada_id, jugada) VALUES ('Losail International Circuit', '2025-03-10', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), FALSE);
INSERT INTO carrera (nombre_circuito, fecha, temporada_id, jugada) VALUES ('Autódromo Termas de Río Hondo', '2025-03-24', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), FALSE);
INSERT INTO carrera (nombre_circuito, fecha, temporada_id, jugada) VALUES ('Circuit of the Americas', '2025-04-07', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), FALSE);
INSERT INTO carrera (nombre_circuito, fecha, temporada_id, jugada) VALUES ('Circuit de Jerez - Ángel Nieto', '2025-04-21', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), FALSE);



-- ============================================
-- PASO 7: RELACIÓN CARRERA - EQUIPOS
-- ============================================
INSERT INTO carrera_equipos (carrera_id, equipos_id) SELECT c.id, e.id FROM carrera c, equipo e;