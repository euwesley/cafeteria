package state;

import bebida.Bebida;
import pagamento.Pagamento;
import pedido.Pedido;
import pedido.Status;

/**
 * Created by Wesley Anderson on 17/09/2015.
 */
public class Fechado extends Status {
    Pedido b;
    Pagamento pgto;
    public Fechado(Pedido b) {
        this.b = b;
    }

    @Override
    public void addItem(Bebida b) {
        System.out.println("Seu Pedido esta Fechado!");
    }

    @Override
    public void fecharpedido() {

        System.out.println("Pedido Fechado!");
    }

    @Override
    public void abrirPedido() {
        System.out.println("Abrindo Pedido novamente");
        b.setEstado(new Aberto(b));
    }

    @Override
    public void pagar(Pagamento pgto) {
        this.pgto = pgto;
        pgto.pagar();
    }
}
