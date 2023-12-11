public class Human {
    public static void main(String[] args) {
        Human human = new Human("My secret", "Latest news", "Life experience", "Juicy gossip");

        System.out.println("Secret: " + human.getSecret());
        System.out.println("News: " + human.getNews());
        System.out.println("Experience: " + human.getExperience());
        System.out.println("Gossip: " + human.getGossip());
    }
    private final String secret;
    private final String news;
    private final String experience;
    private final String gossip;

    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }

    public String getSecret() {
        return secret;
    }

    public String getNews() {
        return news;
    }

    public String getExperience() {
        return experience;
    }

    public String getGossip() {
        return gossip;
    }
}
