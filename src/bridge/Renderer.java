package bridge;
// Renderer.java
// Implementor interface - defines an interface for implementation
public interface Renderer {
    void renderTitle(String title);
    void renderText(String text);
    void renderImage(String image);
    void renderLink(String url, String text);

    // PlainTextRenderer.java
    // Concrete Implementor - specific implementation for Plain Text
    class PlainTextRenderer implements Renderer {

        @Override
        public void renderTitle(String title) {
            System.out.println("=== " + title + " ===");
        }

        @Override
        public void renderText(String text) {
            System.out.println(text);
        }

        @Override
        public void renderImage(String image) {
            System.out.println("[Image: " + image + "]");
        }

        @Override
        public void renderLink(String url, String text) {
            System.out.println(text + " (" + url + ")");
        }
    }

    // MarkdownRenderer.java
    // Concrete Implementor - specific implementation for Markdown
    class MarkdownRenderer implements Renderer {

        @Override
        public void renderTitle(String title) {
            System.out.println("# " + title);
        }

        @Override
        public void renderText(String text) {
            System.out.println(text);
        }

        @Override
        public void renderImage(String image) {
            System.out.println("![image](" + image + ")");
        }

        @Override
        public void renderLink(String url, String text) {
            System.out.println("[" + text + "](" + url + ")");
        }
    }

    // HtmlRenderer.java
    // Concrete Implementor - specific implementation for HTML
    class HtmlRenderer implements Renderer {

        @Override
        public void renderTitle(String title) {
            System.out.println("<h1>" + title + "</h1>");
        }

        @Override
        public void renderText(String text) {
            System.out.println("<p>" + text + "</p>");
        }

        @Override
        public void renderImage(String image) {
            System.out.println("<img src=\"" + image + "\" />");
        }

        @Override
        public void renderLink(String url, String text) {
            System.out.println("<a href=\"" + url + "\">" + text + "</a>");
        }
    }
}
