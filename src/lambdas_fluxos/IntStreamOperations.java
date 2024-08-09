package lambdas_fluxos;

import java.util.stream.IntStream;

// Figura 17.5: IntStreamOperations.java
// Demonstrando operações IntStream.
public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.print("Valores Originais: ");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // count, min, max, sum e average dos valores
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        // soma dos valores com o método reduce
        System.out.printf("Soma via metodo reduce: %d%n", IntStream.of(values)
                .reduce(0 ,(x, y) -> x + y));

        // soma das raízes quadradas dos valores com o método reduce
        System.out.printf("Soma de quadrados via método de redução: %d%n", IntStream.of(values)
                .reduce(0, (x, y) -> x + y * y));


        // valores pares exibidos em ordem classificada
        System.out.printf("%nValores pares exibidos em ordem classificada: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // valores ímpares multiplicados por 10 e exibidos em ordem classificada
        System.out.printf("Valores ímpares multiplicados por 10 exibidos em ordem classificada:");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // soma o intervalo dos números inteiros de 1 a 10, exclusivo
        System.out.printf("%nSoma de inteiros de 1 a 9: %d%n ", IntStream.range(1, 10).sum());

        // soma o intervalo dos números inteiros de 1 a 10, inclusive
        System.out.printf("%nSoma de números inteiros de 1 a 10: %d%n ", IntStream.rangeClosed(1, 10).sum());

    }
}
