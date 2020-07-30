// делаем команды  из Существ
public class Team {
     String teamName;

     Rival[] teamMembers = new Rival[4];

    public Team(String teamName, Rival[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Названи: "+teamName;
    }
    public Rival[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for(Rival c: teamMembers){
            c.showResult();
        }
    }

    public void showMembersFinishedCourse(){
        for(Rival c: teamMembers){
            if(c.isOnDistance())
               c.showResult();
        }
    }
}
