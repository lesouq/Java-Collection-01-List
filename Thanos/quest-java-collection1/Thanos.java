import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        
            Hero blackWidow = new Hero("Black Widow", 34);
            Hero captainAmerica = new Hero("Captain America", 100);
            Hero vision = new Hero("Vision", 3);
            Hero ironMan = new Hero("Iron Man", 48);
            Hero scarletWitch = new Hero("Scarlet Witch", 29);
            Hero thor = new Hero("Thor", 1500);
            Hero spiderMan = new Hero("Spider-Man", 18);
            Hero hulk = new Hero("Hulk", 49);
            Hero doctorStrange = new Hero("Doctor Strange", 42);    
        
            ArrayList<Hero> heroes = new ArrayList<>();
            heroes.add(blackWidow);           //index 0
            heroes.add(captainAmerica);       //index 1
            heroes.add(vision);               //index 2
            heroes.add(ironMan);              //index 3
            heroes.add(scarletWitch);         //index 4
            heroes.add(thor);                 //index 5
            heroes.add(spiderMan);            //index 6
            heroes.add(hulk);                 //index 7
            heroes.add(doctorStrange);        //index 8

            thor.setAge(1501);
                System.out.println("It's Thor's birthday, now he's" + thor.getAge());

            Collections.shuffle(heroes);
                System.out.println("After the snap's Thanos, heroes remaining:");

            List<Hero> heroesRemaining = heroes.subList(0, (int)(heroes.size()/2));
            
            for(int i = 0; i < heroesRemaining.size(); i++){
                System.out.println(heroesRemaining.get(i).getName());
            }
    }
}
