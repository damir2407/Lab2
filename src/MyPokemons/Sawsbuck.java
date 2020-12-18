package MyPokemons;

import PokemonsAttacks.DoubleEdge;
import PokemonsAttacks.Megahorn;
import PokemonsAttacks.SandAttack;
import PokemonsAttacks.Tackle;
import ru.ifmo.se.pokemon.Type;

public class Sawsbuck extends Deerling{
    public Sawsbuck(String name,int lvl){
        super(name,lvl);
        setType(Type.NORMAL,Type.GRASS);
        setStats(80,100,70,60,70,95);
        setMove(new DoubleEdge(),new Tackle(),new SandAttack(),new Megahorn());
    }
}
