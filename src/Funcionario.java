public class Funcionario extends Usuario implements DescontoFuncionario {
    protected String cargo;

    public Funcionario(String cargo, String nome, String cpf, String email, String senha) {
        super(nome, cpf, email, senha);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public void autenticar(){
        System.out.println("Funcionário autenticado.");
    }
    public void assinarPacote(){
        System.out.println("Funcionario assinando pacote.");
    }
    @Override
    public void aplicarDesconto(){
        System.out.println("Desconto aplicando pelo funcionário.");
    }
    
}
