package MapInterface.CountFrequencyOfWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static Map<String,Integer> countFrequencyOfWords(String fileName) {
        Map<String,Integer> frequency = new HashMap<String,Integer>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                for(String word : words){
                   frequency.put(word, frequency.getOrDefault(word, 0) + 1);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return frequency;
    }
    public static void main(String[] args) {
        String fileName="file.txt";
        Map<String,Integer> frequency = countFrequencyOfWords(fileName);
        System.out.println(frequency);
    }
}
