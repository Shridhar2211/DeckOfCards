package cards;
public class deckofcard
{
	//class level variable declared
	static String[] suits = {"Diamond", "Heart", "Spades", "Club"};
	static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static  String[][] cardCombo = new String[4][13];
    //method is created for the initilisation of card
	public static void card(){ 
		//Initialsation of cards
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 13; j++) {
                cardCombo[i][j] = suits[i] + rank[j];
     }    
     }         
	   }     
	public static void main(String[] args)
	{
		//calling the method	
	       card(); 
	}
    }



