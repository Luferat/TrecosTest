DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS documents;

CREATE TABLE categories (
	cid INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	cname TEXT COLLATE NOCASE
);

CREATE TABLE documents (
	did INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	ddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	dcategory INTEGER,
	dname TEXT COLLATE NOCASE,
	dcontent TEXT COLLATE NOCASE,
	dstatus TEXT CHECK( dstatus IN ('on', 'off', 'del')) DEFAULT 'on' COLLATE NOCASE,
	FOREIGN KEY (dcategory) REFERENCES categories (cid)
);

INSERT INTO categories VALUES
('1', 'Bolos salgados'),
('2', 'Bolos doces'),
('3', 'Coberturas'),
('4', 'Salgados'),
('5', 'Complementos');

INSERT INTO documents VALUES
('1', '2023-02-01 14:12:34', '1', 'Bolo de pão Plus Vita', 'Lorem ipsum…', 'on'),
('2', '2023-02-01 19:31:22', '2', 'Bolo de fubá grelhado', 'Lorem ipsum…', 'on'),
('3', '2023-02-01 22:11:44', '2', 'Bolo de Bis', 'Lorem ipsum…', 'off'),
('4', '2023-02-02 07:15:45', '3', 'Ganache de pimentinha', 'Lorem ipsum…', 'on'),
('5', '2023-02-02 18:12:52', '4', 'Bolinho de feijoada', 'Lorem ipsum…', 'del'),
('6', '2023-02-03 09:31:39', '5', 'Batida de Tang de Limão', 'Lorem ipsum…', 'on');
