import ru.ifmo.se.pokemon.*;
public class Zweilous extends Deino {
    public Zweilous(String name,int level){
        super(name,level);
        setStats(72,85,70,65,70,58);
        setType(Type.DARK,Type.DRAGON);
        setMove(new Rest(),new DragonRush(),new DoubleHit());
    }
}
