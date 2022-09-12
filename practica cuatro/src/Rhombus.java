public class Rhombus {
    private int size = 0;
    private String word[];
    // private String word;

    // private String word;

    // public Rhombus(int size, String word) {
    //     this.size = size;
    //     this.word = word;
    // }
    public Rhombus(int size, String word[]) {
        this.size = size;
        this.word = new String[10];
        this.word = word;
    }

    // getters and setters
    public int getSize() {
        return size;
    }

    // public String[] getWord() {
    //     return word;
    // }

    // public void setWord(String word[]) {
    //     this.word = word;
    // }

    // public void setSize(int size) {
    //     this.size = size;
    // }

    // print rhombus
    public void printRhombus() {
        int i, j, k;
        // String []rword = word.split(" ");
        for (i = 0; i < size+1; i++) {
            for (j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print(word[k] + " ");
            }
            try{
                if(word[i]==null){
                    k--;
                    System.out.print(word[k]);
                }

            }catch(Exception e){
                System.out.println("Error: " + e);
            }
            
            // System.out.println(word[i]);
        }
        // System.out.println(word);
        for (i = size - 1; i > 0; i--) {
            for (j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i; k++) {
                System.out.print(word[k] + " ");
            }
            System.out.println(word[i]);
        }
    } 

    // public String print() {
    //     String r = "hola test";
    //     String []rword = r.split("");
    //     return rword[1];
    // }
    

}
