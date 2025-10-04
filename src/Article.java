import bridge.Document;
import bridge.Renderer;

// Article.java
// Refined Abstraction - extended abstract for the article
public class Article extends Document {
    private String title;
    private String author;
    private String content;

    public Article(Renderer renderer, String title, String author, String content) {
        super(renderer);
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    public void render() {
        Renderer renderer = null;
        renderer.renderTitle(title);
        renderer.renderText("Author: " + author);
        renderer.renderText(content);
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRenderer(Renderer markdownRenderer) {
    }
}