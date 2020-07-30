// отсюда берем для всех кто не человек  ..
  public class NotHuman implements Rival  {
    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    boolean onDistance;

      @Override
      public void run(int distance) {
          if (distance <= maxRunDistance) {
              System.out.println(type + " " + name + " " + " успешно справился с забегом");
          } else {
              System.out.println(type + " " + name + " " + " не смог преодолеть забегом");
              onDistance = false;
          }
      }
      @Override
      public void jump(int height) {
          if (height <= maxJumpHeight) {
              System.out.println(type + " " + name + " " + " успешно справился с препятствием");
          } else {
              System.out.println(type + " " + name + " " + " не смог преодолеть препятствие");
              onDistance = false;
          }

      }

      @Override
      public void showResult(){
          System.out.println(type + " " + name + ": " + onDistance);
      }

      public NotHuman(String type, String name, int maxRunDistance, int maxJumpHeight) {
          this.type = type;
          this.name = name;
          this.maxRunDistance = maxRunDistance;
          this.maxJumpHeight = maxJumpHeight;
          this.onDistance = true;
      }

       public boolean isOnDistance(){
         return onDistance;
    }
}
