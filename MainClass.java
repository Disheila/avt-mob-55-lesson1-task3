public class MainClass {

    private String class_string() {
        String class_string = "Hello, world";
        return class_string;
    }

    public String getClassString(){
        this.class_string();
        return class_string();

    }
}
