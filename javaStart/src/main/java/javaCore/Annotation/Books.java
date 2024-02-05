package javaCore.Annotation;

public class Books {
    private String name;
    private String author;
    @XMLAtribute(name = "book")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        AnnotationAnalizator annotationAnalizator = new AnnotationAnalizator();
        annotationAnalizator.analize(Books.class);
    }

}
