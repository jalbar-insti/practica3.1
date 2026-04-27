public class CompteBancari {
    private String titular;
    private String iban;
    private double saldo;

    // Constants per evitar "Magic Strings" i codi duplicat
    private static final String SALDO_BAIX = "Saldo baix";
    private static final String SALDO_NORMAL = "Saldo normal";
    private static final String SALDO_ALT = "Saldo alt";

    public CompteBancari(String titular, String iban, double saldoInicial) {
        validarDadesInici(titular, iban, saldoInicial);
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldoInicial;
    }

    // Mètode extret per evitar mètodes massa llargs
    private void validarDadesInici(String titular, String iban, double saldo) {
        if (titular == null || titular.isEmpty()) throw new IllegalArgumentException("El titular no pot estar buit");
        if (iban == null || iban.isEmpty()) throw new IllegalArgumentException("L'IBAN no pot estar buit");
        if (saldo < 0) throw new IllegalArgumentException("El saldo inicial no pot ser negatiu");
    }

    public void ingressar(double quantitat) {
        validarQuantitatPositiva(quantitat);
        
        System.out.println("Ingrés iniciat");
        saldo += quantitat;
        imprimirResumOperacio("S'ha ingressat", quantitat);
    }

    public void retirar(double quantitat) {
        validarQuantitatPositiva(quantitat);
        if (quantitat > saldo) {
            throw new IllegalArgumentException("No hi ha prou saldo per retirar " + quantitat);
        }

        System.out.println("Retirada iniciada");
        saldo -= quantitat;
        imprimirResumOperacio("S'ha retirat", quantitat);
    }

    // Refactorització: Eliminem la lògica duplicada de l'estat del saldo
    public String getEstatSaldo() {
        if (saldo < 1000) return SALDO_BAIX;
        if (saldo < 5000) return SALDO_NORMAL;
        return SALDO_ALT;
    }

    private void validarQuantitatPositiva(double quantitat) {
        if (quantitat <= 0) {
            throw new IllegalArgumentException("La quantitat ha de ser superior a 0");
        }
    }

    private void imprimirResumOperacio(String missatge, double quantitat) {
        System.out.println(missatge + ": " + quantitat);
        System.out.println("Saldo actual: " + saldo);
        System.out.println(getEstatSaldo());
        System.out.println("Operació acabada");
    }

    public void mostrarDades() {
        System.out.println("Titular: " + titular);
        System.out.println("IBAN: " + iban);
        System.out.println("Saldo: " + saldo);
        System.out.println(getEstatSaldo());
    }

    // Getters
    public String getTitular() { return titular; }
    public String getIban() { return iban; }
    public double getSaldo() { return saldo; }
}