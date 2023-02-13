package Seminar6HW;

public class Notebook {
    private String manufacturer;
    private int memory;
    private int memoryHDD;
    private String os;
    private String color;

    public Notebook(String manufacturer, int memory, int memoryHDD, String os, String color) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.memoryHDD = memoryHDD;
        this.os = os;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public int getMemory() {
        return memory;
    }


    public int getMemoryHDD() {
        return memoryHDD;
    }


    public String getOs() {
        return os;
    }


    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return
                "Фирма:'" + manufacturer + '\'' +
                        ", память:" + memory + "Гб" +
                        ", памятьHDD:" + memoryHDD + "Гб" +
                        ", ОС:'" + os + '\'' +
                        ", цвет:'" + color + '\'';
    }
}
