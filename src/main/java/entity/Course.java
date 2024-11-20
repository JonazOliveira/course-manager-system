package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {
    private int id;
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFinal;
}
