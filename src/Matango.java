public class Matango extends Monster{
    public Matango(String name, char suffix, int hp){
        super(name, suffix, hp);
    }

    public void attack(Creature target){
        System.out.println(getName() + getSuffix() + "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた！");
        target.setHp(target.getHp() - 6);
    }
}
