package Entity;

public class User {
    private int idUser;
    private String name;
    private boolean likesMusic = false;
    private boolean likesSports = false;
    private boolean likesToDrink = false;
    private boolean likesToParty = false;
    private boolean likesToRead = false;
    private boolean likesToTravel = false;

    public int getIdUser() { return idUser; }

    public void setIdUser(int idUser) { this.idUser = idUser; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public boolean isLikesMusic() {
        return likesMusic;
    }

    public void setLikesMusic(boolean likesMusic) {
        this.likesMusic = likesMusic;
    }

    public boolean isLikesSports() {
        return likesSports;
    }

    public void setLikesSports(boolean likesSports) {
        this.likesSports = likesSports;
    }

    public boolean isLikesToDrink() {
        return likesToDrink;
    }

    public void setLikesToDrink(boolean likesToDrink) {
        this.likesToDrink = likesToDrink;
    }

    public boolean isLikesToParty() {
        return likesToParty;
    }

    public void setLikesToParty(boolean likesToParty) {
        this.likesToParty = likesToParty;
    }

    public boolean isLikesToRead() {
        return likesToRead;
    }

    public void setLikesToRead(boolean likesToRead) {
        this.likesToRead = likesToRead;
    }

    public boolean isLikesToTravel() {
        return likesToTravel;
    }

    public void setLikesToTravel(boolean likesToTravel) {
        this.likesToTravel = likesToTravel;
    }
}
