package pedido;

import bebida.Bebida;
import pagamento.Pagamento;
import state.Aberto;

import java.util.ArrayList;

/**
 * Created by Wesley Anderson on 17/09/2015.
 */
public class Pedido {
    ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
    private Status estado;

    public Pedido() {
        this.bebidas = new ArrayList<Bebida>();
        this.estado = new Aberto(this);
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }
    public void fecharPedido(){
        estado.fecharpedido();
    }
    public void abrirPedido(){
        estado.abrirPedido();
    }
    public void pagar(Pagamento pagamento){
        estado.pagar(pagamento);
    }
    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public void addItem(Bebida b) {
        estado.addItem(b);
    }
    public double valorFinalPedido(){
        double total=0;
        for (int i=0;i< getBebidas().size();i++){
            total = total + getBebidas().get(i).custo();
            System.out.println("Bebida: "+getBebidas().get(i).getNome()+"\t\t R$"+getBebidas().get(i).custo());
        }
        System.out.println("Custo total Das Bebidas : R$"+total);
        return total;
    }
}
