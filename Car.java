public class Car {
    private Engine engine = new Engine();

    public void carStart(){
        if(!engine.isEngineRunning()){
 engine.StartEngine();
        }else 
        System.out.println("Car is already started.");
    }

    public void carStop(){
        if(engine.isEngineRunning()){
            engine.stop();
        }else
        System.out.println("Car is already stopped.");
    }
    public void status() {
        System.out.println(engine.isEngineRunning());

    }

    public static void main(String[] args) {
        Car car = new Car();
      car.carStart();
      car.carStart();
      car.carStop();
      car.carStop();
      car.status();
    }
}
