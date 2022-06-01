package Car;

import java.util.Random;

public class GameCar extends Thread{
    String name;
    public GameCar(String name) {
        this.name = name;
    }

    @Override
    public  void run() {
        int speed=0;
            try {
                for(int i=0;i<100;i++){
                    Thread.sleep(100);
                speed += Math.random()*100;
                if(speed>=1000){
                    System.out.println(name+"win");
                    System.exit(0);
                }
            }
            } catch (InterruptedException e) {
                System.out.println("ket thuc!");
            }
    }

    public static void main(String[] args) {
        GameCar car1= new GameCar("Xe 1");
        GameCar car2= new GameCar("Xe 2");
        GameCar car3= new GameCar("Xe 3");
        car1.start();
        car2.start();
        car3.start();
    }
}
