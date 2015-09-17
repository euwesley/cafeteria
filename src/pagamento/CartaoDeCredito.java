package pagamento;

/**
 * Created by Wesley Anderson on 17/09/2015.
 */
public class CartaoDeCredito implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Inserindo Cartão..");
        System.out.println("Digitando o Valor..");
        System.out.println("Digite a Senha do Cartao..");
        System.out.println("Autorizando a Trasação..");
        System.out.println("Pagamento Efetuado..");
    }
}
