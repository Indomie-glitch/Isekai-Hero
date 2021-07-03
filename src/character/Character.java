package character;

public class Character {

        private final String name;
        private final String race;
        private final int level;
        private final int xp;
        private final String weapon;
        private final int health;
        private final int attack;


        public Character(String name, String race, int level, int xp, String weapon, int health, int attack) {
            this.name = name;
            this.race = race;
            this.level = level;
            this.xp = xp;
            this.weapon = weapon;
            this.health = health;
            this.attack = attack;

        }
        public String getName() {
            return name;
        }

        public String getRace() {
            return race;
        }

        public int getLevel() {
            return level;
        }
        public int getXp() {
            return xp;
        }
    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

        @Override
        public String toString() {
            return "Name:" + name + "\nRace:" + race + "\nLevel:" + level + "\nXP:" + xp + "\nWeapons:" + weapon + "\nHealth:" + health + "\nAttack:" + attack;
        }

    }





