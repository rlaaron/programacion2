public class Occurrences {
    private String str;

    public Occurrences(String str) {
        this.str = str;
    }

    // getters and setters
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String changeOcurrence(String oldChar, String newChar) {
        String newString = str.replace(oldChar, newChar);
        return newString;
    }

    
}
