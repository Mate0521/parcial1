package homoSapiens;

public abstract class Persona {
    private double peso;
    private double altura;
    private int años;
    private String nombre;

    public Person(double peso, double altura, int años, String nombre) {
    	this.nombre=nombre;
        this.peso = peso;
        this.altura = altura;
        this.años = años;
    }

    public abstract double calculateTMB();
    

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

}

