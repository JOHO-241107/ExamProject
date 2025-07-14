import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero hero = new Hero("勇者", 100, "剣");
        Wizard wizard = new Wizard("魔法使い", 60, 20);
        Thief thief = new Thief("盗賊", 70);
        ArrayList<Character> party = new ArrayList<Character>();
        party.add(hero);
        party.add(wizard);
        party.add(thief);

        Matango matango = new Matango("お化けキノコ", 'A', 45);
        Goblin goblin = new Goblin("ゴブリン", 'A', 50);
        Slime slime = new Slime("スライム", 'A', 40);
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(matango);
        monsters.add(goblin);
        monsters.add(slime);

        System.out.println("---味方パーティー---");
        for(Character character : party) {
            character.showStatus();
        }

        System.out.println("---敵グループ---");
        for(Monster monster : monsters) {
            monster.showStatus();
        }

        System.out.println("味方の総攻撃！");
        for(Character character : party) {
            for(Monster monster : monsters) {
                character.attack(monster);
            }
        }
    }
}
