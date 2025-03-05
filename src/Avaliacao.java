
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aggr5
 */
public class Avaliacao {
    Calendar calendar;
    String dataMarcado;
    String diaSemana;
    String hora;
    
    int idCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Avaliacao(int diaSemana, int hora, int idCliente) {
        //int diaSemanaCliente = 4; // TODO quarta-feira, por exemplo
		
		calendar = Calendar.getInstance();
		
		if(diaSemana != calendar.get(Calendar.DAY_OF_WEEK)) {
			
			while(calendar.get(Calendar.DAY_OF_WEEK) != diaSemana) {
				calendar.add(Calendar.DAY_OF_MONTH, 1);
			}

		}else {
                        calendar.add(Calendar.DAY_OF_MONTH, 1);
			
			while(calendar.get(Calendar.DAY_OF_WEEK) != diaSemana) {
				calendar.add(Calendar.DAY_OF_MONTH, 1);
			}
                        
                }
                calendar.set(Calendar.HOUR, hora);
                
                dataMarcado = getDataAvaliacao();
                this.diaSemana = getDiaSemanaString(diaSemana);
                this.hora = hora + ":00";
                this.idCliente = idCliente;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getDataMarcado() {
        return dataMarcado;
    }

    public void setDataMarcado(String dataMarcado) {
        this.dataMarcado = dataMarcado;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

   private String getDataAvaliacao() {
        DateFormat d = DateFormat.getDateInstance(DateFormat.SHORT);
        Date data = calendar.getTime();
        return d.format(data);
        
    }
   
   private String getDiaSemanaString(int dia) {
        switch (dia) {
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            default:
                return "Sexta";
        }
   }
    
}
