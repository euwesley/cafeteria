package lanche;

/**
 * Created by Wesley Anderson on 01/10/2015.
 */
public class Xcalabresa extends Lanche {

    public Xcalabresa() {
        this.setNome("Xcalabresa");
    }

    @Override
    public double custo() {
        return 8.0;
    }
    @Override
    public void adicionarCondimento() {
        System.out.println("Passando maionese ");
        System.out.println("Passando Ketchup ");
        System.out.println("Passando Mostarda ");
    }

    @Override
    public void adicionarRecheioPrincipal() {
        System.out.println("adicionando Presunto e Queijo");
        System.out.println("adicionando Hamburguer");
        System.out.println("adicionando Calabresa");
        System.out.println("adicionando Milho e Ervilha");
    }
}

