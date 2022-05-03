public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("la gara ha inizio");
        SwagThread s1 = new SwagThread("giovanni");
        SwagThread s2 = new SwagThread("ciro");
        SwagThread s3 = new SwagThread("gertruddo");
        SwagThread s4 = new SwagThread("samir");

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        s1.join();
        s2.join();
        s3.join();
        s4.join();
        
        System.out.println("la corsa è finita");
        System.out.println(s2.podio.get(0) + " è il vero king");
        System.out.println(s2.podio.get(1) + " è il king meno king");
        System.out.println(s2.podio.get(2) + " è il un comune cittadino");
        System.out.println(s2.podio.get(3) + " è il demente");
    }
}
