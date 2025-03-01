public enum Cargo {
    GERENTE("Gerente"), FUNCIONARIO("Funcionário");
    
    private String cargo;
    
    Cargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    
}
