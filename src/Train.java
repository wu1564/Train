import com.google.gson.Gson;

public class Train {
    private static final Student STUDENT = new Student("你好", "18");
    private static final Gson GSON = new Gson();
    private static Student NewStudent = new Student();

    //建構json
    public static void main(String args[]) {
        String jsonDataTest = GSON.toJson(STUDENT);
        System.out.println(jsonDataTest);
        analyzeJson(jsonDataTest);
    }

    //解析json
    public static void analyzeJson(String jsonDataTest) {
        String json;
        json = jsonDataTest;
        NewStudent = GSON.fromJson(json, STUDENT.getClass());
        System.out.println(NewStudent.name + "\n" + NewStudent.age);
    }
}
