package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Discipline {
    private int id;
    private String nome;
    private String descricao;
    private int workload;
    private double mensalidade;
    private short idCategory;
    private int idEmployee;
    private int idCourse;
}
