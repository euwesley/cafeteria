package pagamento;


/**
 * Created by Wesley Anderson on 17/09/2015.
 */
public class Dinheiro implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Recebendo Dinheiro..");
        System.out.println("Conferindo Dinheiro..");
        System.out.println("Verificando Legitimidade notas..");
        System.out.println("Pagamento Efetuado..");
    }
}
