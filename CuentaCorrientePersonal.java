public class CuentaCorrientePersonal extends CuentaBancaria {
    private double comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, String iban, double saldo, double comisionMantenimiento) {
        super(titular, iban, saldo);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    // Sobrescribe el metodo abstracto para proporcionar informacion especifica
    @Override
    public String devolverInfoString() {
        return "Cuenta Corriente Personal - IBAN: " + getIban() + ", Titular: " + getTitular().devolverInfoString() + ", Saldo: " + getSaldo() + ", Comisión de mantenimiento: " + comisionMantenimiento;
    }
}
