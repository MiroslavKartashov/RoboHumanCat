// формируем  этап
public class Stage {

    SportsObstacles[] obstacles;

    public Stage(SportsObstacles[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Rival[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Rival c: teamMembers){
                for (SportsObstacles o: obstacles){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("Ты сколько ? 100 раз а они?   - А они не пришли Sorry нет никто  !");
        }
    }
}

