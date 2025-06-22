public class Student extends Person {
    private String favoriteSubject;

    public void setFavoriteSubject(String value) {
        this.favoriteSubject = value;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    @Override
    public void getPersonalInfo() {
        System.out.println("name: " + getName() + " age: " + getAge() + " favoriteSubject: " + favoriteSubject);
    }

}
