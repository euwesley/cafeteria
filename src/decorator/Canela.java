package decorator;


import bebida.Bebida;

/**
 * Created by Wesley Anderson on 10/09/2015.
 */
public class Canela extends Decorator{
    Bebida b;
    public Canela(Bebida b) {
        this.b=b;
    }

    @Override
    public double custo() {
        return b.custo()+0.25;
    }

    @Override
    public String getNome() {
        return b.getNome()+" com Canela";
    }
}
