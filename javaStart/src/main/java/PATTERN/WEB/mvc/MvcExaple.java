package PATTERN.WEB.mvc;


public class MvcExaple {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}

class Controller{
    View view = new ConselViewer();
    ModelLayer modelLayer = new DBLayer();
    //ModelLayer modelLayer = new FileLayer();  //испозуем либо то либо , в этом и суть подхода , что быстро меняем слои

    void execute(){
        Student student = modelLayer.getStudent();
        view.showStudent(student);
    }
}
interface View{
    void showStudent(Student student);
}
class ConselViewer implements View{
    @Override
    public void showStudent(Student student) {
        System.out.println("Student name: " + student.getName() + " age " + student.getAge());
    }
}
class HtmlViewer implements View{ //cуть такая же как и с бд или файлом , сегодня в консоль а завтра куда угодно , а все это контролиирует котроллер
    @Override
    public void showStudent(Student student) {
        System.out.println("Student name: " + student.getName() + " age " + student.getAge());
    }
}
interface ModelLayer{
    Student getStudent();
}
class DBLayer implements ModelLayer{
    @Override
    public Student getStudent() {
        System.out.println("db");
        return new Student(); //здесь упращение , а так должно лезть в бд
    }
}
class FileLayer implements ModelLayer{
    @Override
    public Student getStudent() {
        System.out.println("file");
        return new Student(); //здесь упращение , а так должно лезть в бд
    }
}
class Student {
    String name =  "`Gosha";
    int age = 11;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
