package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

    
        Saxophone saxophone = new Saxophone();
        saxophone.play();


        Playable playable1 = veena;
        Playable playable2 = saxophone;
        
        playable1.play();
        playable2.play();
    }
}
