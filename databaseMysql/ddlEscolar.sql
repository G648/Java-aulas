create database gerenciamentoEscolar;

use gerenciamentoEscolar;

-- DDL -> DATA DEFINITION LANGUAGE

create table instituicao (
	idInstituicao int primary key auto_increment ,
    nomeInstituicao VARCHAR(100) not null,
    enderecoInstituicao varchar(255) not null,
    cnpj varchar(14) not null,
    telefoneInstituicao varchar(11) not null
);

create table aluno(
	idAluno int primary key auto_increment,
    nomeAluno varchar(100) not null,
	cpfAluno varchar(11) not null,
    matriculaAluno varchar(25) not null,
    idInstituicao int,
    foreign key (idInstituicao) references Instituicao(idInstituicao)
);

create table funcionario(
	idFuncionario int primary key auto_increment,
    nomeFuncionario varchar(100) not null,
    cpfFuncionario varchar(11) not null,
    idadeFuncionario int not null,
    tipoFuncionario varchar(100) not null,
    idInstituicao int, 
    foreign key (idInstituicao) references instituicao(idInstituicao)
);

create table turma (
	idTurma int primary key auto_increment,
    nomeCurso varchar(100) not null,
    cargaHoraria int not null,
    tipoCurso varchar(100) not null,
    idFuncionario int,
    idAluno int,
    foreign key (idFuncionario) references funcionario(idFuncionario),
    foreign key (idAluno) references aluno(idAluno)
);






