CREATE TABLE CATEGORY (id SMALLINT GENERATED ALWAYS AS IDENTITY,
    					descricao VARCHAR(100) NOT NULL,
    					CONSTRAINT idCategory_PK PRIMARY KEY(id));

CREATE TABLE EMPLOYEE (id INTEGER GENERATED ALWAYS AS IDENTITY,
    					nome VARCHAR(100) NOT NULL,
    					CPF VARCHAR(15) NOT NULL,
    					dataInicio DATE NOT NULL,
    					dataFinal DATE,
    					salario NUMERIC(8, 2) NOT NULL,
    					funcao VARCHAR(50) NOT NULL,
    					CONSTRAINT idEmployee_PK PRIMARY KEY(id));

CREATE TABLE COURSE (id INTEGER GENERATED ALWAYS AS IDENTITY,
    					nome VARCHAR(100) NOT NULL,
    					descricao VARCHAR(100) NOT NULL,
    					dataInicio DATE NOT NULL,
    					dataFinal DATE,
    					CONSTRAINT idCourse_PK PRIMARY KEY(id));

CREATE TABLE DISCIPLINE (id INTEGER GENERATED ALWAYS AS IDENTITY,
    						nome VARCHAR(100) NOT NULL,
    						descricao VARCHAR(100) NOT NULL,
    						workload NUMERIC(5) NOT NULL,
    						mensalidade NUMERIC(6, 2) NOT NULL,
    						idCategory SMALLINT,
    						idEmployee INTEGER,
    						idCourse INTEGER,
    						CONSTRAINT idDiscipline_PK PRIMARY KEY(id),
    						CONSTRAINT idCategory_FK FOREIGN KEY(idCategory) REFERENCES CATEGORY(id),
    						CONSTRAINT idEmployee_FK FOREIGN KEY(idEmployee) REFERENCES EMPLOYEE(id),
    						CONSTRAINT idCourse_FK FOREIGN KEY(idCourse) REFERENCES COURSE(id));

CREATE TABLE STUDANT (id INTEGER GENERATED ALWAYS AS IDENTITY,
    					nome VARCHAR(100) NOT NULL,
    					genero CHAR(1) NOT NULL,
    					matricula NUMERIC(8) NOT NULL,
    					CPF VARCHAR(15) NOT NULL,
    					dataNascimento DATE NOT NULL,
    					idDiscipline INTEGER,
    					idCourse INTEGER,
    					CONSTRAINT idStudant_PK PRIMARY KEY(id),
    					CONSTRAINT idDiscipline_FK FOREIGN KEY(idDiscipline) REFERENCES DISCIPLINE(id),
    					CONSTRAINT idCourse_FK FOREIGN KEY(idCourse) REFERENCES Course(id));
