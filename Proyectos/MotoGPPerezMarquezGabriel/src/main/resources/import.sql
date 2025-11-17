-- ============================================
-- PASO 0: EQUIPOS
-- ============================================
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Ducati Factory', 50000, 'Michelin', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Aprilia Racing', 40000, 'Red_Bull', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('KTM Factory', 35000, 'Qatar_Airways', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Yamaha Monster', 45000, 'Monster_Energy', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Honda Repsol', 30000, 'Repsol', 0);

-- ============================================
-- PASO 1: PILOTOS (moto_id se asigna luego)
-- ============================================
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Francesco Bagnaia', NULL, 3, 0, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Marc Marquez', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Alex Marquez', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Fermin Aldeguer', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Fabio Di Giannantonio', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Franco Morbidelli', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Enea Bastianini', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'));

INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Jorge Martin', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Marco Bezzecchi', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Maverick Viñales', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Miguel Oliveira', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Raul Fernandez', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Ai Ogura', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'));

INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Pedro Acosta', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='KTM Factory'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Brad Binder', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='KTM Factory'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Jack Miller', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='KTM Factory'));

INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Fabio Quartararo', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Yamaha Monster'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Alex Rins', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Yamaha Monster'));

INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Joan Mir', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Luca Marini', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Johann Zarco', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'));
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos, equipo_id) VALUES ('Somkiat Chantra', NULL, 0, 0, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'));

-- ============================================
-- PASO 2: MOTOS (SOLO 1 POR MARCA)
-- ============================================
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('Ducati', 1000, 'V4', 0);
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('Aprilia', 1000, 'V4', 0);
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('KTM', 1000, 'V4', 0);
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('Yamaha', 1000, 'Inline-4', 0);
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste) VALUES ('Honda', 1000, 'V4', 0);

-- ============================================
-- PASO 3: ASIGNAR MOTO SEGÚN EL EQUIPO
-- ============================================

UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='Ducati') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='Ducati Factory');
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='Aprilia') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='Aprilia Racing');
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='KTM') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='KTM Factory');
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='Yamaha') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='Yamaha Monster');
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE marca='Honda') WHERE equipo_id = (SELECT id FROM equipo WHERE nombre='Honda Repsol');

-- ============================================
-- PASO 4: CARRERAS
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
-- PASO 5: RELACIÓN CARRERA - EQUIPOS (ManyToMany)
-- ============================================
INSERT INTO carrera_equipos (carrera_id, equipos_id) SELECT c.id, e.id FROM carrera c, equipo e;

-- ============================================
-- PASO 6: CLASIFICACIÓN
-- ============================================
INSERT INTO clasificacion (nombre) VALUES ('Temporada MotoGP 2025');

-- ============================================
-- PASO 7: ASOCIAR CARRERAS A CLASIFICACIÓN
-- ============================================
UPDATE carrera SET clasificacion_id = (SELECT id FROM clasificacion WHERE nombre='Temporada MotoGP 2025');

-- ============================================
-- PASO 8: ASOCIAR EQUIPOS A CLASIFICACIÓN
-- ============================================
UPDATE equipo SET clasificacion_id = (SELECT id FROM clasificacion WHERE nombre='Temporada MotoGP 2025');
