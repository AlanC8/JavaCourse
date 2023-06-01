package Upgrade;

public class Enum {
    enum Level{
        LOW,
        MID,
        HIGH,
    }

    public static void main(String[] args) {

        for(Level lvl : Level.values()){
            System.out.print(lvl + ", ");
        }
    }
}
