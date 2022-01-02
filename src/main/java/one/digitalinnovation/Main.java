package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));  // se conseguiu adicionar retorna True, se não conseguir adicionar dá erro
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));  // se não conseguir adicionar retorna False
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek(new Carro("Renault")));  // pega o primeiro elemento da fila sem remover, se estiver vazio retorna Null
        System.out.println(queueCarros);

        System.out.println(queueCarros.pull(new Carro("Renault")));  // pega o primeiro elemento da fila e remove, se estiver vazio retorna Null
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty(new Carro("Renault")));

        System.out.println(queueCarros.size(new Carro("Renault")));

    }
}
