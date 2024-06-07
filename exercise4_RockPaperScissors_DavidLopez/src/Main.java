
public class Main {

    public static void main(String[] args) {
        String[][] possibleplays = {
                {"Rock", "Scissors"},
                {"Scissors", "Rock"},
                {"Paper", "Scissors"}
        };
        String result = winner(possibleplays);

        System.out.println("Result: " + result);
    }

    public static String winner(String[][] possibleplays) {
        int playerscore1 = 0;
        int playerscore2 = 0;

        for (String[] move : possibleplays) {
            String player1 = move[0];
            String player2 = move[1];

            if (player1.equals(player2)) {

            } else if (ganaJugador1(player1, player2)) {
                playerscore1++;
            } else {
                playerscore2++;
            }
        }

        if (playerscore1 > playerscore2) {
            return "Player 1";
        } else if (playerscore2 > playerscore1) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }

    public static boolean ganaJugador1(String jugador1, String jugador2) {
        return (jugador1.equals("R") && jugador2.equals("S")) ||
                (jugador1.equals("S") && jugador2.equals("P")) ||
                (jugador1.equals("P") && jugador2.equals("R"));
    }
}