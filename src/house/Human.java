package house;
public class Human {
    public static void main(String[] args) {
        Human person = new Human("My secret", "Latest news", "Great experience", "Interesting gossip");

        System.out.println("Secret: " + person.getSecret());
        System.out.println("News: " + person.getNews());
        System.out.println("Experience: " + person.getExperience());
        System.out.println("Gossip: " + person.getGossip());
    }

    private String secret;
    private String news;
    private String experience;
    private String gossip;

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