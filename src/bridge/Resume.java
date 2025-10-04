package bridge;
// Resume.java
// Refined Abstraction - extended abstraction for resume
public class Resume extends Document {
    private String name;
    private String email;
    private String experience;

    public Resume(Renderer renderer, String name, String email, String experience) {
        super(renderer);
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    @Override
    public void render() {
        Renderer renderer = null;
        renderer.renderTitle("Resume: " + name);
        renderer.renderText("Email: " + email);
        renderer.renderText("Experience: " + experience);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void equals() {
        this.name = this.name;
    }

    public Object clone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
