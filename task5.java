import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

/**
 * Task 5 from JAVA advanced
 * @author Abdurahmanov Rushan
 */

public class task5 {
    public static void main(String[] args) throws IOException {
        String words = readScanner();
        System.out.println("Слова в алфавитном порядке: " + arrayOfList(words));
        mapCount(words);

    }
//Считываем слова из файла
    private static String readScanner () throws IOException {
        Scanner scanner = new Scanner(Paths.get("C://file.txt"));
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }
//Добавляем слова в лист, сортируем по алфавиту
    private static List<String> arrayOfList(String str1){
        String[] strArray = str1.split("\\s+");
        List<String> arrList = new ArrayList<>(Arrays.asList(strArray));
        Collections.sort(arrList);
        return arrList;
    }
//Определяем сколько раз каждое слова повторяется
    private static void mapCount (String str1){
        HashMap<String, Integer> wordToCount = new HashMap<>();
        int maxKey = 0;
        for (String i : arrayOfList(str1))
        {
            if (!wordToCount.containsKey(i))
            {
                wordToCount.put(i,0);
            }
            wordToCount.put(i, wordToCount.get(i) + 1);
        }
        System.out.println("Слова повторяются: ");
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " - " + wordToCount.get(word));
        }
        //Ищем слова с максимальным колличеством повторений
        for (String word1: wordToCount.keySet()){
            if (maxKey < wordToCount.get(word1)){
                maxKey = wordToCount.get(word1);
            }
        }
        System.out.println("Слова с максимальным кол-вом повторений: ");
        for (Map.Entry<String,Integer> word2 : wordToCount.entrySet())
        {
            if(word2.getValue() == maxKey){
                System.out.println( word2.getKey() + " - " + word2.getValue());
            }
        }
    }
}