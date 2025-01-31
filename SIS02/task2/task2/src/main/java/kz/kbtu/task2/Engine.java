package kz.kbtu.task2;


public class Engine {
    public String type;
    public int numOfPistons;

    public Engine(String type, int numOfPistons){
        this.type = type;
        this.numOfPistons = numOfPistons;
    }

    public void info() {
        System.out.println("Type: " + type + " Num of Pistons: " + numOfPistons);
    }
}
