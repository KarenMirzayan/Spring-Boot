package kz.kbtu.task2;

public class Transmission {
    public String type;

    public Transmission(String type) {
        this.type = type;
    }

    public void info(){
        System.out.println("Transmission type: " + type);
    }
}
