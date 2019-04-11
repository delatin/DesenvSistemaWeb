CREATE DATABASE  lagenda;

use lagenda;

CREATE TABLE agenda(
  id 		int(5) 		NOT NULL 	AUTO_INCREMENT,
  nome 		varchar(50) 	NOT NULL,
  email 	varchar(30) 	NOT NULL,
  telefone 	varchar(60) 	NOT NULL,
  endereco 	varchar(50) 	NOT NULL,
  PRIMARY KEY(id)
)AUTO_INCREMENT=1;


