public class Home1 {




        public static void main(String[] args) {

            Сourse course1 = new Course(new Cross(300), new Wall(2),
                    new Cross(800), new Water(5));

            Team team1 = new Team("Team 1", new Human("Boris"), new Cat("Barsik"),
                    new Dog("Bobik"), new Dog("Sharik"));

            Team team2 = new Team("Team 2", new Human("Julia"), new Cat("Wasja"),
                    new Dog("Tom"), new Dog("Chip"));


            course1.doIt(team1);
            course1.doIt(team2);

            System.out.println("\n===== RESULTS =====\n");
            team1.showResults();
            System.out.println();
            team2.showResults();
        }


}








