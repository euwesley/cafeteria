package pagamento;

/**
 * Created by Wesley Anderson on 17/09/2015.
 */
public class CartaoDeCredito implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Inserindo Cart�o..");
        System.out.println("Digitando o Valor..");
        System.out.println("Digite a Senha do Cartao..");
        System.out.println("Autorizando a Trasa��o..");
        System.out.println("Pagamento Efetuado..");
    }
}
