package app;

import bebida.Bebida;
import bebida.Cafe;
import decorator.Chantilly;
import decoratorLanche.Bacon;
import decoratorLanche.Calabresa;
import lanche.Lanche;
import lanche.Xcalabresa;
import lanche.Xsalada;
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


        /*Pedido pedido = new Pedido();
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
        System.out.println("------- Fechado!----------");*/

        Lanche x = new Xsalada();
        x.prepararLanche();
        System.out.println("Nome: " + x.getNome() + " Custo: R$" + x.custo());
        x = new Bacon(x);
        System.out.println("Nome: "+x.getNome()+" Custo: R$"+x.custo());
        System.out.println("------- Fechado!----------");
        Lanche s = new Xcalabresa();
        s.prepararLanche();
        System.out.println("Nome: " + s.getNome() + " Custo: R$" + s.custo());
        s = new Calabresa(s);
        System.out.println("Nome: " + s.getNome() + " Custo: R$" + s.custo());





    }


}
