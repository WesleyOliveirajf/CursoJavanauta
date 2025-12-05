package abstracao;

public class Cliente extends Endereco implements Pessoa {
    private String nome;
    private String documentos;

    public Cliente(String rua, String cidade, String estado, String cep, String nome, String documentos) {
        super(rua, cidade, estado, cep);
        this.nome = nome;
        this.documentos = documentos;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return "";
    }

    @Override
    public void setDocumento(String documento) {

    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documentos='" + documentos + '\'' +
                '}';
    }


}
