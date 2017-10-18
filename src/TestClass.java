/**
 * Classe di test per la classe Conto
 * @see Conto
 * @author cl440678
 * @version 1.0
 */
public class TestClass {
    public static void main(String[] args) {
        Banca b1 = null;
        b1 = new Banca("Intesa", "Int", 10);
        b1.addconto("BLLDVD96H11C816J");
        b1.addconto("ZNTRRT69B47E648Z");
        if(b1.operazione("Int1", 100)){
            System.out.println("OPERZAIONE EFFETTUATA " + b1.getConto("Int1").getSaldo());

        }else{
            System.out.println("IMPOSSIBILE EFFETTUARE L'OPERAZIONE");
        }
        if(b1.operazione("Int1", -50)){
            System.out.println("OPERZAIONE EFFETTUATA " + b1.getConto("Int1").getSaldo());

        }else{
            System.out.println("IMPOSSIBILE EFFETTUARE L'OPERAZIONE");
        }


    }
}
