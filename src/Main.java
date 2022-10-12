import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {



        List<ACardInDeck> cards = new ArrayList();

        for(int i = 2; i < 15; i ++){
            ACardInDeck spades = new ACardInDeck("spades", i);
            ACardInDeck klover = new ACardInDeck("klover", i);
            ACardInDeck diamonds = new ACardInDeck("diamonds", i);
            ACardInDeck heart = new ACardInDeck("heart", i);

            cards.add(spades);
            cards.add(klover);
            cards.add(diamonds);
            cards.add(heart);

            //spades.equals(klover);


        }
        System.out.println(cards);
        Collections.sort(cards, new Comparator<ACardInDeck>() {
            @Override
            public int compare (ACardInDeck card1, ACardInDeck card2) {
                if(card1.equals(card2)){
                    return 0;
                }
                if  (card1.value > card2.value) {
                    return 1;

                }
                if(card1.value < card2.value){
                    return -1;
                }
                return 13;

            }
        });
        System.out.println(cards);

    }


}
