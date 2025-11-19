-- ============================================
-- PASO 0: TEMPORADA
-- ============================================
INSERT INTO temporada (nombre) VALUES ('Temporada MotoGP 2025');

-- ============================================
-- PASO 1: EQUIPOS
-- ============================================
INSERT INTO equipo (nombre, dinero, patrocinador, temporada_id, total_puntos) VALUES ('Ducati Factory', 50000, 'Michelin', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), 0);
INSERT INTO equipo (nombre, dinero, patrocinador, temporada_id, total_puntos) VALUES ('Aprilia Racing', 40000, 'Red_Bull', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), 0);
INSERT INTO equipo (nombre, dinero, patrocinador, temporada_id, total_puntos) VALUES ('KTM Factory', 35000, 'Qatar_Airways', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), 0);
INSERT INTO equipo (nombre, dinero, patrocinador, temporada_id, total_puntos) VALUES ('Yamaha Monster', 45000, 'Monster_Energy', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), 0);
INSERT INTO equipo (nombre, dinero, patrocinador, temporada_id, total_puntos) VALUES ('Honda Repsol', 30000, 'Repsol', (SELECT id FROM temporada WHERE nombre='Temporada MotoGP 2025'), 0);

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
-- PASO 6: MECÁNICOS
-- ============================================
INSERT INTO mecanico (nombre, cuota, equipo_id) VALUES ('Giacomo Guidotti', 1000, (SELECT id FROM equipo WHERE nombre='Honda Repsol'));
INSERT INTO mecanico (nombre, cuota, equipo_id) VALUES ('Santi Hernández', 1000, (SELECT id FROM equipo WHERE nombre='Ducati Factory'));

-- ============================================
-- PASO 7: RELACIÓN CARRERA - EQUIPOS
-- ============================================
INSERT INTO carrera_equipos (carrera_id, equipos_id) SELECT c.id, e.id FROM carrera c, equipo e;