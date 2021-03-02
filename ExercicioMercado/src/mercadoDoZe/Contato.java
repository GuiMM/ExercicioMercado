package mercadoDoZe;

public class Contato {
	
	private int id;
	private EnumTipoContato tipoContato;
	private String textoContato;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EnumTipoContato getTipoContato() {
		return tipoContato;
	}
	public void setTipoContato(EnumTipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}
	public String getTextoContato() {
		return textoContato;
	}
	public void setTextoContato(String textoContato) {
		this.textoContato = textoContato;
	}
	
}
