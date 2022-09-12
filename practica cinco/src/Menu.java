import java.util.Scanner;
public class Menu {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean n=false;
        String books[] = new String[5];
        Author a = null;
        do{
            System.out.println("\n1.New Book");
            System.out.println("2.Show Books");
            System.out.println("3.Exit");
            System.out.print("Choose an option:");
            op = sc.nextInt();
            switch(op){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the title of the book:");
                    String name = sc.nextLine();
                    System.out.println("Enter the publisher of the book:");
                    String publisher = sc.nextLine();
                    System.out.println("Enter the number of pages of the book:");
                    int pages = sc.nextInt();
                    Book b = new Book(name, publisher, pages);
                    boolean n2=false;
                    int op2 = 0;
                    do {
                        System.out.println("\n1.-New Author");
                        System.out.println("2.-Show Authors");
                        System.out.println("3.-Exit");
                        System.out.print("Choose an option: ");
                        op2 = sc.nextInt();
                        switch(op2){
                            case 1:
                                sc.nextLine();
                                System.out.println("\nEnter the name of the author:");
                                String nameA = sc.nextLine();     
                                System.out.println("Enter nationality of the author:");
                                String nationality = sc.nextLine();
                                System.out.println("Enter day: ");
                                int day = sc.nextInt();
                                System.out.println("Enter month: ");
                                int month = sc.nextInt();
                                System.out.println("Enter year:");
                                int year = sc.nextInt();
                                Date d = new Date(day,month,year);
                                a = new  Author(nameA, nationality, d);
                                b.asignarAutor(a);
                                for(int i=0; i<books.length; i++){
                                    if(books[i]==null){
                                        books[i]=b.toString();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                System.out.println(a.toString());
                                break;
                            case 3:
                                n2=true;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    }while(!n2);
                    break;
                case 2:
                    System.out.println("Books:");
                    for(int i=0; i<books.length; i++){
                        if(books[i]!=null){
                            System.out.println(books[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Bye!");
                    n=true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(!n);
        sc.close();
    }
}
