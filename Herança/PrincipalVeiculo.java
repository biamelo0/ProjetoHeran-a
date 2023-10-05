package Herança;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("Ferrari", "12345678",2023,"Preto");
		System.out.println("veiculo:");
		System.out.println("Marca : " + veiculo.getMarca());
		System.out.println("Modelo"+ veiculo.getModelo());
		System.out.println("Ano : " + veiculo.getAno());
		System.out.println("Cor"+ veiculo.getCor());
		
		Automovel automovel = new Automovel("Ferrari", "12345678",2023,"Preto",4, "aaaa");
		System.out.println("Automovel:");
		System.out.println("Marca : " + automovel.getMarca());
		System.out.println("Modelo: "+ automovel.getModelo());
		System.out.println("Ano : " + automovel.getAno());
		System.out.println("Cor: "+ automovel.getCor());
		System.out.println("Numero de portas : " + automovel.getNumeroPortas());
		System.out.println("Motor: "+ automovel.getMotor());

		
		Moto moto = new Moto("Ferrari", "12345678",2023,"Preto",4);
		System.out.println("Automovel:");
		System.out.println("Marca : " + moto.getMarca());
		System.out.println("Modelo: "+ moto.getModelo());
		System.out.println("Ano : " + moto.getAno());
		System.out.println("Cor: "+ moto.getCor());
		System.out.println("Numero de portas : " + moto.getCilindrada());

	}

}
