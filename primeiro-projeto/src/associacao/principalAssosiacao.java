package associacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class principalAssosiacao {
    public static void main(String[] args) {
        Carro fusca = new Carro(20);
        fusca.mostraCilidrandas();

        Funcionario joao = new Funcionario("João");
        Funcionario joana = new Funcionario("Joana");
        Funcionario mateus = new Funcionario("Mateus");
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(joana);
        listaDeFuncionarios.add(mateus);

        Departamento ti = new Departamento("TI",listaDeFuncionarios);
        ti.mostraFuncionario();

        Departamento markting = new Departamento("Marketing", Collections.emptyList()); // Collections.emptyList() - Passar Lista Vazia







    }
}
