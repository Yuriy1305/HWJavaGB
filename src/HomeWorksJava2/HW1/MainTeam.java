package HomeWorksJava2.HW1;

//        В итоге должно получиться похожее:
//      public static void main(String[] args) {
//        Course c = new Course(...); // Создаем полосу препятствий
//        Team team = new Team(...); // Создаем команду
//        c.doIt(team); // Просим команду пройти полосу
//        team.showResults(); // Показываем результаты
//        }
public class MainTeam {

    public static void main(String[] args) {
       Team team = new Team ();
       team.start(); // инфра о команде и игре
       Course obstacleCourse = new Course(); // Создаем полосу препятствий
       String s= obstacleCourse.doIt (team); // Просим команду пройти полосу
       team.showResults(s); // Показываем результаты
    }
}

