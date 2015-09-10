package bebida;

/**
 * Created by Wesley Anderson on 10/09/2015.
 */
public class Cafe extends Bebida {
    public Cafe() {
        this.setNome("Café");
    }

    @Override
    public double custo() {
        return 1.00;
    }
}
