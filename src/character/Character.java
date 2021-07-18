package character;

public class Character {

        private int maxhp;
        private int currenthp;
        private int maxmp;
        private int currentmp;
        private int strength;
        private int defence;
        private int agility;
        private int dexterity;
        private int magic;

    public Character(int strength, int defense, int maxhp, int currenthp, int maxmp, int currentmp) {
        this.maxhp = maxhp;
        this.currenthp = currenthp;
        this.maxmp = maxmp;
        this.currentmp = currentmp;
        this.strength = strength;
        this.defence = defense;
        this.agility = agility;
        this.dexterity = dexterity;
        this.magic = magic;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setmaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public int getCurrenthp() {
        return currenthp;
    }

    public void setCurrenthp(int currenthp) {
        this.currenthp = currenthp;
    }

    public int getMaxmp() {
        return maxmp;
    }

    public void setMaxmp(int maxmp) {
        this.maxmp = maxmp;
    }

    public int getCurrentmp() {
        return currentmp;
    }

    public void setCurrentmp(int currentmp) {
        this.currentmp = currentmp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    @Override
    public String toString() {
        return "Max HP" + maxhp + "\nCurrent HP" + currenthp + "\nMax MP" + maxmp + "\nCurrent MP" + currentmp + "\nStrength" + strength + "\nDefence" + defence + "\nAgility" + agility + "\nDexterity" + dexterity +"\nMagic" + magic;
    }
}





