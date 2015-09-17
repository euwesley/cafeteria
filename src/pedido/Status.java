package pedido;

import bebida.Bebida;
import pagamento.Pagamento;

/**
 * Created by Wesley Anderson on 17/09/2015.
 */
public abstract class Status {
    public abstract void addItem(Bebida b);
    public abstract void fecharpedido();
    public abstract void abrirPedido();
    public abstract void pagar(Pagamento p);

}
