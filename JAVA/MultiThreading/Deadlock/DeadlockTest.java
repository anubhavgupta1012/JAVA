class DeadlockTest {
    public static void main(String S[]) {
        new MyThread("user1");
        new MyThread("user2");
    }
}