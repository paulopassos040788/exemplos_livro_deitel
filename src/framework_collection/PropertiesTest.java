package framework_collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

// Figura 16.19: PropertiesTest.java
// Demonstra classe Properties do pacote java.util.
public class PropertiesTest {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("color", "blue");
        prop.setProperty("width", "200");

        System.out.println("Após definir as propriedades");
        listProperties(prop);

        prop.setProperty("color", "red");

        System.out.println("Após substituir as propriedades");
        listProperties(prop);

        saveProperties(prop);

        prop.clear(); // tabela vazia

        System.out.println("Após limpar as propriedades");
        listProperties(prop);

        loadProperties(prop);

        // obtém valor de cor da propriedade
        Object value = prop.getProperty("color");

        // verifica se o valor está na tabela
        if (value != null) {
            System.out.printf("O valor da cor da propriedade é %s%n", value);
        } else {
            System.out.println("A cor da propriedade não está na tabela");
        }
    }

    // salva as propriedades em um arquivo
    private static void saveProperties(Properties props) {
        // salva o conteúdo de tabela
        try {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample Properties"); // Salva as propriedades
            output.close();
            System.out.println("Depois de salvar as propriedades");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // carrega as propriedades de um arquivo
    private static void loadProperties(Properties props) {
        // carrega o conteúdo de tabela
        try {
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input); // carrega propriedades
            input.close();
            System.out.println("Após carregar as propriedades");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // gera saída de valores de propriedade
    private static void listProperties(Properties props) {
        Set<Object> keys = props.keySet();
        for (Object key : keys) {
            System.out.printf("%s\t%s%n", key, props.getProperty((String) key));
        }
    }

}
