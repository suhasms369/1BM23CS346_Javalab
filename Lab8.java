class CollegeRunnable implements Runnable {
    String name;
    int time;
    CollegeRunnable(String n, int t) {
        name = n;
        time = t;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(name);
                Thread.sleep(time);
               
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}

public class Lab8 {
    public static void main(String[] args) {
        Runnable college = new CollegeRunnable("BMS College of Engineering", 10000);
        Runnable dept = new CollegeRunnable("CSE", 2000);
        Thread collegeThread = new Thread(college);
        Thread deptThread = new Thread(dept);
        collegeThread.start();
        deptThread.start();
    }
}