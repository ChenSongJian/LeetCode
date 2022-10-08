// 692. Top K Frequent Words

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        TreeMap<Integer, TreeSet<String>> wordMap = new TreeMap<>();
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (wordFrequency.containsKey(words[i])) {
                wordMap.get(-1 * wordFrequency.get(words[i])).remove(words[i]);
                wordFrequency.put(words[i], wordFrequency.get(words[i]) + 1);
            } else {
                wordFrequency.put(words[i], 1);
            }
            
            if (wordMap.containsKey(-1 * wordFrequency.get(words[i]))) {
                wordMap.get(-1 * wordFrequency.get(words[i])).add(words[i]);
            } else {
                TreeSet<String> tempSet = new TreeSet<>();
                tempSet.add(words[i]);
                wordMap.put(-1 * wordFrequency.get(words[i]), tempSet);
            }
        }
        
        while (k > 0) {
            for (int count: wordMap.keySet()) {
                for (String word: wordMap.get(count)) {
                    ans.add(word);
                    k--;
                    if (k == 0) {
                        return ans;
                    }
                }
            }
        }
        
        return ans;
    }
}
