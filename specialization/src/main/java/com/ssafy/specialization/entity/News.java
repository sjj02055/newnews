package com.ssafy.specialization.entity;

import com.ssafy.specialization.entity.dtype.Economy;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class News {

    @Column(name = "news_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String content;
    private LocalDateTime newsDate;
    private String reporter;
    private String press;
    private String category;

    @OneToMany(mappedBy = "news", cascade = CascadeType.ALL)
    private List<NewsImage> newsImageList = new ArrayList<>();

    protected void setTitle(String title) {
        this.title = title;
    }

    protected void setContent(String content) {
        this.content = content;
    }

    protected void setNewsDate(LocalDateTime newsDate) {
        this.newsDate = newsDate;
    }

    protected void setReporter(String reporter) {
        this.reporter = reporter;
    }

    protected void setPress(String press) {
        this.press = press;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static News createEconomy(String title, String content, LocalDateTime newsDate, String reporter, String press, String category, NewsImage... newsImages) {
        News news = new News();
        news.setTitle(title);
        news.setContent(content);
        news.setPress(press);
        news.setReporter(reporter);
        news.setNewsDate(newsDate);
        news.setCategory(category);
        for (NewsImage newsImage : newsImages) {
            news.addNewsImage(newsImage);
        }
        return news;
    }

    protected void addNewsImage(NewsImage newsImage) {
        this.newsImageList.add(newsImage);
        newsImage.setNews(this);
    }

}
