import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<NoteBook> notebooks = new LinkedList<>();
        notebooks.add(new NoteBook(0, "Asus X515EA", 256, 8,"blue", "W10"));
        notebooks.add(new NoteBook(1, "Lenovo IP Gaming 3", 512, 8,"black", "W10"));
        notebooks.add(new NoteBook(2, "Acer A317-53G-388S", 256, 8,"red", "noOS"));
        notebooks.add(new NoteBook(3, "Acer Aspire 3", 512, 8,"silver", "Linux"));
        notebooks.add(new NoteBook(4, "Asus B1500CEAE-BQ4369W", 256, 8,"black", "W11"));
        notebooks.add(new NoteBook(5, "Asus Laptop 14", 256, 8,"black", "W11"));
        notebooks.add(new NoteBook(6, "Asus Vivobook 15", 512, 8,"silver", "W10"));
        notebooks.add(new NoteBook(7, "Gigabyte G7 ME", 512, 16,"black", "W10"));
        notebooks.add(new NoteBook(8, "Honor MagicBook X15", 512, 8,"silver", "W11"));
        notebooks.add(new NoteBook(9, "HP 15-DW3212NIA", 512, 8,"white", "noOS"));

        // NoteBook.printList(notebooks);

        NoteBook notebook = new NoteBook();
        notebook.setNumber(10);
        notebook.setBrandName("Huawei MateBook D 15");
        notebook.setHddSize(256);
        notebook.setRamSize(8);
        notebook.setColour("silver");
        notebook.setOS("noOS");
        notebooks.add(notebook);

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n" +
                "        1 - ОЗУ\n" +
                "        2 - Объем жесткого диска\n" +
                "        3 - Операционная система\n" +
                "        4 - Цвет\n" +
                "Ваш выбор: ");


        Boolean flag = true;

        while (flag) {
            int parameter = iScanner.nextInt();
            flag = false;
            switch (parameter) {
                case 1:
                    System.out.print("Введите цифру, соответствующую необходимому критерию:\n" +
                            "1 - 8 Gb\n" +
                            "2 - 16 Gb\n" +
                            "Ваш выбор: ");
                    parameter = iScanner.nextInt();
                    parameter = parameter * 8;
                    NoteBook.printList(NoteBook.filterRAM(notebooks, parameter));
                    break;
                case 2:
                    System.out.print("Введите цифру, соответствующую необходимому критерию:\n" +
                            "1 - 256 Gb\n" +
                            "2 - 512 Gb\n" +
                            "Ваш выбор: ");
                    parameter = iScanner.nextInt();
                    parameter = parameter * 256;
                    NoteBook.printList(NoteBook.filterHD(notebooks, parameter));
                    break;
                case 3:
                    System.out.print("Введите цифру, соответствующую необходимому критерию:\n" +
                            "1 - Windows 11\n" +
                            "2 - Windows 10\n" +
                            "3 - Linux\n" +
                            "4 - NoOS\n" +
                            "Ваш выбор: ");
                    parameter = iScanner.nextInt();
                    String system = null;
                    switch (parameter){
                        case 1:
                            system = "W11";
                            break;
                        case 2:
                            system = "W10";
                            break;
                        case 3:
                            system = "Linux";
                            break;
                        case 4:
                            system = "NoOS";
                            break;
                        default: {
                            System.out.print("Ошибка ввода!\nПовторите ввод:");
                            flag = true;
                        }
                    }
                    NoteBook.printList(NoteBook.filterOS(notebooks, system));
                    break;
                case 4:
                    System.out.print("Введите цифру, соответствующую необходимому критерию:\n" +
                            "1 - white\n" +
                            "2 - black\n" +
                            "3 - silver\n" +
                            "4 - blue\n" +
                            "Ваш выбор: ");
                    parameter = iScanner.nextInt();
                    String colourBook = null;
                    switch (parameter){
                        case 1:
                            colourBook = "white";
                            break;
                        case 2:
                            colourBook = "black";
                            break;
                        case 3:
                            colourBook = "silver";
                            break;
                        case 4:
                            colourBook = "blue";
                            break;
                        default: {
                            System.out.print("Ошибка ввода!\nПовторите ввод:");
                            flag = true;
                        }
                    }
                    NoteBook.printList(NoteBook.filterColour(notebooks, colourBook));
                    break;
                default: {
                    System.out.print("Ошибка ввода!\nПовторите ввод: ");
                }
            }
        }


//        System.out.println(notebooks.get(10).print());



        };


    }