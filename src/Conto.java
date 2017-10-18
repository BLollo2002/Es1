/**Conto
 * @author cl440678
 * @version 1.0
 */
public class Conto {
    private String iban, cf;
    private double saldo;

    public Conto(String iban, String cf) {
        this.iban = iban;
        this.cf = cf;
    }

    public boolean preleva(double s) {
        if(saldo >= s) {
            saldo = saldo - s;
            return true;
        }else {
            return false;
        }

    }

    public boolean deposita(double s){
        saldo = saldo + s;
        return true;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
