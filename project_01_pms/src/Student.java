
public class Student extends Parent {
    private String name;
    private int age;
    String uuid;
    private String email;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        if (uuid.startsWith("mppl")) {
            this.uuid = uuid;
            System.out.println("cool...");
        } else {
            System.out.println("error...");
        }
    }

    public void setAge(int age) {
         if (age>0 && age<125){
            this.age = age;
            System.out.println("cool...");
        }else {
             System.out.println("error...");

         }
    }

    public int getAge() {
        return age;
    }

    public Student(String uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public Student(String uuid) {
        this("111", "No-Name");
    }

    public Student() {

    }

    public String getName() {
        return this.name;
    }

}
