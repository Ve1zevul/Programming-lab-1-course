import ru.ifmo.se.pokemon.*;
public class Hydreigon extends Zweilous {
    public Hydreigon(String name,int level){
        super(name, level);
        setStats(92,105,90,125,90,98);
        setType(Type.DARK,Type.DRAGON);
        setMove(new Rest(),new DragonRush(),new DoubleHit(),new BodySlam());
    }
}
