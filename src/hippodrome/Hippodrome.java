package hippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100 ; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        horses.forEach(horse -> horse.move());
    }

    public void print() {
        horses.forEach(horse -> horse.print());
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse currentHorse = new Horse("null", 0, 0);
        for (Horse horse : horses){
            if(horse.getDistance() > currentHorse.getDistance()){
                currentHorse = horse;
            }
        }
        return currentHorse;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        Horse horse1 = new Horse("horseName-1", 3, 0);
        Horse horse2 = new Horse("horseName-2", 3, 0);
        Horse horse3 = new Horse("horseName-3", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
