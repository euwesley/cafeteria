package state;

import bebida.Bebida;
import pagamento.Pagamento;
import pedido.*;

/**
 * Created by Wesley Anderson on 17/09/2015.
 */
public class Aberto extends Status {
    Pedido p;
    public Aberto(Pedido p){
        this.p=p;
    }
    @Override
    public void addItem(Bebida b) {
        System.out.println("Adicionando ao seu pedido!"+ b.getNome());
        p.getBebidas().add(b);
    }

    @Override
    public void fecharpedido() {
        System.out.println("Fechando Pedido!");
        p.setEstado(new Fechado(p));
    }

    @Override
    public void abrirPedido() {
        System.out.println("Pedido Ja em Aberto!");
    }

    @Override
    public void pagar(Pagamento pagamento) {
        System.out.println("Seu Pedido esta Aberto!");
        System.out.println("Nao e possivel efetuar o pagamento..");
    }
}
