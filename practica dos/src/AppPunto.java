public class AppPunto {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        int test; 
        boolean exit = false;        
        do {
            test = menu.menuOptions();
            switch(test){
                case 1: 
                    System.out.println("escogio 1");
                    break;
                case 2:
                    System.out.println("escogio 2");
                    break;
                case 3:
                    System.out.println("escogio 3");
                    break;
                case 4:
                    System.out.println("escogio 4");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("escoje bien");
            }
        }while(!exit);
    }
}
