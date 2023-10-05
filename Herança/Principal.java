package Herança;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Beatriz", "12345678");
		System.out.println("Pessoa:");
		System.out.println("Nome : " + pessoa.getNome());
		System.out.println("Telefone"+ pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica("Beatriz", "12345678","122 123 234 22", "738399303");
		System.out.println("Pessoa Fisica:");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: "+ pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG"+ pessoaFisica.getRg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Beatriz", "12345678","122 123 234 22");
		System.out.println("Pessoa Juridica:");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: "+ pessoaJuridica.getTelefone());
		System.out.println("CPF: " + pessoaJuridica.getCnpj());
		

	}

}
