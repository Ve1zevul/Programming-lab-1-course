import ru.ifmo.se.pokemon.*;
public class BattleArena {
    public static void main(String[] args) {
        Battle Field = new Battle();
        Field.addAlly(new Komala("", 1));
        Field.addAlly(new Meowth("", 1));
        Field.addAlly(new Hydreigon("", 1));
        Field.addFoe(new Deino("", 2));
        Field.addFoe(new Zweilous("", 2));
        Field.addFoe(new Persian("", 1));
        Field.go();
    }
}
