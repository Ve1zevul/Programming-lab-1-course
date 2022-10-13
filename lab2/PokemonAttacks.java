import ru.ifmo.se.pokemon.*;
class Rest extends StatusMove{
    protected Rest(){
        super(Type.PSYCHIC,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.restore();
        p.setCondition(e);
    }
}
class DoubleHit extends PhysicalMove{
    protected DoubleHit(){
        super(Type.NORMAL,35,90);
    }
}
class DragonRush extends PhysicalMove{
    protected DragonRush(){
        super(Type.DRAGON,100,75);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.2)
            Effect.flinch(p);
    }
}
class BodySlam extends PhysicalMove{
    protected BodySlam(){
        super(Type.NORMAL,85,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.3)
            Effect.paralyze(p);
    }
}
class Thunder extends SpecialMove{
    protected Thunder(){
        super(Type.ELECTRIC,110,70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.3)
            Effect.paralyze(p);
    }
}
class ThunderBolt extends SpecialMove{
    protected ThunderBolt(){
        super(Type.ELECTRIC,90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.1)
            Effect.paralyze(p);
    }
}
class Screech extends StatusMove{
    protected Screech(){
        super(Type.NORMAL,0,85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE,-1);
    }
}
class Swift extends SpecialMove{
    protected Swift(){
        super(Type.NORMAL,60,100);
    }
}
class PowerGem extends SpecialMove{
    protected PowerGem(){
        super(Type.ROCK,80,100);
    }
}
class RockSlide extends PhysicalMove{
    protected RockSlide(){
        super(Type.ROCK,75,90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.3)
            Effect.flinch(p);
    }
}
class CosmicPower extends StatusMove{
    protected CosmicPower(){
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE,1);
        p.setMod(Stat.SPECIAL_DEFENSE,1);
    }
}
class Tackle extends PhysicalMove{
    protected Tackle(){
        super(Type.NORMAL,40,100);
    }
}