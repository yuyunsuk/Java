package Java240920;

class MyDataSync {
    int data = 3;

    // 락을 걸음
    public synchronized void plusData() {
        int myData = data;

        // 동시성 문제를 발생시키기 위하여
        try {Thread.sleep(2000);} catch (InterruptedException e) {}
        data = myData + 1;
    }
}

class PlusThreadSync implements Runnable {
    MyDataSync myData;

    public PlusThreadSync (MyDataSync myData){
        this.myData = myData;
    }

    @Override
    public void run() {
        myData.plusData();
        System.out.println("실행결과: " + myData.data);
    }
}
public class ThreadWithSync {
    public static void main(String[] args) {
        MyDataSync myDataSync = new MyDataSync();

        // 첫번째 쓰레드
        Runnable plusThread1 = new PlusThreadSync(myDataSync);
        Thread thread1 = new Thread(plusThread1);
        thread1.start();

        // 1초 슬립
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        // 두번째 쓰레드
        Runnable plusThread2 = new PlusThreadSync(myDataSync);
        Thread thread2 = new Thread(plusThread2);
        thread2.start();
    }
}
