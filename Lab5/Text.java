public class Text {
    private Sentence[] sentences;

    public Text(String str) {
        String[] split = str.split("[!.?]");
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Text) {
            Text text = (Text) obj;
            if (text.sentences.length == this.sentences.length) {
                for (int i = 0; i < sentences.length; i++) {
                    if (!sentences[i].equals(text.sentences[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void findWords () {
        int counter = 0;
        boolean isUniq;
        Word[] resultWords = new Word[sentences[0].getLength()];
        // sm0 - Sentence member of First sentence in text
        for (SentenceMember sm0 : sentences[0].getSentenceMembers()) {
            if (sm0 instanceof Word) {
                isUniq = true;
                label1 : for (int i = 1; i < sentences.length; i++) {
                    for (SentenceMember sm : sentences[i].getSentenceMembers()) {
                        if (sm instanceof Word && sm0.equals(sm)) {
                            isUniq = false;
                            break label1;
                        }
                    }
                }
                if (isUniq) {
                    resultWords[counter] = (Word) sm0;
                    counter++;
                }
            }
        }
        for (int i = 0; i < resultWords.length; i++) {
            if (resultWords[i] == null) break;
            System.out.println(resultWords[i].toString());
        }
    }
}
