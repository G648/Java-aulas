-- DML -> DATA MANIPULATION LANGUAGE
-- insert, delete, update, select

insert into instituicao
values
(1, 'SENAI', 'Rua niterói, 180', '03774819000102', '1150920987'),
(2, 'FIAP', 'rua do lado', '03774919000102', '1298769087');

insert into aluno
values
(5, 'Maria', '1284722811', '20997', 2),
(6, 'Oscar', '38419932', '19384', 1),
(7, 'vitoria', '23848113', '23819', 1);

insert into funcionario
values
(1, 'Carlos', '3848592', 38, 'professor', 1),
(2, 'Simone', '122243134', 67, 'professor', 2);

insert into turma
values
(1, 'java', 80, 'fic', 1, 4),
(2, 'banco de dados', 160, 'curso rapido', 2, 3);