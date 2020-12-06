class MyThread extends Thread {
    Resource r;

    MyThread(String name, Resource r) {
        super(name);
        this.r = r;
        start();
    }

    public void run() {
        synchronized (r) {
            String nm = getName();
            if (nm.equals("first"))
                r.Update();
            if (nm.equals("second"))
                r.Display();
        }
    }
}