package homoSapiens;

public class M extends Persona {
    public M(double peso, double altura, int años) {
        super(peso, altura, años);
    }

    @Override
    public double calculateTMB() {
        return 447.593 + (9.247 * getpeso()) + (3.098 * getaltura()) - (4.33 * getaños());
    }
}

