// Фабрика персонажей
class CharacterFactory {
    public static Character createCharacter(String characterType, String name) {
        switch (characterType) {
            case "Human":
                Character human = new Human(name);
                human.applyBuff(); // Применение бафа для Людей
                return human;
            case "Elf":
                Character elf = new Elf(name);
                elf.applyBuff(); // Применение бафа для Эльфов
                return elf;
            case "Ogre":
                Character ogre = new Ogre(name);
                ogre.applyBuff(); // Применение бафа для Огров
                return ogre;
            case "Mage":
                Character mage = new Mage(name);
                mage.applyBuff(); // Применение бафа для Магов
                return mage;
            default:
                throw new IllegalArgumentException("Invalid character type: " + characterType);
        }
    }
}