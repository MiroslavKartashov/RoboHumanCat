
public class Treadmill extends SportsObstacles{
    private int distance;

    public Treadmill(int distance) {
       this.distance = distance;
    }
    @Override
    public void doIt(Rival rival) {
         rival.run(distance);
    }
}
