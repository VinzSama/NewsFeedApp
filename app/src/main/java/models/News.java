package models;

/**
 * Created by Maouusama on 2/7/2017.
 */

public class News {
    private String Title, Description, Time, Url;

    public News(String time, String description, String title, String Url) {
        Time = time;
        Description = description;
        Title = title;
        Url = Url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
