import com.google.gson.Gson;

public class Train {
    private static final Student Student = new Student("你好", "18");
    private static final Gson gson = new Gson();
    private static String jsondatatest = gson.toJson(Student);
    private static Student Newobject = new Student();

    //建json
    public static void main(String args[]) {
        System.out.println(jsondatatest);
        json(jsondatatest);
    }

    //解析
    public static void json(String a_json) {

        String json;
        json = a_json;
        Newobject = gson.fromJson(json, Student.getClass());
        System.out.println(Newobject.name + "\n" + Newobject.age);
    }
}
