public class DeckOfCards {

    public static void main(String[] args) {

        Card[] deck = new Card[52];
        DeckMethods.populateDeck(deck);
        DeckMethods.printDeck(deck);
        System.out.println("_________________________________");
        DeckMethods.shuffleDeck(deck);
        DeckMethods.printDeck(deck);
        System.out.println("_________________________________");

        // player arrays
        Card[] player1 = new Card[5];
        Card[] player2 = new Card[5];

        // creating variables to track number of cards dealt
        int playerOneShuffleCount = 0;
        int playerTwoShuffleCount = 0;

        // do while loop to alternate dealing as well as trap it with in range of the player arrays
        do {
            player1[playerOneShuffleCount] = DeckMethods.popCard(deck);
            playerOneShuffleCount++;
            player2[playerTwoShuffleCount] = DeckMethods.popCard(deck);
            playerTwoShuffleCount++;
        } while (playerOneShuffleCount < 5 && playerTwoShuffleCount < 5);

        //print out player arrays after shuffling
        DeckMethods.printDeck(player1);
        System.out.println("_________________________________");
        DeckMethods.printDeck(player2);
        System.out.println("_________________________________");

        //sorting and printing player hands
        playerOneAndTwoHandsSorted(player1);
        DeckMethods.printDeck(player1);
        System.out.println("_________________________________");
        playerOneAndTwoHandsSorted(player2);
        DeckMethods.printDeck(player2);
        System.out.println("_________________________________");
    }

    // bubble sorting method to get player one and two hands sorted
    // method based on example from class on SearchingAndSortingDogs
    private static void playerOneAndTwoHandsSorted(Card[] playersHandPassed)
    {
        int n = playersHandPassed.length;
        Card temp;

        for (int pass=1; pass < n; pass++)
        {  // count how many times
            // This next loop becomes shorter and shorter
            for (int i=0; i < n-pass; i++)
            {
                if (playersHandPassed[i].getValue() > playersHandPassed[i+1].getValue())
                {
                    // exchange elements
                    temp = playersHandPassed[i];
                    playersHandPassed[i] = playersHandPassed[i+1];
                    playersHandPassed[i+1] = temp;
                }
            }
        }
    }
}

