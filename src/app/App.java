package app;

import bebida.Bebida;
import bebida.Cafe;
import decorator.Chantilly;

/**
 * Created by Wesley Anderson on 10/09/2015.
 */
public class App {

    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println("Dados do café: ");
        System.out.println("Nome: "+cafe.getNome());
        System.out.println("Custo: "+cafe.custo());

        System.out.println(" -- Nova Bebida -- ");
        cafe = new Chantilly(cafe);
        System.out.println("Dados do café: ");
        System.out.println("Nome: "+cafe.getNome());
        System.out.println("Custo: "+cafe.custo());

    }


}
