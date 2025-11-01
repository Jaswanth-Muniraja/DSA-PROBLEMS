import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {
    
    public static String frequencySort(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char cs = s.charAt(i);
            hs.put(cs, hs.getOrDefault(cs, 0)+1);
        }

        List<Character> list = new ArrayList<>(hs.keySet());
        list.sort((a, b) -> hs.get(b) - hs.get(a));

        StringBuilder ans = new StringBuilder();
        for (char c : list) {
            int freq = hs.get(c);
            for (int i = 0; i < freq; i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    // II Method using Max Heap(Priority Queue)
    // public  static String frequencySort(String s) {
    //     Map<Character ,Integer> characterMap = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         characterMap.put(s.charAt(i) , characterMap.getOrDefault(s.charAt(i) , 0) +1);
    //     }

    //     PriorityQueue<Map.Entry<Character ,Integer>> maxHeap =
    //             new PriorityQueue<>((a,b) ->b.getValue() - a.getValue());

    //     maxHeap.addAll(characterMap.entrySet());

    //     StringBuilder result = new StringBuilder();
    //     while (!maxHeap.isEmpty()){
    //         Map.Entry<Character , Integer > entry = maxHeap.poll();
    //         char ch = entry.getKey();
    //         int count = entry.getValue();
    //         for (int i = 0; i < count; i++) {
    //             result.append(ch);
    //         }
    //     }

    //     return result.toString();
    // }

    public static void main(String[] args) {
        String s = "tree";
        String result = frequencySort(s);
        System.out.println("Sorted characters by frequency: " + result);
    }

}