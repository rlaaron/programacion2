public class Book {
    private String title; 
    private String publisher;
    private int numPages;
    private Author [] authors;
    private int numAuthors;
    
    public Book(String title, String publisher, int numPages){
        this.title=title;
        this.publisher=publisher;
        this.numPages=numPages;
        authors= new Author [2];
        numAuthors=0;
    }
    public Book(){
        this.title="not found";
        this.publisher="not found";
        this.numPages=0;
        this.authors=new Author[2];
        this.numAuthors=0;     
    }
    public String getTitulo(){
        return title;
    }

    public String getEditorial(){
        return publisher;
    }
    public int getNoPag(){
        return numPages;
    }
    
    public void setTitulo(String title){
        this.title=title;
    }
    
    public void setEditorial(String publisher){
        this.publisher=publisher;
    }
     public void setNoPag(int numPages){
        this.numPages=numPages;
    }
    
    public void asignarAutor(Author a){
        authors[numAuthors++]=a;  
        a.assignBook(this);
    }
    
    @Override
    public String toString(){
        String cad="";        
        for(int i=0;i<numAuthors;i++){
            cad+="\n\t\t"+authors[i].getName();
        }
        return "\nBook: "+title+"\n\tPublisher: "+publisher+"\n\tNumber Pages: "+numPages+ "\n\tAuthors: "+cad;
    }
}
