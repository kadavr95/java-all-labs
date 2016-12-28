/**
 * Created by Yaskovich Dmitry on 28/12/2016.
 */
public class Student {
    private int id;
    private String name;
    public Student(){
        this.id=0;
        this.name="unknown";
    }
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
