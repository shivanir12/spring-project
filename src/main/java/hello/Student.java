package hello;

import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    List<String> subjects;
    public Student(String name) {
        this.name = name;
        this.subjects = Arrays.asList("English", "Maths");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<String> getSubjects()
    {
        return subjects;
    }

    public void setSubjects(List<String> subjects)
    {
        this.subjects = subjects;
    }
}
