public class Rhombus {
    private String word;

    public Rhombus(String word) {
        if(word.length() > 10) {
            this.word = word.substring(0, 10);
            System.out.println("The word is too long, it will be cut to 10 characters");
            System.out.println("New word: " + this.word);
        } else {
            this.word = word;
        }
    }

    //getters and setters
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void printRhombus() {
        int length = word.length();
        int i, j, k;
        for(j = 0; j<length; j++) {
            for(i = length-j-1; i>0; i--){
                System.out.print("   ");
            }
            for(i = 0; i<length; i++){
                if(i<=j){
                    System.out.print(" "+word.charAt(i)+" ");
                }
            }
            for(i = length-1; i>=0; i--){
                if(i<j){
                    System.out.print(" "+word.charAt(i)+" ");
                }
            }
            for(k=length-j-1;k>0;k--){
                System.out.print("   ");
            }
            System.out.print("\n");
        }

        for(j = length-2; j>=0; j--) {
            for(i = length-j-1; i>0; i--){
                System.out.print("   ");
            }
            for(i = 0; i<length; i++){
                if(i<=j){
                    System.out.print(" "+word.charAt(i)+" ");
                }
            }
            for(i = length-1; i>=0; i--){
                if(i<j){
                    System.out.print(" "+word.charAt(i)+" ");
                }
            }
            for(k = length-j-1; k>0; k--){
                System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}
