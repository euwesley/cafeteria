package lanche;

/**
 * Created by Wesley Anderson on 01/10/2015.
 */
public class Xsalada extends Lanche{
    public Xsalada(){
        this.setNome("Xsalada");
    }
    @Override
    public double custo() {
        return 6.00;
    }

    @Override
    public void adicionarCondimento() {
        System.out.println("Passando maionese ");
        System.out.println("Passando Ketchup ");
        System.out.println("Passando Mostarda ");
    }

    @Override
    public void adicionarRecheioPrincipal() {
        System.out.println("adicionando Tomate");
        System.out.println("adicionando Salada");
        System.out.println("adicionando Presunto e Queijo");
        System.out.println("adicionando Hamburguer");
    }
}

