public class Joke {
    String question;
    String punchline;

    Joke(String question, String punchline) {
        this.question = question;
        this.punchline = punchline;
    }

    String getQuestion() {
        return this.question;
    }

    String getPunchline() {
        return this.punchline;
    }
}
