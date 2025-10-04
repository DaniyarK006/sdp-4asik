import bridge.Renderer;
import bridge.Resume;

import java.awt.print.Book;

// Demonstration of the Bridge pattern
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bridge Pattern ===\n");

        // Create different pattern
        Renderer htmlRenderer = new Renderer.HtmlRenderer();
        Renderer markdownRenderer = new Renderer.MarkdownRenderer();
        Renderer plainTextRenderer = new Renderer.PlainTextRenderer();

        // Creating an article with HTML rendering
        System.out.println("--- Article in HTML ---");
        Article article = new Article(
                htmlRenderer,
                "Design Patterns in Java",
                "Daniyar Kair",
                "Design patterns are reusable solutions to common software design problems"
        );
        article.render();

        // Changing the renderer to Markdown
        System.out.println("\n--- Same Article in Markdown ---");
        article.setRenderer(markdownRenderer);
        article.render();

        // Create a resume with Plain Text rendering
        System.out.println("\n--- Resume in Plain Text ---");
        Resume resume = new Resume(
                plainTextRenderer,
                "Daniyar Kair",
                "kairatov300100@example.com",
                "2 years in Software Development"
        );
        Object clone = resume.clone();

        // Changing the resume renderer to HTML
        System.out.println("\n--- Same Resume in HTML ---");
        resume.clone();
        resume.equals();

        // Create a book fot MarkdownRenderer
        System.out.println("\n--- Book in Markdown ---");
        Book book = new Book(
        );

        Object equals = book.equals();

        // Changing the book renderer to Plain Text
        System.out.println("\n--- Same Book in Plain Text ---");
        book.equals(plainTextRenderer);
        book.equals();

        System.out.println("\n=== End of Demo ===");
    }
}