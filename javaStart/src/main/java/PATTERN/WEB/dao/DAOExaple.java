package PATTERN.WEB.dao;

public class DAOExaple {
    static  Data data = new FileSystem(); // суть здесь, что не надо переделывать миллион строк , а достаточно заменить FileSystem
    public static void main(String[] args) {
        System.out.println(data.getData());

    }
}
interface Data{
    String getData();
}
class Db implements Data {
    String getFromTable(){
        return "data from db";
    }

    @Override
    public String getData() {
        return getFromTable();
    }
}

class FileSystem implements Data{
    String getDAtaFromFs(){
        return "data from fs";
    }
    @Override
    public String getData() {
        return getDAtaFromFs();
    }
}

