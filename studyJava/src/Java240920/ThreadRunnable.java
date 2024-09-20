package Java240920;

class SMIFileRunnalbe implements Runnable {
    @Override
    public void run() {
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};

        try {Thread.sleep(10);} catch (InterruptedException e) {}

        // 자막 번호 출력
        for (int i=0; i<strArray.length; i++) {
            System.out.print("(자막 번호) " + strArray[i]);
            try {Thread.sleep(200);} catch (InterruptedException e) {}
        }
    }
}

class VideoFileRunnalbe implements Runnable {
    public void run() {
        int[] intArray = {1, 2, 3, 4, 5};

        // 비디오 프레임 출력
        for (int i=0; i<intArray.length; i++) {
            System.out.println(" - (비디오 프레임) " + intArray[i]);
            try {Thread.sleep(200);} catch (InterruptedException e) {};
        }
    }
}


public class ThreadRunnable {
    public static void main(String[] args) {
        Runnable smiFileRunnable   = new SMIFileRunnalbe();
        Runnable videoFileRunnable = new VideoFileRunnalbe();

        Thread thread1 = new Thread(smiFileRunnable);
        Thread thread2 = new Thread(videoFileRunnable);

        thread1.start();
        thread2.start();
    }
}
