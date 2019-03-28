

public class Main {
  public static void main(String[] args) {
    Toyota car1 = new Camry();
    Toyota car2 = new Corolla();
    car1.make();
    car1.cost();
    car1.horsePower();
    car2.make();
    car2.cost();
    car2.horsePower();
  }
}
abstract class Toyota{
    public void make(){ System.out.println("The make is Toyota");}
    public abstract void cost();
    public abstract void horsePower();
}
class Camry extends Toyota{
@Override
public void cost(){
  System.out.println("Camry cost $24,875");
}
@Override
    public void horsePower(){
      System.out.println("Camry has 301hp");
    }
}
class Corolla extends Toyota{
@Override
public void cost(){
  System.out.println("Corolla cost $19,630");
}
@Override
    public void horsePower(){
      System.out.println("Corolla has 140 hp");
    }
}