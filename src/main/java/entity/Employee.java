package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int id;
    private String nome;
    private String CPF;
    private String dataInicio;
    private String dataFinal;
    private double salario;
    private String funcao;
}
