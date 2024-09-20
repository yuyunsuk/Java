package Java240920;

// 공유 자원, Heap 영역에 생성됨
class MyDataNoSync {
    int data = 3;
    public void plusData() {
        int myData = data;

        // 동시성 문제를 발생시키기 위하여
        try {Thread.sleep(2000);} catch (InterruptedException e) {}
        data = myData + 1;
    }
}

class PlusThreadNoSync implements Runnable {
    MyDataNoSync myData;

    public PlusThreadNoSync(MyDataNoSync myData){
        this.myData = myData;
    }

    @Override
    public void run() {
        myData.plusData();
        System.out.println("실행결과: " + myData.data);
    }
}

public class ThreadNoSync {
    public static void main(String[] args) {
        MyDataNoSync myData = new MyDataNoSync();

        // 첫번째 쓰레드
        Runnable plusThread1 = new PlusThreadNoSync(myData);
        Thread thread1 = new Thread(plusThread1);
        thread1.start();

        // 1초 슬립
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        // 두번째 쓰레드
        Runnable plusThread2 = new PlusThreadNoSync(myData);
        Thread thread2 = new Thread(plusThread2);
        thread2.start();
    }
}
