import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class NoteBook {

    private String brandName, colour, os;
    private int number, hddSize, ramSize;

    public NoteBook(int number, String brandName, int hddSize, int ramSize, String colour, String os) {
        this.number = number;
        this.brandName = brandName;
        this.hddSize = hddSize;
        this.ramSize = ramSize;
        this.colour = colour;
        this.os = os;
    }

    public NoteBook() {
    };


    public static List<NoteBook> filterRAM(LinkedList<NoteBook> notebooks, int ram) {
        List<NoteBook> filteredNotebooks = new ArrayList<>();

        for (NoteBook notebook : notebooks) {
            if (notebook.getRamSize() == ram){
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
    public static List<NoteBook> filterHD(LinkedList<NoteBook> notebooks, int hddSize) {
        List<NoteBook> filteredNotebooks = new ArrayList<>();

        for (NoteBook notebook : notebooks) {
            if (notebook.getHddSize() == hddSize){
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
    public static List<NoteBook> filterOS(LinkedList<NoteBook> notebooks, String os) {
        List<NoteBook> filteredNotebooks = new ArrayList<>();

        for (NoteBook notebook : notebooks) {
            if (notebook.getOS() == os){
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
    public static List<NoteBook> filterColour(LinkedList<NoteBook> notebooks, String colour) {
        List<NoteBook> filteredNotebooks = new ArrayList<>();

        for (NoteBook notebook : notebooks) {
            if (notebook.getColour() == colour){
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public String print(){
        return "Brand Name: " + brandName +
                ", HDD size: " + hddSize +
                ", RAM size: " + ramSize +
                ", Colour: " + colour +
                ", OS: " + os;
    }
    public static void printList(LinkedList<NoteBook> notebooks){
        int i = 0;
        for (NoteBook notebook: notebooks){
            System.out.println(notebooks.get(i).print());
            i++;
        }
    }
    public static void printList(List<NoteBook> notebooks){
        int i = 0;
        for (NoteBook notebook: notebooks){
            System.out.println(notebooks.get(i).print());
            i++;
        }
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOS() {
        return os;
    }

    public void setOS(String os) {
        this.os = os;
    }
}