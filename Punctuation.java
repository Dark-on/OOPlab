class Punctuation extends SentenceMember{
    private String symbols;

    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Punctuation) {
            return ((Punctuation) obj).symbols.equals(symbols);
        }
        return false;
    }
}
