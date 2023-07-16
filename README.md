# ExercicioModuloQuatro

## INSERT INTO rebeldes(nome, idade, genero, localizacao, traidor, reports) VALUES
('Luke', 22, 'Masculino', 'Tatooine', false, 0),
('Leia', 22, 'Feminino', 'Alderaan', false, 0),
('Han', 30, 'Masculino', 'Corellia', false, 0),
('Darth Vader', 45, 'Masculino', 'Tatooine', true, 5);


## INSERT INTO recursos(nome, valor) VALUES
('Arma', 100),
('Munição', 30),
('Água', 5),
('Comida', 15);


## INSERT INTO inventario(rebelde_id, recurso_id, quantidade) VALUES
(1, 1, 2),  -- Luke tem 2 Armas
(1, 2, 100), -- Luke tem 100 Munições
(2, 3, 10),  -- Leia tem 10 Águas
(2, 4, 20),  -- Leia tem 20 Comidas
(3, 1, 1),   -- Han tem 1 Arma
(3, 2, 50),  -- Han tem 50 Munições
(4, 1, 3),   -- Darth Vader tem 3 Armas
(4, 2, 200); -- Darth Vader tem 200 Munições


## SELECT rebeldes.nome, recursos.nome, inventario.quantidade


FROM rebeldes
INNER JOIN inventario ON rebeldes.id = inventario.rebelde_id
INNER JOIN recursos ON inventario.recurso_id = recursos.id;
SELECT rebeldes.nome, recursos.nome, inventario.quantidade


FROM rebeldes
LEFT JOIN inventario ON rebeldes.id = inventario.rebelde_id
LEFT JOIN recursos ON inventario.recurso_id = recursos.id;
SELECT rebeldes.nome, recursos.nome, inventario.quantidade


FROM inventario
RIGHT JOIN rebeldes ON rebeldes.id = inventario.rebelde_id
RIGHT JOIN recursos ON inventario.recurso_id = recursos.id;
SELECT rebeldes.nome, recursos.nome, inventario.quantidade


FROM rebeldes
FULL JOIN inventario ON rebeldes.id = inventario.rebelde_id
FULL JOIN recursos ON inventario.recurso_id = recursos.id;
