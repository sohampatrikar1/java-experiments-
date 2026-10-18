class Thread1 extends Thread {
    public void run() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
            if (i == 11) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 20; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

class Main {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
