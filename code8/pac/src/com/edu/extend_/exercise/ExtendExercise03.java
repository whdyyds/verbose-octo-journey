package com.edu.extend_.exercise;

public class ExtendExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("i5", "16G", "512G", "hp");
        NotePad notePad = new NotePad("i5", "16G", "512G", "pink");
        pc.info();
        notePad.info();

    }
}
class Computer{
    private String cpu = "i5-13500";
    private String memory = "16G";
    private String disk = "512G";

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDetails(){
        return "电脑信息为：CPU为" + cpu + " 内存为" + memory + " 硬盘为" + disk;
    }
}
class PC extends Computer{

    private String brand;

    public PC(String cpu, String memory, String disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void info(){
        System.out.println("PC信息如下");
        System.out.println(getDetails() + brand);
    }
}
class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, String memory, String disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info(){
        System.out.println("PC信息如下");
        System.out.println(getDetails() + color);
    }
}
