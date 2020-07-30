//сборка  всего   в  великолемную  игру
public class RHCApp {

     public static void main(String[] args) {
         Rival[] competitors = {new Human("Дзюба"), new Cat("Гудрон"), new Robot("Вертер")};
            SportsObstacles[] obstacles = {new Treadmill(400), new Wall(3)};

         Team team = new Team("Бедолаги",competitors);
            System.out.println("СОЗДАЛ НОВУЮ КОМАНДУ");
            System.out.println(team.getTeamName());
            System.out.println("ФИЗКУЛЬТ ПРИВЕТ!!! Бедолаги");
              team.getMembers();
              team.showResults();

            // новый этап
            Stage stage = new Stage(obstacles);
            System.out.println("УЧАСТНИКИ ВЫШЛИ НА ЭТАП");
              stage.doIt(team);
            System.out.println(" РЕЗУЛЬТАТЫ Участников ");
              team.showResults();

            System.out.println("ЭТАП ЗАКОНЧЕН WINERRRRR ");
              team.showMembersFinishedCourse();
        }
}

