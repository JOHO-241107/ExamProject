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

        System.out.println("---味方パーティ---");
        for(Character character : party) {
            character.showStatus();
        }

        System.out.println("---敵グループ---");
        for(Monster monster : monsters) {
            monster.showStatus();
        }

        System.out.println("\n味方の総攻撃！");
        for(Character character : party) {
            for(Monster monster : monsters) {
                character.attack(monster);
            }
        }
        System.out.println("\n敵の総攻撃！");
        for(Monster monster : monsters) {
            for(Character character : party) {
                monster.attack(character);
            }
        }

        System.out.println("\nダメージを受けた勇者が突然光だした！");
        System.out.println("勇者はスーパーヒーローに進化した！");
        SuperHero superHero = new SuperHero(hero);
        party.set(0, superHero);
        for(Monster monster : monsters) {
            party.get(0).attack(monster);
        }

        System.out.println("\n---味方パーティ最終ステータス---");
        for(Character character : party) {
            character.showStatus();
            System.out.print("生存状況：");
            if(character.isAlive()){
                System.out.println("生存");
            }else{
                System.out.println("戦闘不能");
            }
        }
        System.out.println("\n---敵グループ最終ステータス---");
        for(Monster monster : monsters) {
            monster.showStatus();
            System.out.print("生存状況：");
            if(monster.isAlive()){
                System.out.println("生存");
            }else{
                System.out.println("討伐済み");
            }
        }
    }
}
