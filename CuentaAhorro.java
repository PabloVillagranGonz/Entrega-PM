public class CuentaAhorro extends CuentaBancaria {
    private double interesAnual;

    // Constructor de la clase Cuenta Ahorro
    public CuentaAhorro(Persona titular, String iban, double saldo, double interesAnual) {
        super(titular, iban, saldo); // Llama al constructor de la clase padre
        this.interesAnual = interesAnual;
    }

    @Override
    public String devolverInfoString() {
        return "Cuenta de Ahorro - IBAN: " + getIban() + ", Titular: " + getTitular().devolverInfoString() + ", Saldo: " + getSaldo() + ", Interés anual: " + interesAnual + "%";
    }
}
