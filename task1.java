import java.util.*;

public class NotebookShop {
    public static void main(String[] args) {
        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(new NoteBook("Model1", 8, 500, "Windows", "Black"));
        notebooks.add(new NoteBook("Model2", 16, 1000, "MacOS", "Silver"));
        notebooks.add(new NoteBook("Model3", 8, 1000, "Linux", "Red"));
        notebooks.add(new NoteBook("Model4", 16, 500, "Windows", "White"));
        notebooks.add(new NoteBook("Model5", 8, 500, "MacOS", "Black"));

        filterNotebooks(notebooks);
    }

    public static void filterNotebooks(Set<NoteBook> notebooks) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в магазин ноутбуков!");
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criterion = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        Map<String, String> filterParams = new HashMap<>();

        switch (criterion) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int minRam = scanner.nextInt();
                scanner.nextLine(); // очистка буфера
                filterParams.put("ram", String.valueOf(minRam));
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int minHdd = scanner.nextInt();
                scanner.nextLine(); // очистка буфера
                filterParams.put("hdd", String.valueOf(minHdd));
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.nextLine();
                filterParams.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.nextLine();
                filterParams.put("color", color);
                break;
            default:
                System.out.println("Некорректный выбор критерия.");
                return;
        }

        Set<NoteBook> filteredNotebooks = new HashSet<>();

        for (NoteBook notebook : notebooks) {
            boolean isMatched = true;

            for (Map.Entry<String, String> entry : filterParams.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                switch (key) {
                    case "ram":
                        if (notebook.getRam() < Integer.parseInt(value)) {
                            isMatched = false;
                        }
                        break;
                    case "hdd":
                        if (notebook.getHdd() < Integer.parseInt(value)) {
                            isMatched = false;
                        }
                        break;
                    case "os":
                        if (!notebook.getOs().equalsIgnoreCase(value)) {
                            isMatched = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equalsIgnoreCase(value)) {
                            isMatched = false;
                        }
                        break;
                }

                if (!isMatched) {
                    break;
                }
            }

            if (isMatched) {
                filteredNotebooks.add(notebook);
            }
        }

        System.out.println("Подходящие ноутбуки:");
        for (NoteBook notebook : filteredNotebooks) {
            System.out.println(notebook.getModel());
        }
    }
}