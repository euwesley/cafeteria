package bebida;

/**
 * Created by Wesley Anderson on 10/09/2015.
 */
public abstract class Bebida {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract double custo();
}
