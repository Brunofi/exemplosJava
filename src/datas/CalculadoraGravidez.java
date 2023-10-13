package datas;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {

	private Date dataUltimoPeriodoMenstrual;

	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}

	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;

	}

	public Date calcularDataEstimadaConcepcao() {
		Calendar concepcao = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		concepcao.add(Calendar.DAY_OF_YEAR, 14);
		return concepcao.getTime();
		

	}

	public Date calcularDataEstimadaParto() {
		Calendar dataParto = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataParto.add(Calendar.WEEK_OF_YEAR, 40);
		return dataParto.getTime();
	}

}
