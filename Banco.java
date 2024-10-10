import java.util.ArrayList;

public class Banco {

    // Lista que almacena las cuentas
    private ArrayList<CuentaBancaria> cuentas;

    // Construtor de la clase Banco
    public Banco() {
        cuentas = new ArrayList<>();
    }

    // Metodo para abrir una cuenta
    public boolean abrirCuenta(CuentaBancaria cuenta) {
        return cuentas.add(cuenta);
    }

    // Metodo para validar el formato IBAN
    public static boolean validarIBAN(String iban) {
        return iban.matches("ES\\d{20}");
    }

    // Metodo para listar
    public ArrayList<String> listadoCuentas() {
        ArrayList<String> listado = new ArrayList<>(); // Recorre todas las cuentas y coge la información
        for (CuentaBancaria cuenta : cuentas) {
            listado.add(cuenta.devolverInfoString());
        }
        return listado; // Devuelve la lista
    }

    // Metodo para buscar
    public CuentaBancaria buscarCuenta(String iban) {
        for (CuentaBancaria cuenta : cuentas) { // Recorre las cuentas buscando el IBAN
            if (cuenta.getIban().equals(iban)) {
                return cuenta;
            }
        }
        return null;
    }

    // Metodo para ingresar
    public boolean ingresoCuenta(String iban, double cantidad) {
        CuentaBancaria cuenta = buscarCuenta(iban);
        if (cuenta != null) {
            cuenta.ingresar(cantidad);
            return true;
        }
        return false;
    }

    // Metodo para retirar
    public boolean retiradaCuenta(String iban, double cantidad) {
        CuentaBancaria cuenta = buscarCuenta(iban);
        if (cuenta != null) {
            return cuenta.retirar(cantidad);
        }
        return false;
    }

    // Metodo para obtener el saldo
    public double obtenerSaldo(String iban) {
        CuentaBancaria cuenta = buscarCuenta(iban);
        if (cuenta != null) {
            return cuenta.getSaldo(); // Si existe, devuelve el saldo
        }
        return -1;
    }
}
