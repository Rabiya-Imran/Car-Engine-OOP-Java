public class Engine {
    private boolean isRunning = false;

    public void StartEngine() {

        if (!isRunning) {
            isRunning = true;
            System.out.println("Engine Started");
        } else
            System.out.println("Engine is already running...");
    }

    public void stop(){
        if(isRunning){
            isRunning=false;
            System.out.println("Engine Stoped");
        }else
        System.out.println("Engine is already stopped");
    }
 public boolean isEngineRunning(){
    return isRunning;
 }
}
