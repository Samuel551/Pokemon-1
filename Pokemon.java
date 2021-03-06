public class Pokemon{
	private int id;
	private String nombre;
	private boolean capturado;
	private boolean visto;
	private final int ps_max;
	private int expe;
	private int nivel;
	private int ps;
	private int ataque;
	private Ataque [] ataques = new Ataque[SetupPokemon.cantidadAtaques];

	Pokemon(int id, String nombre, String [] listaAtaques){
		int valor=6;
		this.id = id;
		this.nombre = nombre;
		this. expe = SetupPokemon.experiencia;
		this.nivel = SetupPokemon.nivel;
		this.ps_max = SetupPokemon.ps_max;
		this.ps = this.ps_max;
		this.ataque = SetupPokemon.ataque;
		this.capturado = false;
		this.visto = false;
		for(int i=0;i<SetupPokemon.cantidadAtaques;i++){
			this.ataques[i] = new Ataque(listaAtaques[i],i+1,valor-(i+1),valor/2-i);
		}
	}
	public void setCapturado(){
		this.capturado = true;
	}
	public void setVisto(){
		this.visto = true;
	}
	public String getNombre(){
		return this.nombre;
	}
	public boolean getCapturado(){
		return this.capturado;
	}
	public int getId(){
		return this.id;
	}
	public void recibirAtaque(Ataque ataque){
		this.ps -= ataque.getDano();
	}
	public Ataque [] getAtaques(){
		return ataques;
	}
	public int getPs(){
		return ps;
	}
	public void restaurar(){
		this.ps = this.ps_max;
	}
	public int getexp(){
		return this.expe;
	}
	public int getnivel(){
		return this.nivel;
	}
	public void experiencia(boolean){
		this.expe = getexp()+25;
		if (this.expe!=0){
			System.out.println("\n***** Has ganado 25 de experiencia****\n");
			if(this.expe==50){
				this.nivel= this.nivel+1;
				System.out.println(getNombre()+" Felicidades has subido al nivel"+getnivel()+"\n");
				if(this.expe==100){
					this.nivel= this.nivel+1;
					System.out.println(getNombre()+" Felicidades has subido al nivel"+getnivel()+"\n");
				}
			}
		}
	}
}