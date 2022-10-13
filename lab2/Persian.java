import ru.ifmo.se.pokemon.*;
public class Persian extends Meowth{
    public Persian(String name,int level){
        super(name,level);
        setStats(65,70,60,65,65,115);
        setType(Type.NORMAL);
        setMove(new Thunder(),new ThunderBolt(),new Screech(),new Swift());
    }
}
