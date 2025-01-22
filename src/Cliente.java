public class Cliente extends Usuario{
    String pacoteSelecionado;

    public Cliente(String pacoteSelecionado, String nome, String cpf, String email, String senha) {
        super(nome, cpf, email, senha);
        this.pacoteSelecionado = pacoteSelecionado;
    }


    public String getPacoteSelecionado() {
        return pacoteSelecionado;
    }

    public void setPacoteSelecionado(String pacoteSelecionado) {
        this.pacoteSelecionado = pacoteSelecionado;
    }
    
    @Override
    public void autenticar(){
        System.out.println("Cliente autenticado.");
    }
    @Override
    public void assinarPacote(){
        System.out.println("Pacote assinado.");
    }

    void consultarpacote() {
        System.out.println("consultando pacote: " + pacoteSelecionado);
    }
    
}
