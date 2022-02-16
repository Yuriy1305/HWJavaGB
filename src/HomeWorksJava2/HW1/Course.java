package HomeWorksJava2.HW1;

//        3. Добавить класс Course (полоса препятствий), в котором будут находиться:
//        массив препятствий;
//        метод, который будет просить команду пройти всю полосу.

import java.util.Random;

public class Course {

    public String doIt(Team team) {
// препятствия/встречи случайные:
        Random random = new Random();
        String granddaughterWith = team.membersTeam[random.nextInt(team.membersTeam.length - 1)];
//        System.out.println("Внучка с " + granddaughterWith);
        String catWith = team.membersTeam[random.nextInt(team.membersTeam.length - 1)];
//        System.out.println("Кошка с " + catWith);
        String dogWith = team.membersTeam[random.nextInt(team.membersTeam.length - 1)];
//        System.out.println("Жучка с " + dogWith);
        String mouseWith = team.membersTeam[random.nextInt(team.membersTeam.length - 1)];
//        System.out.println("Мышка  с " + mouseWith);
// но определим критичные, пока без ранжирования скоростей пар:
        if (catWith.equals("Жучка") || dogWith.equals("Кошка")) {
            return "Жучка погналась за Кошкой и загнала ее на дерево. А в это время Внучка обогнала Мышку и первой добралась до репки!";
        }
        else if (catWith.equals("Мышка") || mouseWith.equals("Кошка")) {
            return "Кошкой поймала Мышку и съела, кровожадная! А в это время Жучка обогнала Внучку и первой добралась до репки! Но зачем она ей?!";
        }
// все живы и здоровы - только скорость играет роль:
        else {
            return "Кошка c Мышкой или с Жучкой не встретилась. Поэтому быстрая Жучка обогнала всех и первой добралась до репки! Но зачем она ей?!";
        }
//          return "Все ушли бороться с короновирусом. Победила дружба!";
    }
}