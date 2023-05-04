package exemplosMod7;

public class PrimeiraClasse {
	
	public static void main(String args[])
	{
		
		Cliente cliente = new Cliente();
		cliente.cadastrarEndereco("Rua Ana Jarvis");
		cliente.setCodigo(1);
		cliente.imprimirEndereco();
		cliente.retornarNomeCliente();
		
		System.out.println("Endereco: " + cliente.getNomeEndereco());
		System.out.println("Codigo: " + cliente.getCodigo());
		
		String end = cliente.retornarNomeCliente();
		System.out.println(end);
		System.out.println("Codigo: " + cliente.getValorTotal());
	}
}
