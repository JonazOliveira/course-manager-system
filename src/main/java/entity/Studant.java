package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Studant {
    private int id;
    private String nome;
    private char genero;
    private long matricula;
    private String CPF;
    private String dataNascimento;
    private int idDiscipline;
    private int idCourse;
}
