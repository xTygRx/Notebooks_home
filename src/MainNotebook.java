import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainNotebook {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("Acer",  "Windows",  8, 500, "золотой");
        Notebook note2 = new Notebook("Lenovo",  "Windows", 16, 250, "белый");
        Notebook note3 = new Notebook("Lenovo",  "Windows", 32, 1000, "золотой");
        Notebook note4 = new Notebook("HP",  "Linux", 8, 250, "розовый");
        Notebook note5 = new Notebook("Acer",  "Linux", 32, 500, "черный");
        Notebook note6 = new Notebook("Asus",  "Windows", 64, 500, "белый");
        Notebook note7 = new Notebook("MacBook",  "IOS", 32, 1000, "золотой");
        Notebook note8 = new Notebook("MSI",  "Windows", 12, 1500, "красный");
        Notebook note9 = new Notebook("Huawei",  "Windows", 16, 500, "синий");
        Notebook note10 = new Notebook("MSI",  "Windows", 4, 250, "розовый");
        Notebook note11 = new Notebook("Lenovo",  "Linux", 32, 500, "черный");
        Notebook note12 = new Notebook("Asus",  "Windows", 64, 1000, "золотой");

        Set<Notebook> notebooks = new HashSet<>(Arrays.asList(note1, note2, note3, note4, note5, note6,
                note7, note8, note9, note10, note11, note12));


        UserInterface.userInterfacereliz(notebooks);


    }


}
