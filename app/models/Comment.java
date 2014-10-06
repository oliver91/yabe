package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Comment extends Model
{

    public String author;
    public Date postedAt;

    @Lob
    public String content;

    @ManyToOne
    public Post post;

    //конструктор
    public Comment(Post post, String author, String content)
    {
        this.post = post;
        this.author = author;
        this.content = content;
        this.postedAt = new Date();
    }

}