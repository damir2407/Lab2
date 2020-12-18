package MyPokemons;

import PokemonsAttacks.EnergyBall;
import PokemonsAttacks.PlayNice;
import PokemonsAttacks.RazorLeaf;
import ru.ifmo.se.pokemon.Type;

public class Steenee extends Bounsweet {
    public Steenee(String name, int lvl) {
        super(name, lvl);
        setStats(52, 40, 48, 40, 48, 62);
        setType(Type.GRASS);
        setMove(new RazorLeaf(),new EnergyBall(),new PlayNice());
    }

}
