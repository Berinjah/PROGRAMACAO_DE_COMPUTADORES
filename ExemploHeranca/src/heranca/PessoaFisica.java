package heranca;

public class PessoaFisica extends Pessoa{
	
	private String rg;
	private String cpf;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static void main(String args[]) {
		
		PessoaFisica pessoa = new PessoaFisica();

		pessoa.setBairro("Jardim Santa Helena");
		pessoa.setCpf("48298967879");
		pessoa.setEndereco("Rua da Abolição");
		pessoa.setNome("Fábio Santana");
		pessoa.setRg("546150019");
		
		
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getRg());
		
		
		
		
	}
}
