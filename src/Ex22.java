public class Ex22 {
	public static void main(String[] args) {
		int tempoTotal = 86399;
		int minutos;
		int horas;
		int segundos;

		minutos = (int) (tempoTotal) / 60;
		segundos = tempoTotal % 60;
		horas = (int) minutos / 60;
		minutos = minutos % 60;

		System.err.println(horas + ":" + minutos + ":" + segundos);
	}
}