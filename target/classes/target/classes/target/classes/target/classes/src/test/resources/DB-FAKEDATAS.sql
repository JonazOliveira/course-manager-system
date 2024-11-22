INSERT INTO CATEGORY VALUES (DEFAULT, 'Tecnologia da Informação');
INSERT INTO CATEGORY VALUES (DEFAULT, 'Engenharia');
INSERT INTO CATEGORY VALUES (DEFAULT, 'Administração');

INSERT INTO EMPLOYEE VALUES (DEFAULT, 'Carlos Silva', '12345678900', TO_DATE('2023-01-15', 'YYYY-MM-DD'), NULL, 3500.00, 'Professor');
INSERT INTO EMPLOYEE VALUES (DEFAULT, 'Maria Oliveira', '98765432100', TO_DATE('2022-05-20', 'YYYY-MM-DD'), TO_DATE('2023-12-31', 'YYYY-MM-DD'), 4500.00, 'Coordenadora');

INSERT INTO COURSE VALUES (DEFAULT, 'Curso de Redes de Computadores', 'Curso voltado para redes', TO_DATE('2024-01-01', 'YYYY-MM-DD'), TO_DATE('2024-12-31', 'YYYY-MM-DD'));
INSERT INTO COURSE VALUES (DEFAULT, 'Curso de Engenharia Civil', 'Curso voltado para construção civil', TO_DATE('2024-01-01', 'YYYY-MM-DD'), TO_DATE('2024-12-31', 'YYYY-MM-DD'));

INSERT INTO DISCIPLINE VALUES (DEFAULT, 'Segurança da Informação', 'Fundamentos de segurança', 60, 500.00, 1, 1, 1);
INSERT INTO DISCIPLINE VALUES (DEFAULT, 'Cálculo Estrutural', 'Análise de estruturas', 80, 600.00, 2, 2, 2);

INSERT INTO STUDANT VALUES (DEFAULT, 'João Pedro', 'M', 20230001, '321.654.987-00', TO_DATE('2000-06-15', 'YYYY-MM-DD'), 2, 1);
INSERT INTO STUDANT VALUES (DEFAULT, 'Ana Clara', 'F', 20230002, '654.987.321-00', TO_DATE('1999-10-10', 'YYYY-MM-DD'), 1, 2);