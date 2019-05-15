public class Sentence {
    private SentenceMember[] sentenceMembers;

    public Sentence(String str) {
        String[] split = str.split(" ?(?<!\\G)((?<=[^\\p{Punct}])(?=\\p{Punct})|\\b) ?");
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (split[i].matches("\\p{Punct}")) {
                sentenceMembers[i] = new Punctuation(split[i]);
            } else {
                sentenceMembers[i] = new Word(split[i]);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Sentence) {
            Sentence sentence = (Sentence) obj;
            if (sentence.sentenceMembers.length == sentenceMembers.length) {
                for (int i = 0; i < sentenceMembers.length; i++) {
                    if (!sentenceMembers[i].equals(sentence.sentenceMembers[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public SentenceMember[] getSentenceMembers(){
        return sentenceMembers;
    }

    public int getLength(){
        return sentenceMembers.length;
    }
}
