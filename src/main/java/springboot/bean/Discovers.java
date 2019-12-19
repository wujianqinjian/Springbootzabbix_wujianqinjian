package springboot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "discovers")
public class Discovers {
    private String moments;
    private String scan;
    private String shake;
    private String topStories;
    private String search;
    private String peopleNearby;
    private String games;
    private String miniPrograms;

    @Override
    public String toString() {
        return "Discovers{" +
                "moments='" + moments + '\'' +
                ", scan='" + scan + '\'' +
                ", shake='" + shake + '\'' +
                ", topStories='" + topStories + '\'' +
                ", search='" + search + '\'' +
                ", peopleNearby='" + peopleNearby + '\'' +
                ", games='" + games + '\'' +
                ", miniPrograms='" + miniPrograms + '\'' +
                '}';
    }

    public String getMoments() {
        return moments;
    }

    public void setMoments(String moments) {
        this.moments = moments;
    }

    public String getScan() {
        return scan;
    }

    public void setScan(String scan) {
        this.scan = scan;
    }

    public String getShake() {
        return shake;
    }

    public void setShake(String shake) {
        this.shake = shake;
    }

    public String getTopStories() {
        return topStories;
    }

    public void setTopStories(String topStories) {
        this.topStories = topStories;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getPeopleNearby() {
        return peopleNearby;
    }

    public void setPeopleNearby(String peopleNearby) {
        this.peopleNearby = peopleNearby;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getMiniPrograms() {
        return miniPrograms;
    }

    public void setMiniPrograms(String miniPrograms) {
        this.miniPrograms = miniPrograms;
    }
}
