// 299. Bulls and Cows

class Solution {
    public String getHint(String secret, String guess) {
        HashSet<Integer>[] secretCharIds = new HashSet[10];
        HashSet<Integer>[] guessCharIds = new HashSet[10];
        int A = 0;
        int B = 0;
        for (int i = 0; i < 10; i++) {
            secretCharIds[i] = new HashSet<>();
            guessCharIds[i] = new HashSet<>();
        }
        for (int i = 0; i < secret.length(); i++) {
            secretCharIds[secret.charAt(i) - '0'].add(i);
            guessCharIds[guess.charAt(i) - '0'].add(i);
        }
        for (int i = 0; i < 10; i++) {
            HashSet<Integer> intersect = new HashSet<>(secretCharIds[i]);
            intersect.retainAll(guessCharIds[i]);
            A = A + intersect.size();
            B = B + Math.min(secretCharIds[i].size(), guessCharIds[i].size()) - intersect.size();
        }
        return "" + A + "A" + B + "B";
    }
}
