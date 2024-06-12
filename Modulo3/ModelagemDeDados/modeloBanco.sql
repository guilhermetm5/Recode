CREATE TABLE cliente (  
    id_cliente INTEGER,  
    nome VARCHAR2(20),  
    cpf VARCHAR2(14)  
);

CREATE TABLE pedido (  
    id_pedido INTEGER, 
    id_cliente INTEGER,  
    id_agencia INTEGER, 
    valor DECIMAL(5,2)   
);

CREATE TABLE agencia ( 
    id_agencia INTEGER, 
    nome VARCHAR2(30), 
    cnpj VARCHAR2(20) 
);

CREATE TABLE passagem ( 
    id_passagem INTEGER, 
    id_agencia INTEGER, 
    tipo VARCHAR2(20), 
    quantidade INTEGER, 
    valor DECIMAL(5,2) 
);

CREATE TABLE vendedor (  
    id_vendedor INTEGER,  
    nome VARCHAR2(20), 
    cnpj VARCHAR2(20)  
);

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Joao Silva', '010020003');

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Pedro Pedra', '010020004');

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Paulo Antonio', '0010030044');

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Rosa Bege', '0090030004');

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Ana Maria', '0050523000');

SELECT * FROM cliente;

UPDATE cliente  
SET id_cliente = 2  
WHERE nome = 'Pedro Pedra';

UPDATE cliente  
SET id_cliente = 3  
WHERE nome = 'Paulo Antonio';

UPDATE cliente  
SET id_cliente = 4  
WHERE nome = 'Rosa Bege';

UPDATE cliente  
SET id_cliente = 5  
WHERE nome = 'Ana Maria';

SELECT * FROM cliente;

INSERT INTO agencia (id_agencia, nome, cnpj) VALUES (1, 'RJ trips', '9183792173628');

INSERT INTO agencia (id_agencia, nome, cnpj) VALUES (2, 'Viagens Da Boa', '9183792173628');

INSERT INTO agencia (id_agencia, nome, cnpj) VALUES (3, 'Hotel quadrivago', '9183792173628');

INSERT INTO agencia (id_agencia, nome, cnpj) VALUES (4, 'Mundo sem fim', '9183792173628');

ALTER TABLE agencia ADD CONSTRAINT id_agencia_pk PRIMARY KEY (id_agencia);

SELECT * FROM agencia;

INSERT INTO vendedor (id_vendedor, nome, cnpj) VALUES (1, 'Robernilson', '91398739123');

INSERT INTO vendedor (id_vendedor, nome, cnpj) VALUES (2, 'Fabilson', '19083081273126');

INSERT INTO vendedor (id_vendedor, nome, cnpj) VALUES (3, 'Amarilson', '371638762187361');

SELECT * FROM vendedor;

INSERT INTO pedido (id_pedido, id_cliente, valor) VALUES (1, 5, 586.90);

INSERT INTO pedido (id_pedido, id_cliente, valor) VALUES (2, 2, 556.90);

INSERT INTO pedido (id_pedido, id_cliente, valor) VALUES (3, 3, 927.99);

ALTER TABLE cliente ADD CONSTRAINT id_cliente_pk PRIMARY KEY (id_cliente);

ALTER TABLE vendedor ADD CONSTRAINT id_vendedor_pk PRIMARY KEY (id_vendedor);

ALTER TABLE pedido ADD CONSTRAINT id_cliente_fk FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente);

ALTER TABLE pedido ADD CONSTRAINT id_agencia_fk FOREIGN KEY (id_agencia) REFERENCES agencia(id_agencia);

UPDATE pedido  
    SET valor = 129.99  
    WHERE id_cliente = 2;

UPDATE pedido  
    SET valor = 229.99  
    WHERE id_cliente = 3;

SELECT * FROM pedido;

INSERT INTO passagem (id_passagem, id_agencia, tipo, quantidade, valor) VALUES (1, 1, 'Ticket Manacapuru', 5, 157.89);

INSERT INTO passagem (id_passagem, id_agencia, tipo, quantidade, valor) VALUES (2, 2, 'Ticket Figuereido', 1, 580.60);

INSERT INTO passagem (id_passagem, id_agencia, tipo, quantidade, valor) VALUES (3, 3, 'Ticket Parintins', 3, 950.0);

SELECT * FROM passagem;

ALTER TABLE passagem ADD CONSTRAINT id_passagem_pk PRIMARY KEY (id_passagem);

SELECT cliente.nome, pedido.valor  
FROM cliente  
INNER JOIN pedido ON cliente.id_cliente = pedido.id_cliente;

ALTER TABLE cliente MODIFY nome VARCHAR2(20) NOT NULL;

ALTER TABLE cliente MODIFY cpf  VARCHAR2(20) UNIQUE;

ALTER TABLE vendedor MODIFY nome VARCHAR2(20) NOT NULL;

