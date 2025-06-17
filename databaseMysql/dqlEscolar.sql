-- DQL -> Data query language
-- SELECT

select * from aluno; -- seleciona tudo

select nomeAluno, matriculaAluno, cpfAluno 
from aluno;  -- seleciona colunas específicas

select nomeAluno, matriculaAluno from aluno 
where nomeAluno = 'Guilherme';  -- com base em condições

-- select * from aluno where idAluno in(2, 3, 4);

-- select * from aluno order by matriculaAluno asc|desc;

select turma.nomeCurso, turma.cargaHoraria, turma.tipoCurso, funcionario.nomeFuncionario, aluno.nomeAluno
from turma
join funcionario on turma.idFuncionario = funcionario.idFuncionario
join aluno on turma.idAluno = aluno.idAluno;

-- UPDATE
update instituicao
set enderecoInstituicao = 'Rua aparecida, 226'
where idInstituicao = 2;

select nomeInstituicao, enderecoInstituicao from instituicao;


update aluno
set nomeAluno = 'Guilherme', idInstituicao = 1
where idAluno = 4;

select * from aluno;

-- DELETE

delete from aluno where idAluno = 4;
delete from turma where idTurma = 1;
delete from turma;

drop table turma;

select* from turma;
select * from aluno;
