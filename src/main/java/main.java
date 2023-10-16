import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        DadJokes dadJokes = new DadJokes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Print all jokes");
            System.out.println("2. Print random joke");
            System.out.println("3. Print specific joke");
            System.out.println("4. Print joke count");
            System.out.println("5. Add a new joke");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    dadJokes.printAllJokes();
                    break;
                case 2:
                    dadJokes.printRandomJoke();
                    break;
                case 3:
                    System.out.print("There are " + dadJokes.getJokeCount() + " jokes. Enter joke number: ");
                    int index = scanner.nextInt();
                    dadJokes.printJoke(index);
                    break;
                case 4:
                    dadJokes.printJokeCount();
                    break;
                case 5:
                    System.out.println("Enter the joke question: ");
                    scanner.nextLine();
                    String question = scanner.nextLine();
                    System.out.println("Enter the joke punchline: ");
                    String punchline = scanner.nextLine();
                    dadJokes.addJoke(question, punchline);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
