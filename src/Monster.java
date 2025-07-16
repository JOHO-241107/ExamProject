public abstract class Monster implements Creature {
    private String name;
    private int hp;
    private char suffix;

    public Monster(String name, char suffix, int hp) {
        setName(name);
        setSuffix(suffix);
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        setHp(hp);
    }

    public final boolean isAlive(){
        return this.hp > 0;
    }

    public void showStatus() {
        System.out.println(getName() + getSuffix() + "：HP" + getHp());
    }

    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        if(hp > 0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public char getSuffix() {
        return suffix;
    }
    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
}
