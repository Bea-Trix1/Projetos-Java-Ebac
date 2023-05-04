package exemplosMod7;

public class Cliente {
	
	private int codigo;
	
	private String name;
	
	private String nomeEndereco;
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNomeEndereco() {
		return nomeEndereco;
	}

	public void setNomeEndereco(String nomeEndereco) {
		this.nomeEndereco = nomeEndereco;
	}
	
	
	public void cadastrarEndereco(String nomeEndereco) {
		setNomeEndereco(nomeEndereco);
		
	}
	
	public void imprimirEndereco() {
		System.out.println(this.nomeEndereco);
	}
	
	public String retornarNomeCliente() {
		return "Endereco da Bia";
	}
	
	public int getValorTotal() {
		return 30;
	}
	
	
}
