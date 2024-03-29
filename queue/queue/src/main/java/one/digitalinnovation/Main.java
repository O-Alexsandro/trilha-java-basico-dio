package one.digitalinnovation;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;


public class Main {
    public static void main (String[] args){

    Queue<Carro> queueCarro = new LinkedList<>();

    queueCarro.add(new Carro("Ford"));
    queueCarro.add(new Carro("Chevrolet"));
    queueCarro.add(new Carro("Fiat"));

    System.out.println(queueCarro.add(new Carro("Peugeot")));
    System.out.println(queueCarro);

    System.out.println(queueCarro.offer(new Carro("Renault")));
    System.out.println(queueCarro);

    System.out.println(queueCarro.peek();
    System.out.println(queueCarro);

    System.out.println(queueCarro.pool();
    System.out.println(queueCarro);

    System.out.println(queueCarro.isEmpty);
    System.out.println(queueCarro.size);
    
    }
}
