public class CuentaCorrienteEmpresa extends CuentaBancaria {
    private double maximoDescubierto;
    private double interesDescubierto;
    private double comisionDescubierto;

    // Constructor
    public CuentaCorrienteEmpresa(Persona titular, String iban, double saldo, double maximoDescubierto, double interesDescubierto, double comisionDescubierto) {
        super(titular, iban, saldo); // Llama al constructor de la clase base para inicializar los atributos comunes
        this.maximoDescubierto = maximoDescubierto;
        this.interesDescubierto = interesDescubierto;
        this.comisionDescubierto = comisionDescubierto;
    }

    @Override
    public String devolverInfoString() {
        return "Cuenta Corriente Empresa - IBAN: " + getIban() + ", Titular: " + getTitular().devolverInfoString() + ", Saldo: " + getSaldo() + ", Máximo descubierto: " + maximoDescubierto + ", Interés por descubierto: " + interesDescubierto + "%, Comisión por descubierto: " + comisionDescubierto;
    }
}
