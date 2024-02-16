package house;
public class Human {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.news);
        System.out.println(human.experience);
        System.out.println(human.gossip);
        System.out.println(human.getNews());
        System.out.println(human.getExperience());
        System.out.println(human.getGossip());
    }
    private String secret;
    protected String news;
    String experience;
    public String gossip;

    private String getSecret() {
        return secret;
    }

    protected String getNews() {
        return news;
    }

    String getExperience() {
        return experience;
    }

    public String getGossip() {
        return gossip;
    }
}
