-- ============================================
-- PASO 0: TEMPORADA (Antigua CLASIFICACION)
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
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Francesco Bagnaia', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Marc Marquez', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Alex Marquez', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Fermin Aldeguer', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Fabio Di Giannantonio', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Franco Morbidelli', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Enea Bastianini', NULL, 0, (SELECT id FROM equipo WHERE nombre='Ducati Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Jorge Martin', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Marco Bezzecchi', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Maverick Viñales', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Miguel Oliveira', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Raul Fernandez', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Ai Ogura', NULL, 0, (SELECT id FROM equipo WHERE nombre='Aprilia Racing'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Pedro Acosta', NULL, 0, (SELECT id FROM equipo WHERE nombre='KTM Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Brad Binder', NULL, 0, (SELECT id FROM equipo WHERE nombre='KTM Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Jack Miller', NULL, 0, (SELECT id FROM equipo WHERE nombre='KTM Factory'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Fabio Quartararo', NULL, 0, (SELECT id FROM equipo WHERE nombre='Yamaha Monster'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Alex Rins', NULL, 0, (SELECT id FROM equipo WHERE nombre='Yamaha Monster'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Joan Mir', NULL, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Luca Marini', NULL, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Johann Zarco', NULL, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'), 0, 0, 0, 0);
INSERT INTO piloto (nombre, moto_id, dinero, equipo_id, total_puntos, total_carreras, total_victorias, total_podios) VALUES ('Somkiat Chantra', NULL, 0, (SELECT id FROM equipo WHERE nombre='Honda Repsol'), 0, 0, 0, 0);

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
-- PASO 7: RELACIÓN CARRERA - EQUIPOS (ManyToMany)
-- ============================================
INSERT INTO carrera_equipos (carrera_id, equipos_id) SELECT c.id, e.id FROM carrera c, equipo e;

-- ============================================
-- PASO 8: SIMULAR RESULTADOS DE LA PRIMERA CARRERA
-- ============================================
UPDATE carrera SET jugada = TRUE WHERE nombre_circuito = 'Losail International Circuit';

-- Insertamos resultados
INSERT INTO resultado_carrera (carrera_id, piloto_id, posicion, puntos_obtenidos) VALUES (1, 1, 1, 25);  -- Bagnaia
INSERT INTO resultado_carrera (carrera_id, piloto_id, posicion, puntos_obtenidos) VALUES (1, 15, 2, 20); -- Binder
INSERT INTO resultado_carrera (carrera_id, piloto_id, posicion, puntos_obtenidos) VALUES (1, 8, 3, 16);  -- Martin
INSERT INTO resultado_carrera (carrera_id, piloto_id, posicion, puntos_obtenidos) VALUES (1, 2, 4, 13);  -- Marc Marquez
INSERT INTO resultado_carrera (carrera_id, piloto_id, posicion, puntos_obtenidos) VALUES (1, 14, 9, 7);  -- Acosta
INSERT INTO resultado_carrera (carrera_id, piloto_id, posicion, puntos_obtenidos) VALUES (1, 17, 10, 6); -- Quartararo

-- Actualizamos los totales de los pilotos que puntuaron
UPDATE piloto SET total_puntos = 25, total_carreras = 1, total_victorias = 1, total_podios = 1 WHERE id = 1; -- Bagnaia
UPDATE piloto SET total_puntos = 20, total_carreras = 1, total_victorias = 0, total_podios = 1 WHERE id = 15; -- Binder
UPDATE piloto SET total_puntos = 16, total_carreras = 1, total_victorias = 0, total_podios = 1 WHERE id = 8;  -- Martin
UPDATE piloto SET total_puntos = 13, total_carreras = 1, total_victorias = 0, total_podios = 0 WHERE id = 2;  -- Marc Marquez
UPDATE piloto SET total_puntos = 7, total_carreras = 1, total_victorias = 0, total_podios = 0 WHERE id = 14; -- Acosta
UPDATE piloto SET total_puntos = 6, total_carreras = 1, total_victorias = 0, total_podios = 0 WHERE id = 17; -- Quartararo

-- Actualizamos los totales de los equipos
UPDATE equipo SET total_puntos = (25 + 13) WHERE id = (SELECT id FROM equipo WHERE nombre='Ducati Factory'); -- Bagnaia(25) + M.Marquez(13)
UPDATE equipo SET total_puntos = (20) WHERE id = (SELECT id FROM equipo WHERE nombre='KTM Factory'); -- Binder(20)
UPDATE equipo SET total_puntos = (16) WHERE id = (SELECT id FROM equipo WHERE nombre='Aprilia Racing'); -- Martin(16)
UPDATE equipo SET total_puntos = (6) WHERE id = (SELECT id FROM equipo WHERE nombre='Yamaha Monster'); -- Quartararo(6)