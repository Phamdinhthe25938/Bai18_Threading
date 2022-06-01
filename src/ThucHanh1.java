public class ThucHanh1 implements Runnable{
    private Thread t;
    private String name;
    public ThucHanh1(String name) {
        this.name =name;
    }

    @Override
    public void run() {
            try {
                for(int i=0;i<10;i++) {
                    Thread.sleep(100);
                    System.out.println("Thread: " + name + ", " + i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    public static void main(String[] args) {
        Runnable t = new ThucHanh1("fuck you!");
        Runnable t2 = new ThucHanh1("Gao Shit!");
        Thread task1 = new Thread(t);
        Thread task2 = new Thread(t2);
        task1.start();
        task2.start();
    }
    }

