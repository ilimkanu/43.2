import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> students = new TreeMap<>();

        students.put( "Andrey", 2001);
        students.put( "Islam", 2002);
        students.put( "Azamat", 1998);
        students.put( "Aziret", 2000);
        students.put("Marat", 1996);

        System.out.println(students);
        System.out.println("--------------------------");
        System.out.println("Удаление студента из курса");
        students.remove("Aziret");
        System.out.println(students);
        System.out.println("--------------------------");
        System.out.println("Добавление нового ученика в курс");
        students.put("John", 2000);
        System.out.println(students);
        System.out.println("---------------------------");
        System.out.println("Группу распустили");
        students.clear();
        System.out.println(students);
    }
}
