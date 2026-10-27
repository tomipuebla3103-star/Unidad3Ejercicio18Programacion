public class TanqueReserva {
    private double capacidadMaxima;
    private double nivelActual;

    public TanqueReserva(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.nivelActual = 0;
    }

    public void llenar(double litros) {
        if (litros > 0 && nivelActual + litros <= capacidadMaxima) {
            nivelActual += litros;
            System.out.println("Agua ingresada correctamente.");
        } else {
            System.out.println("Error: se supera la capacidad máxima o los litros no son válidos.");
        }
    }

    public void consumir(double litros) {
        if (litros > 0 && nivelActual >= litros) {
            nivelActual -= litros;
            System.out.println("Agua consumida correctamente.");
        } else {
            System.out.println("Error: no hay suficiente agua o los litros no son válidos.");
        }
    }

    public double getNivelActual() {
        return nivelActual;
    }
}
