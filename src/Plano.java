/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author aggr5
 */
public enum Plano {
    MENSAL("Mensal"), SEMESTRAL("Semestral"), ANUAL("Anual");
    
    private String plano;
    
    Plano(String plano) {
        this.plano = plano;
    }
    
    public String getPlano() {
        return plano;
    }
}
