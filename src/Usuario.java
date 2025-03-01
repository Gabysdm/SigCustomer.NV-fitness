import java.io.Serializable;

public class Usuario implements Serializable {
    String nome;
    protected String celular;
    protected String cpf;
    protected String email;
    protected String senha;

    public Usuario(String nome, String celular, String cpf, String email, String senha) {
        this.nome = nome;
        this.celular = celular;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", celular=" + celular + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + '}';
    }
}
