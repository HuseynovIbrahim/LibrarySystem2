import java.util.Scanner;

public class LmsMenu {

    public static int showOperations(){
        System.out.println("Library Managment System" +
                "\n1)Register book" +
                "\n2)Show all books" +
                "\n3)Find by name of book");
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose operations");
        return scan.nextInt();

    }

    public static void chooseOperations(){

        while(true){
            int choice = showOperations();
            switch(choice){
                case 1:
                    LmsManagement.registerBooks();
                    break;
                case 2:
                    LmsManagement.showAllBooks();
                    break;
                    case 3:
                        LmsManagement.findByname();
                        break;
                        case 4:
                            LmsManagement.updateBook();
                            break;
                            case 5:
                                LmsManagement.deleteBook();
                                break;


            }
        }
    }

}
