import java.util.Comparator;
import java.util.Objects;

public class ACardInDeck {

    private String color;
    int value;



    public ACardInDeck(String color, int value){
        this.color = color;
        this.value = value;
    }


    public String toString() {
        return color + value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ACardInDeck that = (ACardInDeck) o;
        return value == that.value && color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, value);
    }
    public int compare(Object obj1, Object obj2){
        if(obj1.equals(obj2)){
            return 0;
        }
        ACardInDeck card1 = (ACardInDeck) obj1;
        ACardInDeck card2 = (ACardInDeck) obj2;

        if  (card1.value > card2.value) {
            return 1;
            
        }
        if(card1.value < card2.value){
            return -1;
        }
        return 13;
    }

}
