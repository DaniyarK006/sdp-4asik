package bridge;

abstract class Document {
    protected Renderer renderer;  // ABSTRACTION
    
    protected Document(Renderer renderer) {
        this.renderer = renderer;
    }
    
    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }
    
    public abstract void render();
}
