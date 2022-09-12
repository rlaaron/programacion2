public class Author {
    private String name;
    private String nationality; 
    private Date date;
    private Book[] Books;
    private int numBooks;
    
    public Author(String name, String nationality,Date date){
        this.name = name;
        this.nationality = nationality; 
        this.date = date;
        Books = new Book[5]; 
        numBooks = 0;
    }
    public Author(){
        this.name="not found";
        this.nationality="not found";
        this.date= new Date();
        this.Books=new Book[5];
        numBooks=0;
    }
    
    public String getName(){
        return name;
    }
    public String getNationality(){
        return nationality;
    }
    public Date getDate(){
        return date;
    }
    public void assignBook(Book l){
        Books[numBooks++]=l; 
    }
    

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String cad="";
        int i;
        
        for(i=0;i<numBooks;i++){
            cad=cad+Books[i];
        }
        return "Name: "+name+"\nNationality: "+nationality+"\nDate: "+date+ "\nBooks: "+cad;
    }
}
