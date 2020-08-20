package be.vdab.chapter3;

public class Excercice_03_24 {

    static String[] cardNumberArray = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    static String[] cardColorArray = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public static void main(String[] args) {

        int cardNumber = cardNumber();
        int cardColor = cardColor();

        System.out.println("The card you picked is " + cardNumberArray[cardNumber] + " of " + cardColorArray[cardColor]);

    }

    public static int cardNumber() {
        int cardNumber = (int) (Math.random() * 100);
        while (cardNumber < 0 || cardNumber > cardNumberArray.length-1) {
            cardNumber = (int) (Math.random() * 100);
        }
        return cardNumber;
    }

    public static int cardColor() {
        int cardColor = (int) (Math.random() * 100);
        while (cardColor < 0 || cardColor > cardColorArray.length-1) {
            cardColor = (int) (Math.random() * 100);
        }
        return cardColor;
    }
}
