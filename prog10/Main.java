public class Main {
    public static void main(String[] args) {
        // Task A
        Thread threadA = new TaskThread("Task A");
        
        // Task B
        Thread threadB = new TaskThread("Task B");
        
        // Task C
        Thread threadC = new TaskThread("Task C");

        try {
            // Start threads sequentially
            threadA.start();
            threadA.join(); // Wait for threadA to finish before starting threadB
            
            threadB.start();
            threadB.join(); // Wait for threadB to finish before starting threadC
            
            threadC.start();
            threadC.join(); // Wait for threadC to finish before continuing with main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread task
        System.out.println("Main thread is executing");
        // Main thread logic here
    }
}

class TaskThread extends Thread {
    private String taskName;

    public TaskThread(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(taskName + " is executing");
        // Task logic here
    }
}
