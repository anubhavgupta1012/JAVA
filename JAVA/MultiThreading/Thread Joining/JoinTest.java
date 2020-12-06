class JoinTest {
    public static void main(String S[]) {
        InputThread ip = new InputThread("Input thread");
        System.out.println("Main is going to join The thread");

        try {
            //ip.join();
            Thread.sleep(5000);
            System.out.println("Main gone to Waiting State");
        } catch (Exception e) {
        }

        int s = 0;
        int data[] = ip.getData();
        for (int i = 0; i < data.length; i++)
            s += data[i];
        System.out.println("Sum is " + s);
    }
}