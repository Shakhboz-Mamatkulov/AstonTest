import java.util.*;

 public class UniqueWords {
    public static void main(String[] args) {
        //массив 20 слов
        String[] words = {
                "хлеб", "вода", "мука", "суши", "яблоко",
                "торт", "мука", "овсянка", "гречка", "вода",
                "персик", "киви", "яблоко","вода", "суши"
        };

        //hashmap для подсчета слов
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        //Вывод слов и их кол-ва
        System.out.println("Список уникальных слов и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}