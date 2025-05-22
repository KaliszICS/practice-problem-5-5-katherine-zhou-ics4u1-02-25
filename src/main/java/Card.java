import java.util.HashMap;
import java.util.Map;

class Card implements Comparable<Card>{
    private String name;
    private String suit;

    private static final Map<String, Integer> NAME_ORDER = new HashMap<>();
    private static final Map<String, Integer> SUIT_ORDER = new HashMap<>();

    static{
        String[] names ={"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < names.length; i++){
            NAME_ORDER.put(names[i], i);
        }

        SUIT_ORDER.put("Hearts", 0);
        SUIT_ORDER.put("Clubs", 1);
        SUIT_ORDER.put("Diamonds", 2);
        SUIT_ORDER.put("Spades", 3);
    }

    public Card(String name, String suit){
        this.name = name;
        this.suit = suit;
    }

    public String getName(){
        return this.name;
    }

    public String getSuit(){
        return this.suit;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public String toString(){
        return this.name + " of " + this.suit;
    }

    public int compareTo(Card other){
        int nameCompare = Integer.compare(NAME_ORDER.get(this.name), NAME_ORDER.get(other.name));
        if (nameCompare != 0){
            return nameCompare;
        }
        return Integer.compare(SUIT_ORDER.get(this.suit), SUIT_ORDER.get(other.suit));
    }
}
