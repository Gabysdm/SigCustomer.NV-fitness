

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente extends Usuario implements Serializable{
    
    private Plano plano;
    private Calendar dataInscricao; 

    public Cliente(String nome, String celular, String cpf, String email, String senha, Plano plano, Calendar dataInscricao){
        super(nome, celular, cpf, email, senha);
        this.plano = plano;
        this.dataInscricao = dataInscricao;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public Calendar getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Calendar dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
    
    public String getDataInscricaoString() {
        DateFormat d = DateFormat.getDateInstance(DateFormat.SHORT);
        Date data = dataInscricao.getTime();
        return d.format(data);
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", celular=" + celular + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", plano=" + plano + ", dataInscricao=" + dataInscricao + '}';
    }
}
