package bridge;
// Book.java
// Refined Abstraction - extended abstraction for the book
public class Book extends Document {
    private String title;
    private String author;
    private String coverImage;
    private String isbn;
    private String description;

    public Book(Renderer renderer, String title, String author,
                String coverImage, String isbn, String description) {
        super(renderer);
        this.title = title;
        this.author = author;
        this.coverImage = coverImage;
        this.isbn = isbn;
        this.description = description;
    }

    @Override
    public void render() {
        Renderer renderer = null;
        renderer.renderTitle(title);
        renderer.renderText("Author: " + author);
        renderer.renderImage(coverImage);
        renderer.renderText("ISBN: " + isbn);
        renderer.renderText(description);
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

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
