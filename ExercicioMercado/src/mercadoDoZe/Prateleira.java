package mercadoDoZe;

import java.util.Date;

public class Prateleira {

	public static void main(String[] args) {
		Date data = new Date(2021,05,01);
		
		Mercadoria produtoA = new Mercadoria("Ades", 15.0);
		
			produtoA.setNome("suco");
			produtoA.setPeso(1.0);
			produtoA.setValidade(data);
			produtoA.setSetor(EnumSetor.LATICINEOS);
			
			
		
			System.out.println(produtoA.getNome());
			System.out.println(produtoA.getMarca());
			System.out.println(produtoA.getPeso());
			System.out.println(produtoA.getValidade());
			System.out.println(produtoA.getValor());
			
	}
	
}
