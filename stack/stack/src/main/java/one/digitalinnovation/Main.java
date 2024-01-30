package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

    Stack<Carro> stackCarros = new Stack<>();

    stackCarros.push(new Carro("Ford"));
    stackCarros.push(new Carro("Chevrolet"));
    stackCarros.push(new Carro("Fiat"));

    System.out.prinln(stackCarros);
    System.out.prinln(stackCarros.pop());
    System.out.prinln(stackCarros);

    System.out.prinln(stackCarros.peek());
    System.out.prinln(stackCarros);

    System.out.prinln(stackCarros.empty());
    System.out.prinln(stackCarros);

    }
}
