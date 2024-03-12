import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    public static void userInterfacereliz(Set<Notebook> notebooks){
        Scanner scanner = new Scanner(System.in);
        String inputUser = "0";
        while (!inputUser.equals("3")){

            System.out.println("Введите цифру для перехода:");
            System.out.println("1 - вывести на экран весь список ноутбуков");
            System.out.println("2 - задать параметры поиска");
            System.out.println("3 - завершение работы");
            inputUser = scanner.nextLine();
            switch (inputUser){
                case "1":

                    printAll(notebooks);
                    break;

                case "2":

                    Filter.filters(notebooks);
                    break;

                case "3":

                    System.out.println("Спасибо за использование нашей программы");
                    System.out.println("Хорошего дня");

                    break;

                default:

                    System.out.println("Введен неверный символ");


            }


        }
        scanner.close();




    }
    static void printAll(Set<Notebook> notebooks) {
        for(Notebook note : notebooks){
            System.out.println(note);
            System.out.println();
        }
    }
}
