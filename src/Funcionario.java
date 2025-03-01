
import java.io.Serializable;


public class Funcionario extends Usuario implements Serializable{
    private Cargo cargo;

    public Funcionario(Cargo cargo, String nome, String celular, String cpf, String email, String senha) {
        super(nome, celular, cpf, email, senha);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", celular=" + celular + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", cargo=" + cargo + '}';
    }
    
}
