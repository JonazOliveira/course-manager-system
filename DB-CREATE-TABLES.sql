CREATE TABLE CATEGORY (idCategory NUMERIC(4),
    					descricao VARCHAR(100) NOT NULL,
    					CONSTRAINT idCategorY_PK PRIMARY KEY(idCategory));

CREATE TABLE EMPLOYEE (idEmployee NUMERIC(5),
    					nome VARCHAR(100) NOT NULL,
    					CPF VARCHAR(15) NOT NULL,
    					dataInicio DATE NOT NULL,
    					dataFinal DATE,
    					salario NUMERIC(8, 2) NOT NULL,
    					funcao VARCHAR(50) NOT NULL,
    					CONSTRAINT idEmployee_PK PRIMARY KEY(idEmployee));

CREATE TABLE COURSE (idCourse NUMERIC(5),
    					nome VARCHAR(100) NOT NULL,
    					descricao VARCHAR(100) NOT NULL,
    					dataInicio DATE NOT NULL,
    					dataFinal DATE,
    					CONSTRAINT idCourse_PK PRIMARY KEY(idCourse));

CREATE TABLE DISCIPLINE (idDiscipline NUMERIC(5),
    						nome VARCHAR(100) NOT NULL,
    						descricao VARCHAR(100) NOT NULL,
    						workload NUMERIC(5) NOT NULL,
    						mensalidade NUMERIC(6, 2) NOT NULL,
    						idCategory NUMERIC(4),
    						idEmployee NUMERIC(5),
    						idCourse NUMERIC(5),
    						CONSTRAINT idDiscipline_PK PRIMARY KEY(idDiscipline),
    						CONSTRAINT idCategory_FK FOREIGN KEY(idCategory) REFERENCES CATEGORY(idCategory),
    						CONSTRAINT idEmployee_FK FOREIGN KEY(idEmployee) REFERENCES EMPLOYEE(idEmployee),
    						CONSTRAINT idCourse_FK FOREIGN KEY(idCourse) REFERENCES COURSE(idCourse));

CREATE TABLE STUDANT (idStudant NUMERIC(9),
    					nome VARCHAR(100) NOT NULL,
    					genero CHAR(1) NOT NULL,
    					matricula NUMERIC(8) NOT NULL,
    					CPF VARCHAR(15) NOT NULL,
    					dataNascimento DATE NOT NULL,
    					idDiscipline NUMERIC(5),
    					idCourse NUMERIC(5),
    					CONSTRAINT idStudant_PK PRIMARY KEY(idStudant),
    					CONSTRAINT idDiscipline_FK FOREIGN KEY(idDiscipline) REFERENCES DISCIPLINE(idDiscipline),
    					CONSTRAINT idCourse FOREIGN KEY(idCourse) REFERENCES Course(idCourse));

