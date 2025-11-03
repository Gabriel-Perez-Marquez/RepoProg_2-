-- PASO 1: Insertar pilotos sin moto
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Francesco Bagnaia', NULL, 3, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Marc Marquez', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Jorge Martin', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Marco Bezzecchi', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Pedro Acosta', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Brad Binder', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Fabio Quartararo', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Alex Rins', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Joan Mir', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Luca Marini', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Alex Marquez', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Fermin Aldeguer', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Fabio Di Giannantonio', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Franco Morbidelli', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Maverick Viñales', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Enea Bastianini', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Miguel Oliveira', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Jack Miller', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Raul Fernandez', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Ai Ogura', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Johann Zarco', NULL, 0, 0.0, 0);
INSERT INTO piloto (nombre, moto_id, num_carreras, dinero, puntos) VALUES ('Somkiat Chantra', NULL, 0, 0.0, 0);

-- PASO 2: Insertar motos (usa porcent_desgaste en lugar de porcentDesgaste)
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Ducati', 0, (SELECT id FROM piloto WHERE nombre = 'Francesco Bagnaia' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Ducati', 0, (SELECT id FROM piloto WHERE nombre = 'Marc Marquez' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Aprilia', 0, (SELECT id FROM piloto WHERE nombre = 'Jorge Martin' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Aprilia', 0, (SELECT id FROM piloto WHERE nombre = 'Marco Bezzecchi' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('KTM', 0, (SELECT id FROM piloto WHERE nombre = 'Pedro Acosta' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('KTM', 0, (SELECT id FROM piloto WHERE nombre = 'Brad Binder' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Yamaha', 0, (SELECT id FROM piloto WHERE nombre = 'Fabio Quartararo' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Yamaha', 0, (SELECT id FROM piloto WHERE nombre = 'Alex Rins' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Honda', 0, (SELECT id FROM piloto WHERE nombre = 'Joan Mir' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Honda', 0, (SELECT id FROM piloto WHERE nombre = 'Luca Marini' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Ducati', 0, (SELECT id FROM piloto WHERE nombre = 'Alex Marquez' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Ducati', 0, (SELECT id FROM piloto WHERE nombre = 'Fermin Aldeguer' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Ducati', 0, (SELECT id FROM piloto WHERE nombre = 'Fabio Di Giannantonio' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Ducati', 0, (SELECT id FROM piloto WHERE nombre = 'Franco Morbidelli' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('KTM', 0, (SELECT id FROM piloto WHERE nombre = 'Maverick Viñales' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('KTM', 0, (SELECT id FROM piloto WHERE nombre = 'Enea Bastianini' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Yamaha', 0, (SELECT id FROM piloto WHERE nombre = 'Miguel Oliveira' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Yamaha', 0, (SELECT id FROM piloto WHERE nombre = 'Jack Miller' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Aprilia', 0, (SELECT id FROM piloto WHERE nombre = 'Raul Fernandez' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Aprilia', 0, (SELECT id FROM piloto WHERE nombre = 'Ai Ogura' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Honda', 0, (SELECT id FROM piloto WHERE nombre = 'Johann Zarco' LIMIT 1));
INSERT INTO moto (marca, porcent_desgaste, piloto_id) VALUES ('Honda', 0, (SELECT id FROM piloto WHERE nombre = 'Somkiat Chantra' LIMIT 1));

-- PASO 3: Actualizar pilotos con su moto correspondiente
UPDATE piloto SET moto_id = (SELECT id FROM moto WHERE piloto_id = piloto.id LIMIT 1);