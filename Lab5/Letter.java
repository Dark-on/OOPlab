public class Letter {
    private char aChar;

    public Letter(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Letter) {
            return ((Letter)obj).aChar == aChar;
        }
        return false;
    }
}
