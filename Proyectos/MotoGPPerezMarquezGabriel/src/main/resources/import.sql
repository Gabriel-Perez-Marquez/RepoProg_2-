-- ============================
-- PASO 0: Insertar equipos
-- ============================
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Ducati Factory', 50000.0, 'Michelin', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Aprilia Racing', 40000.0, 'Red_Bull', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('KTM Factory', 35000.0, 'Qatar_Airways', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Yamaha Monster', 45000.0, 'Monster_Energy', 0);
INSERT INTO equipo (nombre, dinero, patrocinador, puntos) VALUES ('Honda Repsol', 30000.0, 'Repsol', 0);

-- ============================
-- PASO 1: Insertar pilotos con relación a equipo
-- ============================

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


-- ============================
-- PASO 2: Insertar motos (igual que ya lo tenías)
-- ============================
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Ducati', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Francesco Bagnaia' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Ducati', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Marc Marquez' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Aprilia', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Jorge Martin' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Aprilia', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Marco Bezzecchi' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('KTM', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Pedro Acosta' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('KTM', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Brad Binder' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Yamaha', 1000, 'Inline-4', 0, (SELECT id FROM piloto WHERE nombre = 'Fabio Quartararo' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Yamaha', 1000, 'Inline-4', 0, (SELECT id FROM piloto WHERE nombre = 'Alex Rins' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Honda', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Joan Mir' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Honda', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Luca Marini' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Ducati', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Alex Marquez' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Ducati', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Fermin Aldeguer' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Ducati', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Fabio Di Giannantonio' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Ducati', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Franco Morbidelli' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('KTM', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Maverick Viñales' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('KTM', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Enea Bastianini' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Yamaha', 1000, 'Inline-4', 0, (SELECT id FROM piloto WHERE nombre = 'Miguel Oliveira' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Yamaha', 1000, 'Inline-4', 0, (SELECT id FROM piloto WHERE nombre = 'Jack Miller' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Aprilia', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Raul Fernandez' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Aprilia', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Ai Ogura' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Honda', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Johann Zarco' LIMIT 1));
INSERT INTO moto (marca, cilindrada, tipo_motor, porcent_desgaste, piloto_id) VALUES ('Honda', 1000, 'V4', 0, (SELECT id FROM piloto WHERE nombre = 'Somkiat Chantra' LIMIT 1));


-- ============================
-- PASO 3: Actualizar pilotos con su moto correspondiente
-- ============================
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE piloto_id = piloto.id LIMIT 1);
