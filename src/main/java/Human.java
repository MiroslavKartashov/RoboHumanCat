
public class Human implements Rival {
     String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean onDistance;

    public boolean isOnDistance(){
        return onDistance;
    }
    public Human(  String name) {
        this.name = name;
        this.maxRunDistance = 100;
        this.maxJumpHeight = 2;
        this.onDistance = true;
    }
    @Override
    public void run(int distance){
        if (distance <= maxRunDistance){
            System.out.println(name + " " + " успешно справился с забегом");
        } else {
            System.out.println(name + " " + " не смог пробежать");
            onDistance = false;
        }
    }
    @Override
    public void jump(int height){
        if (height <= maxJumpHeight){
            System.out.println(name + " " + " это сделал!!");
        } else {
            System.out.println(name + " " + " не  Асилил");
            onDistance = false;
        }
    }
    @Override
    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }
}
