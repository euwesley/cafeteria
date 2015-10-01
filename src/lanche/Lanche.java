package lanche;

/**
 * Created by Wesley Anderson on 01/10/2015.
 */
public abstract class Lanche {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract double custo();
    public void cortaPao(){

    }
    public void adicionarCondimento(){}
    public void adicionarRecheioPrincipal(){}
    public void prensar(){

    }
    public void servir(){

    }
    public final void prepararLanche(){
        this.cortaPao();
        this.adicionarCondimento();
        this.adicionarRecheioPrincipal();
        this.prensar();
        this.servir();
    }
}

