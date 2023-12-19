public class Main {
    public static void main(String[] args) {
        // Создание персонажей с помощью фабрики
        Character character1 = CharacterFactory.createCharacter("Human", "Стив");
        Character character2 = CharacterFactory.createCharacter("Elf", "Леголас");
        Character character3 = CharacterFactory.createCharacter("Ogre", "Гром");
        Character character4 = CharacterFactory.createCharacter("Mage", "Гендельф");

        // Атака персонажей
        character1.attack(); // Характеристики Людей + атака мечом
        character2.attack(); // Характеристики Эльфов + атака луком
        character3.attack(); // Характеристики Огров + атака палицей
        character4.attack(); // Характеристики Магов + атака огненным шаром
    }
}