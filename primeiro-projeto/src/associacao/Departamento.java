package associacao;

import java.util.List;

public class Departamento {
    private String nome;
    private List <Funcionario> listaDeFuncionarios;

    public Departamento (String nome, List <Funcionario> listaDeFuncionarios){
        this.nome = nome;
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(List<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public void mostraFuncionario (){
        System.out.println("Departamento" + nome);
        listaDeFuncionarios.forEach(funcionario -> System.out.println(listaDeFuncionarios));
    }
}
