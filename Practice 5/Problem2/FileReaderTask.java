package Problem2;
import java.io.*;
import java.util.*;

public class FileReaderTask {
    public static void main(String args[]){
        String inputFileName = "/Users/aruzhen/Documents/studying/OOP/Practice 5/Problem2/input.txt";
        String outputFileName = "/Users/aruzhen/Documents/studying/OOP/Practice 5/Problem2/report.txt";
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zа-я0-9 ]", "").split("\\s+");

                for(String word : words) {
                    if(!word.isEmpty()) {
                        wordCounts.merge(word, 1, Integer::sum);
                    }
                }
            }

            List<Map.Entry<String, Integer>> wList = new ArrayList<>(wordCounts.entrySet());

            wList.sort(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed().thenComparing(Map.Entry::getKey));

            PrintWriter pw = new PrintWriter(new FileWriter(outputFileName));

            for (Map.Entry<String, Integer> entry : wList)
                pw.println(entry.getKey() + ": " + entry.getValue());

            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
