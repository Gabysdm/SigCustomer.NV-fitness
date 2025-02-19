
import java.util.Calendar;

public class Cliente {
    
    String nome;
    String celular;
    String cpf;
    String email;
    String senha;
    Calendar dataDeInscrição;
    boolean atividade;

    public Cliente(String nome, String celular, String cpf, String email, String senha) {
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
    
    public void cadastrar(){
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", celular=" + celular + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", dataDeInscri\u00e7\u00e3o=" + dataDeInscrição + ", atividade=" + atividade + '}';
    }

}
