package br.com.maxdoliveira;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AtividadeData {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		DateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
		Date aniversario = formatadorData.parse("26/06/1987");
		System.out.println(aniversario);

		Calendar c = Calendar.getInstance();
		c.setTime(aniversario);
		c.add(Calendar.YEAR, 33);

		System.out.println(formatadorData.format(c.getTime()));

	}
}
