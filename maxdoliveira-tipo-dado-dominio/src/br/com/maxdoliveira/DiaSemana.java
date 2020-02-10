package br.com.maxdoliveira;

public enum DiaSemana {
	
	DOMINGO(true, "a"),
	SEGUNDA(false, "b"),
	TERÇA(false, "c"),
	QUARTA(false, "d"),
	QUINTA(false, "e"),
	SEXTA(false, "f"),
	SABADO(true, "g");
	
	private Boolean ehFinalDeSemana;
	private String signo;
	
	private DiaSemana(Boolean ehFeriado, String signo) {
		
	}

	public Boolean getEhFinalDeSemana() {
		return ehFinalDeSemana;
	}

	public String getSigno() {
		return signo;
	}
}
