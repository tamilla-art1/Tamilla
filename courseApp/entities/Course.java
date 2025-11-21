package courseApp.entities;

public class Course {
    private String name;
    private String teacher;
    private String description;
    private  int id;

    public int getId() {
        return id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course(int id,String name,String teacher,String description) {
        this.id=id;
        this.name = name;
        this.teacher=teacher;
        this.description=description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}
