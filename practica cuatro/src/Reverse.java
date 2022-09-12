public class Reverse {
    private String str[];

    public Reverse(String str[]) {
        this.str = new String[10];
        this.str = str;
    }

    // getters and setters
    public String[] getStr() {
        return str;
    }

    public void setStr(String str[]) {
        this.str = str;
    }

    public String reverseString() {
        String newString = "";
        String splpitString[] = new String[10];
        for (int i = 0; i < str.length; i++) {
            splpitString[i] = str[i];
            for (int j = splpitString[i].length() - 1; j >= 0; j--) {
                newString += splpitString[i].charAt(j);
            }
            newString += " ";
        }
        return newString;
    }

}
