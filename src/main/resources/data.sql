DROP TABLE IF EXISTS tbl_produto;


CREATE TABLE tbl_produto (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250) DEFAULT NULL,
  genre VARCHAR(250) DEFAULT NULL,
  category VARCHAR(250) DEFAULT NULL,
  details VARCHAR(250) DEFAULT NULL,
  views INT DEFAULT NULL
);

INSERT INTO tbl_produto (nome, genre, category,details, views) VALUES
  ('Harry Potter','Ficção', '1','Livro sobre o Harry Potter e o universo de Hogwarts', 1000000),
  ('A divina comédia','Poesia Épica', '2','Livro de Dante Alighieri', 100000),
  ('Mitologia Nórdica','Mitologia', '1','Livro sobre Asghard e seus deuses', 10000),
  ('Elon Musk','Biografia', '3','Livro sobre a história de Elon Musk e seu império tecnológico', 5000),
  ('A menina que roubava livros','Drama', '4','Narrativa passada na Alemanha nazista', 2000000);

