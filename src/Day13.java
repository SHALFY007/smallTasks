import java.util.HashMap;

public class Day13 {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();

        dict.addWords("Hello", "Привет");
        dict.addWords("Cat", "Кот");
        dict.addWords("Dog", "Собака");
        dict.addWords("Notebook", "Ноутбук");
        dict.addWords("Phone", "Телефон");

        System.out.println(dict.translateWord("Dog"));
    }
}

class Dictionary {

    HashMap<String, String> dictionary;
    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    void addWords(String word1, String word2) {
        this.dictionary.put(word1, word2);
    }

    String translateWord(String englishWord) {
        return this.dictionary.get(englishWord);
    }
}
