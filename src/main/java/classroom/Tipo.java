package classroom;

public enum Tipo {
	DISCIPLINAR, FUNDAMENTACION, ELECTIVA;

	private int codigo;
	private String nombre;
	public void Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
} // Anti-copy: Carlos Padilla Royero
