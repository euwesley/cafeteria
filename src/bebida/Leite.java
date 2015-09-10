package bebida;

/**
 * Created by Wesley Anderson on 10/09/2015.
 */
public class Leite extends Bebida {
    public Leite() {
        this.setNome("Leite");
    }

    @Override
    public double custo() {
        return 0.50;
    }
}
