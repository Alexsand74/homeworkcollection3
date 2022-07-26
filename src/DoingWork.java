import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoingWork implements DoingWorkInterface {

    public void conclusionOddNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i)) % 2 == 0)
                System.out.print(nums.get(i) + " ");
        }
    }

    public void conclusionHonestNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i)) % 2 != 0)
                System.out.print(nums.get(i) + " ");
        }
    }

    public void searchForDuplicatesWords(String text) {
        String[] words = text.split(" ");
        List<String> wordsList = new ArrayList<>();
        Set <Integer> indexSet = new HashSet<>();
        for (String s : words) {
            wordsList.add(s);
        }
        String etallon;
        boolean flagFromWhatIfound;
        for (int x = 0; x < wordsList.size(); x++) {
            etallon = wordsList.get(x);
            flagFromWhatIfound = false;
            for (int y = x + 1; y < wordsList.size(); y++) {
                if (etallon.equals(wordsList.get(y))){
                    indexSet.add (y);
                    flagFromWhatIfound = true;
                }
            }
               if (flagFromWhatIfound){ indexSet.add(x); }
        }
        for (Integer i : indexSet){
             wordsList.set(i,null);
        }

        for (String s : wordsList) {
            if (s != null) {
            System.out.print(s + " ");}
        }
    }
    public void numberOfRepetitions(String text) {
        String[] words = text.split(" ");
        List<String> wordsList = new ArrayList<>();
        List <Integer> indexList = new ArrayList<>();
        for (String s : words) {
            wordsList.add(s);
        }
        String etallon;
        boolean flagFromWhatIfound;
        for (int x = 0; x < wordsList.size(); x++) {
            int vallue = 0;
            etallon = wordsList.get(x);
            flagFromWhatIfound = false;
            for (int y = x + 1; y < wordsList.size(); y++) {
                if (etallon.equals(wordsList.get(y))) {
                    wordsList.remove(y);
                    y--;
                    vallue++;
                    flagFromWhatIfound = true;
                }
            }
            if (flagFromWhatIfound) {
                indexList.add(x);
                vallue++;
            }
            if (vallue > 0) {
                System.out.print(etallon + "-" + vallue + " ");
            }
        }
        }

    }









