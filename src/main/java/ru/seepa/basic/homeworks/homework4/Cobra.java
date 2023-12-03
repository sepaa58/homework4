package ru.seepa.basic.homeworks.homework4;

public class Cobra {
    private int size;
    private String color;
    private boolean open;
    private String container;


    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cobra(int size, String color){
        this.color = color;
        this.size = size;
        boolean open = false;
        String container = null;
    }

    public void changeOpenCobra(boolean open){
        if (open){
            this.open = true;
            System.out.println("cobra is open");
        } else {
            this.open = false;
            System.out.println("cobra is closed");
        }
    }
    public void putInCobra(String info){
        if (open && container == null){
            this.container = info;
            System.out.println("Cobra contain " + container);
        } else{
            System.out.println("Cobra is not empty");
        }
    }

    public void getOutFromCobra(){
        if (open && container != null){
            this.container = null;
            System.out.println("Cobra is empty");
        } else {
            System.out.println("Cobra is empty");
        }
    }
    public void info(){
        System.out.println("size = " + size + " color = " + color + " open = " + open + " container = " + container);
    }
}
