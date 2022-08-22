public class AppPunto {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        PuntoR2 p1 = new PuntoR2();
        PuntoR2 p2 = new PuntoR2();
        int menuMain; 
        boolean exit = false;        
        do {
            menuMain = menu.menuPoint();
            switch(menuMain){
                case 1: 
                    System.out.println(menu.subMenuPoint());
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
