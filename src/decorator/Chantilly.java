package decorator;

import bebida.Bebida;

/**
 * Created by Wesley Anderson on 10/09/2015.
 */
public class Chantilly extends Decorator {
    private Bebida b;


    public Chantilly(Bebida b){
        this.b=b;
    }

    @Override
    public double custo() {
        return b.custo()+1;
    }

    @Override
    public String getNome() {
        return b.getNome() + " com Chantilly";
    }
}
