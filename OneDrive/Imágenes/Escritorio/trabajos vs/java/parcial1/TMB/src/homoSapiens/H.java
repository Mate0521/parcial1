package homoSapiens;

public class H extends Persona {
	
    public H(double peso, double altura, int años) {
        super(peso, altura, años);
    }

    @Override
    public double calculateTMB() {
        return 88.362 + (13.397 * getpeso()) + (4.799 * getaltura()) - (5.677 * getaños());
    }
}

