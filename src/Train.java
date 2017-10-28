import com.google.gson.Gson;

public class Train {
    private static final Student STUDENT = new Student("你好", "18");
    private static final Gson GSON = new Gson();
    private static Student Newstudent = new Student();

    //建json
    public static void main(String args[]) {
        String jsondatatest = GSON.toJson(STUDENT);
        System.out.println(jsondatatest);
        json(jsondatatest);
    }

    //解析
    public static void json(String jsondatatest) {
        String json;
        json = jsondatatest;
        Newstudent = GSON.fromJson(json, STUDENT.getClass());
        System.out.println(Newstudent.name + "\n" + Newstudent.age);
    }
}
