//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    TanqueReserva tanque = new TanqueReserva(1000);

    tanque.llenar(500);
    System.out.println("Nivel actual: " + tanque.getNivelActual() + " litros");

    tanque.llenar(700);
    System.out.println("Nivel actual: " + tanque.getNivelActual() + " litros");

    tanque.consumir(200);
    System.out.println("Nivel actual: " + tanque.getNivelActual() + " litros");

    tanque.consumir(600);
    System.out.println("Nivel actual: " + tanque.getNivelActual() + " litros");

    tanque.consumir(100);
    System.out.println("Nivel final: " + tanque.getNivelActual() + " litros");
}
