import java.util.*;

public class Filter {
    public static void filters(Set<Notebook> notebook){
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filter = initFilterList();
        String inputUser = "0";
        while (!inputUser.equals("7")){

            System.out.println("Выберите параметры поиска:");
            System.out.println("1 - Производитель");
            System.out.println("2 - Объем жесткого диска");
            System.out.println("3 - Объем оперативной памяти");
            System.out.println("4 - Операционная система");
            System.out.println("5 - Цвет");
            System.out.println("6 - Показать результат");
            System.out.println("7 - Возврат в предыдущее меню");

            // Можно выводить доступные варианты

            inputUser = scanner.nextLine();
            switch (inputUser){
                case "1":
                    System.out.println("Введите фирму:");
                    inputUser = scanner.nextLine();
                    filter.put("фирма", inputUser);

                    break;

                case "2":


                    System.out.println("Введите минимальный объем жесткого диска в гигабайтах(число):");
                    while (true) {
                        inputUser = scanner.nextLine();

                        boolean flag = isDigit(inputUser);
                        if (flag) {
                            filter.put("Жесткий диск", inputUser);
                            break;
                        } else {
                            System.out.println("Введите число");
                        }
                    }
                    break;


                case "3":
                    System.out.println("Введите минимальный объем оперативной памяти в гигабайтах (число)");

                    while (true) {
                        inputUser = scanner.nextLine();
                        boolean flag = isDigit(inputUser);
                        if (flag) {
                            filter.put("оперативная память", inputUser);
                            break;
                        } else{
                            System.out.println("Введите число");
                        }
                    }
                    break;

                case "4":
                    System.out.println("Введите желаемую операционную систему:");
                    inputUser = scanner.nextLine();
                    filter.put("операционная система", inputUser);
                    break;
                case "5":
                    System.out.println("Введите желаемый цвет:");
                    inputUser = scanner.nextLine();
                    filter.put("цвет", inputUser);
                    break;
                case "6":{
                    System.out.println("Результат поиска");

                    Set<Notebook> filtredListNote = new HashSet<>();
                    filtredListNote.addAll(notebook);


                    if (!filter.get("фирма").equals("")){
                        String temp = filter.get("фирма").toString();
                        filtredListNote.removeIf(x -> !x.getCreator().equalsIgnoreCase(temp));

                    }

                    if (!filter.get("Жесткий диск").equals("")) {
                        String temp = filter.get("Жесткий диск").toString();
                        filtredListNote.removeIf(x -> x.getHardMemory() < Integer.parseInt(temp));


                    }

                    if (!filter.get("оперативная память").equals("")) {
                        String temp = filter.get("оперативная память").toString();
                        filtredListNote.removeIf(x -> x.getOzu() < Integer.parseInt(temp));
                    }

                    if (!filter.get("операционная система").equals("")){
                        String temp = filter.get("операционная система").toString();
                        filtredListNote.removeIf(x -> !x.getOperSystem().equalsIgnoreCase(temp));

                    }

                    if (!filter.get("цвет").equals("")){
                        String temp = filter.get("цвет").toString();
                        filtredListNote.removeIf(x -> !x.getColor().equalsIgnoreCase(temp));

                    }

                    if (filtredListNote.isEmpty()) {
                        System.out.println("Нет ноутбуков удовлетворяющих вашему запросу");
                        System.out.println("Фильтр будет сброшен");

                        filter = initFilterList();



                        break;
                    }
                    else {
                        for (Notebook note : filtredListNote){
                            System.out.println(note);

                        }
                        // Можно спрашивать сбросить фильтры или нет
                        System.out.println("Фильтр сброшен");
                        filter = initFilterList();


                        break;

                    }



                }
                case "7":
                    System.out.println("Открываю основное меню");
                    break;
                default:
                    System.out.println("Введен неверный символ");


            }

        }

    }

    private static boolean isDigit(String inputUser) {
        boolean flag = true;
        for (char c : inputUser.toCharArray()){
            if (!Character.isDigit(c)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    static Map<String, Object> initFilterList() {
        Map<String, Object> filter = new HashMap<>();
        filter.put("фирма", "");
        filter.put("Жесткий диск", "");
        filter.put("оперативная память", "");
        filter.put("операционная система", "");
        filter.put("цвет", "");
        return filter;
    }
}
