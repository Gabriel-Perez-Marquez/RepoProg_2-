-- ============================================
-- PASO 0: Insertar EQUIPOS
-- ============================================
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Ducati Factory', 50000.0, 'Michelin', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Aprilia Racing', 40000.0, 'Red_Bull', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('KTM Factory', 35000.0, 'Qatar_Airways', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Yamaha Monster', 45000.0, 'Monster_Energy', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Honda Repsol', 30000.0, 'Repsol', 0);

-- ============================================
-- PASO 1: Insertar PILOTOS con relación a EQUIPO
-- ============================================

-- Ducati Factory
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Francesco Bagnaia', NULL, 3, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Ducati Factory' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Marc Marquez', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Ducati Factory' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Alex Marquez', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Ducati Factory' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Fermin Aldeguer', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Ducati Factory' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Fabio Di Giannantonio', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Ducati Factory' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Franco Morbidelli', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Ducati Factory' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Enea Bastianini', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Ducati Factory' LIMIT 1));

-- Aprilia Racing
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Jorge Martin', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Aprilia Racing' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Marco Bezzecchi', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Aprilia Racing' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Maverick Viñales', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Aprilia Racing' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Miguel Oliveira', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Aprilia Racing' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Raul Fernandez', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Aprilia Racing' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Ai Ogura', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Aprilia Racing' LIMIT 1));

-- KTM Factory
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Pedro Acosta', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'KTM Factory' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Brad Binder', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'KTM Factory' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Jack Miller', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'KTM Factory' LIMIT 1));

-- Yamaha Monster
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Fabio Quartararo', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Yamaha Monster' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Alex Rins', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Yamaha Monster' LIMIT 1));

-- Honda Repsol
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Joan Mir', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Honda Repsol' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Luca Marini', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Honda Repsol' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Johann Zarco', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Honda Repsol' LIMIT 1));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Somkiat Chantra', NULL, 0, 0.0, 0, (SELECT id FROM equipo WHERE nombre = 'Honda Repsol' LIMIT 1));

-- ============================================
-- PASO 2: Insertar MOTOS
-- ============================================
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'Ducati', 1000, 'V4', 0, p.id FROM piloto p WHERE p.nombre = 'Francesco Bagnaia';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'Ducati', 1000, 'V4', 0, p.id FROM piloto p WHERE p.nombre = 'Marc Marquez';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'Aprilia', 1000, 'V4', 0, p.id FROM piloto p WHERE p.nombre = 'Jorge Martin';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'Aprilia', 1000, 'V4', 0, p.id FROM piloto p WHERE p.nombre = 'Marco Bezzecchi';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'KTM', 1000, 'V4', 0, p.id FROM piloto p WHERE p.nombre = 'Pedro Acosta';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'KTM', 1000, 'V4', 0, p.id FROM piloto p WHERE p.nombre = 'Brad Binder';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'Yamaha', 1000, 'Inline-4', 0, p.id FROM piloto p WHERE p.nombre = 'Fabio Quartararo';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'Yamaha', 1000, 'Inline-4', 0, p.id FROM piloto p WHERE p.nombre = 'Alex Rins';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'Honda', 1000, 'V4', 0, p.id FROM piloto p WHERE p.nombre = 'Joan Mir';
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) SELECT 'Honda', 1000, 'V4', 0, p.id FROM piloto p WHERE p.nombre = 'Luca Marini';

-- ============================================
-- PASO 3: Actualizar pilotos con su moto
-- ============================================
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE piloto_id = piloto.id LIMIT 1);

-- ============================================
-- PASO 4: Insertar CARRERAS
-- ============================================
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Losail International Circuit', '2025-03-10', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Autódromo Termas de Río Hondo', '2025-03-24', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Circuit of the Americas', '2025-04-07', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Circuit de Jerez - Ángel Nieto', '2025-04-21', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Le Mans', '2025-05-05', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Mugello Circuit', '2025-05-19', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('TT Circuit Assen', '2025-06-09', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Silverstone Circuit', '2025-07-07', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Red Bull Ring', '2025-08-04', NULL, FALSE);
INSERT INTO carrera (nombre_circuito, fecha, clasificacion_id, jugada) VALUES ('Circuit Ricardo Tormo', '2025-11-16', NULL, FALSE);

-- ============================================
-- PASO 5: Relacionar CARRERAS con EQUIPOS (ManyToMany)
-- ============================================
INSERT INTO carrera_equipos (carrera_id, equipos_id) SELECT c.id, e.id FROM carrera c, equipo e;

-- ============================================
-- PASO 6: Insertar CLASIFICACION
-- ============================================
INSERT INTO clasificacion (nombre) VALUES ('Temporada MotoGP 2025');

-- ============================================
-- PASO 7: Asociar CARRERAS a la CLASIFICACION
-- ============================================
UPDATE carrera SET clasificacion_id = (SELECT id FROM clasificacion WHERE nombre = 'Temporada MotoGP 2025' LIMIT 1);

-- ============================================
-- PASO 8: Asociar EQUIPOS a la CLASIFICACION
-- ============================================
UPDATE equipo SET clasificacion_id = (SELECT id FROM clasificacion WHERE nombre = 'Temporada MotoGP 2025' LIMIT 1);
