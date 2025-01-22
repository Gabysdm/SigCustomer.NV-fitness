public class TestarClasses {
    public static void main (String[] args) {
        Cliente cliente = new Cliente("pacote premium", "joao", "107.371.874.33", "joaodelicia@gmail.com", "senha321");
        cliente.autenticar();
        cliente.consultarpacote();
        cliente.assinarPacote();
        
        
        Funcionario funcionario = new Funcionario("gerente", "maria", "129.365.033.33", "mariadoces@gmail.com" ,"deumaoito");
        funcionario.autenticar();
        funcionario.aplicarDesconto();
        funcionario.assinarPacote();
        
    }
}
