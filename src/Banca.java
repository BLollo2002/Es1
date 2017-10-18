/**Banca
 * @author cl440678
 * @version 1.0
 */
public class Banca {
    private String nome, ibanroot;
    private int maxconti, contiattivi;
    private Conto[] conti;

    public Banca(String nome, String ibanroot, int maxconti) {
        this.nome = nome;
        this.ibanroot = ibanroot;
        this.maxconti = maxconti;
        conti = new Conto[maxconti];
    }
    public Conto addconto(String codice){
        if(maxconti > contiattivi){
            String iban = ibanroot + (contiattivi + 1);
            conti[contiattivi] = new Conto(iban, codice);
            contiattivi ++;
            return conti[contiattivi-1];
        }else {
            return null;
        }
    }
    public double totsaldi(){
        int i;
        double sfinale = 0;
        for(i = 0; i < contiattivi; i++){
            sfinale += conti[i].getSaldo();
        }
        return sfinale;
    }
    public boolean operazione(String iban, double importo){
        int i;
        for(i = 0; i < contiattivi; i++){
            if(conti[i].getIban().equals(iban) == true){
                if(importo >= 0){
                    if(conti[i].deposita(importo)){
                        return true;
                    }else{
                        return false;
                    }
                }
                if(importo < 0){
                    if(conti[i].preleva(importo*-1)){
                        return true;
                    }else{
                        return false;
                    }
                }
            }

        }

        return false;
    }
    public Conto getConto(String iban) {
        int i;
        for (i = 0; i < contiattivi; i++) {
            if (conti[i].getIban().equals(iban)) {
                return conti[i];

            }
        }
        return null;
    }

}

