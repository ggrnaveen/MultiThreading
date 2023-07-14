public class Display {


    public void wish(String name){


        for(int i=0;i<5; i++ )
            System.out.println("Pappu");


        synchronized (this){

            for(int i=0;i<10;i++){
                //System.out.println(Thread.currentThread().getName());
                System.out.print("Good Morning:");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Got Interrupted");
                }

                System.out.println(name);

            }
        }

        for(int i=0;i<5; i++ )
            System.out.println("Pappu");
        for(int i=0;i<5; i++ )
            System.out.println("uppu");


    }
}
