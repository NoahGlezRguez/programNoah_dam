package ejercicio;

public class Pelicula extends Multimedia {
	
	private String actorPrincipal;
	private String actrizPrincipal;
	
	public Pelicula() {
		
	}
	
	public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, Formato formato, int duracion) {
		
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
		
	}

	/*****************************************************************************************************/
	/*			(～￣▽￣)～			|	GETTERS Y SETTERS	|			～(￣▽￣～)						 */
	/*								v						v											 */
	/*****************************************************************************************************/
	
	
	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}

	@Override
	public String toString() {
		return String.format("Pelicula [actorPrincipal = %s, actrizPrincipal = %s, %s]", actorPrincipal,
				actrizPrincipal, super.toString());
	}

	/*****************************************************************************************************/
	/*							^	FIN	GETTERS Y SETTERS	^	(❁´◡`❁)									 */
	/*							|							|											 */
	/*****************************************************************************************************/

	
	
}
