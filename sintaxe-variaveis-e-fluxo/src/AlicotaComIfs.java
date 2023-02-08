
public class AlicotaComIfs {

	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if(salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de até R$142,00");
		}
		else if(salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("O IR é de 15% e pode deduzir até R$ 350");
		}
		else if(salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("O IR é de 22.5% e pode deduzir até R$ 636");
		}

	}

}
