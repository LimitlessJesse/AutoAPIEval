public class ThreadGroup_3 {
    public static void main(String[] args) {
        ThreadGroup parentGroup = new ThreadGroup("ParentGroup");
        ThreadGroup childGroup = new ThreadGroup(parentGroup, "ChildGroup");
        
        Thread thread = new Thread(childGroup, () -> {
            System.out.println("Thread executing in child group");
            ThreadGroup currentGroup = (ThreadGroup) Thread.currentThread().getThreadGroup().getParent();
            System.out.println("Parent group name: " + currentGroup.getName());
        });
        
        thread.start();
    }
}
