// Абстрактный класс персонажа
abstract class Character {
    String name;
    int health;

    abstract void attack();

    void applyBuff() {
        // Баф по умолчанию
        System.out.println(name + ": Применение баффа по умолчанию");
    }
}

// Класс Людей
class Human extends Character {
    public Human(String name) {
        this.name = name;
        health = 100;
    }

    @Override
    void attack() {
        System.out.println(name + ": Атака с помощью меча");
    }

    @Override
    void applyBuff() {
        // Дополнительный баф для Людей
        System.out.println(name + ": Использовал баф усиления");
    }
}

// Класс Эльфов
class Elf extends Character {
    public Elf(String name) {
        this.name = name;
        health = 80;
    }

    @Override
    void attack() {
        System.out.println(name + ": Атака с помощью лука");
    }

    @Override
    void applyBuff() {
        // Дополнительный баф для Эльфов
        System.out.println(name + ": Испоьзовал баф для увеличения ловкости");
    }
}
// Класс Огров
class Ogre extends Character {
    public Ogre(String name) {
        this.name = name;
        health = 150;
    }

    @Override
    void attack() {
        System.out.println(name + ": Атака палицей");
    }

    @Override
    void applyBuff() {
        // Дополнительный баф для Огров
        System.out.println(name + ": Использовал баф для увеличения защиты");
    }
}

// Класс Магов
class Mage extends Character {
    public Mage(String name) {
        this.name = name;
        health = 60;
    }

    @Override
    void attack() {
        System.out.println(name + ": Скастовал фаербол");
    }

    @Override
    void applyBuff() {
        // Дополнительный баф для Магов
        System.out.println(name + ": Использовал баф для увеличения силы заклинаний");
    }
}

