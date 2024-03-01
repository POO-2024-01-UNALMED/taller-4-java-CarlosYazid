package classroom;

public enum Tipo {
	DISCIPLINAR, FUNDAMENTACION, ELECTIVA;

	//DISCIPLINAR = 10;
	private int codigo;
	private String nombre;
	public void Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
