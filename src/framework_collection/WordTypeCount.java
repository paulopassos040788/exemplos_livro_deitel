package framework_collection;

import java.util.*;

// Figura 16.18: WordTypeCount.java
// O programa conta o número de ocorrências de cada palavra em uma String
public class WordTypeCount {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // cria mapa com base na entrada do usuário
        displayMap(myMap); // exibe o conteúdo do mapa

    }

    private static void createMap(Map<String, Integer> myMap) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for (String token : tokens) {
            String word = token.toLowerCase();

            if(myMap.containsKey(word)){
                int count = myMap.get(word);
                myMap.put(word, count + 1);
            } else {
                myMap.put(word, 1);
            }

        }
    }

    private static void displayMap(Map<String, Integer> myMap){
        Set<String> keys = myMap.keySet();

        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, myMap.get(key));
        }

        System.out.printf("%nsize: %d%nisEmpty: %b%n", myMap.size(), myMap.isEmpty());
    }
}
