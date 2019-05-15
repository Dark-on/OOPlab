public class Word extends SentenceMember{
    private Letter[] letters;
    private String wordStr;

    public Word(String s) {
        s = s.toLowerCase();
        letters = new Letter[s.length()];
        wordStr = s;
        for (int i = 0; i < s.length(); i++) {
            letters[i] = new Letter(s.charAt(i));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Word) {
            Word word = (Word) obj;
            if (letters.length == word.letters.length) {
                for (int i = 0; i < letters.length; i++) {
                    if (!letters[i].equals(word.letters[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return wordStr;
    }
}