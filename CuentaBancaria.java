public abstract class CuentaBancaria {
    // Atributos
    private Persona titular;
    private String iban;
    private double saldo;

    public CuentaBancaria(Persona titular, String iban, double saldo) {
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldo;
    }
    // Metodos get
    public Persona getTitular() {
        return titular;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodo para ingresar una cantidad de dinero
    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    // Metodo para retirar una cantidad de dinero
    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    // Metodo abstracto que es implementado por las clases hijas
    public abstract String devolverInfoString();
}