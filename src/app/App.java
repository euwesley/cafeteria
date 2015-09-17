package app;

import bebida.Bebida;
import bebida.Cafe;
import decorator.Chantilly;
import pagamento.CartaoDeCredito;
import pagamento.Dinheiro;
import pagamento.Pagamento;
import pedido.Pedido;

/**
 * Created by Wesley Anderson on 10/09/2015.
 */
public class App {

    public static void main(String[] args) {
        Bebida cafe = new Cafe();


        Pedido pedido = new Pedido();
        Pagamento pagamento = new Dinheiro();
        pedido.addItem(cafe);

        System.out.println("------- Fechando o Pedido!----------");
        pedido.valorFinalPedido();
        pedido.fecharPedido();
        pedido.pagar(pagamento);
        System.out.println("------- Fechado ----------------");

        System.out.println("\n\n------- Abrindo o Pedido!----------");
        pedido.abrirPedido();
        cafe = new Chantilly(cafe);
        pedido.addItem(cafe);
        pedido.valorFinalPedido();
        pedido.fecharPedido();
        pagamento = new CartaoDeCredito();
        pedido.pagar(pagamento);
        System.out.println("------- Fechado!----------");




    }


}
