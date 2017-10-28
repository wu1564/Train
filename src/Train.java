import com.google.gson.Gson;

public class Train {
    private static Student Student = new Student("你好", "18");
    private static Gson gson = new Gson();
    private static String a_json = gson.toJson(Student);

    //建json
    public static void main(String args[]) {
        System.out.println(a_json);
        json(a_json);
    }

    //解析
    public static void json(String a_json) {
        String json;
        json = a_json;
        Student = gson.fromJson(json, Student.class);
        System.out.println(Student.name + "\n" + Student.age);
    }
}
