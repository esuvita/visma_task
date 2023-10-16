import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DadJokes {
    private ArrayList<Joke> jokes;
    private Random random;
    private List<String> inappropriateWords = Arrays.asList("shit", "fuck");

    public DadJokes() {
        this.jokes = new ArrayList<>();
        this.random = new Random();
        populateJokes();
    }

    private void populateJokes() {
        jokes.add(new Joke("Dad, did you get a haircut?", "No, I got them all cut!"));
        jokes.add(new Joke("How do you get a squirrel to like you?", "Act like a nut."));
        jokes.add(new Joke("Why don't eggs tell jokes?", "They'd crack each other up."));
        jokes.add(new Joke("What do you call someone with no body and nose?", "Nobody knows."));
        jokes.add(new Joke("Why couldn't the bicycle stand up by itself?", "It was two tired."));
        jokes.add(new Joke("What kind of shoes do ninjas wear?", "Sneakers!"));
        jokes.add(new Joke("How does a penguin build its house?", "Igloos it together."));
        jokes.add(new Joke("Why did the math book look so sad?", "Because of all of its problems!"));
        jokes.add(new Joke("How many tickles does it take to make an octopus laugh?", "Ten tickles."));
        jokes.add(new Joke("Did you hear about the guy who invented the knock-knock joke?", "He won the 'no-bell' prize."));
    }

    public int getJokeCount() {
        return jokes.size();
    }

    public void printAllJokes() {
        for (Joke joke : jokes) {
            System.out.println(joke.getQuestion() + " " + joke.getPunchline());
        }
    }

    public void printRandomJoke() {
        Joke joke = jokes.get(random.nextInt(jokes.size()));
        System.out.println(joke.getQuestion() + " " + joke.getPunchline());
    }

    public void printJoke(int index) {
        index--;
        if (index >= 0 && index < jokes.size()) {
            Joke joke = jokes.get(index);
            System.out.println(joke.getQuestion() + " " + joke.getPunchline());
        } else {
            System.out.println("Invalid joke number.");
        }
    }

    public void printJokeCount() {
        System.out.println("Total jokes: " + jokes.size());
    }

    public boolean containsInappropriateWords(String text) {
        for (String word : inappropriateWords) {
            if (text.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
    public void addJoke(String question, String punchline) {
        if (containsInappropriateWords(question) || containsInappropriateWords(punchline)) {
            System.out.println("The joke contains inappropriate words and cannot be added.");
        } else {
            jokes.add(new Joke(question, punchline));
        }
    }

}
