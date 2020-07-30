
public  class Wall extends SportsObstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public void doIt(Rival rival) {
        rival.jump(height);
    }
}
