package bean;

public class Parent {
    protected String name;

    public Parent() {
        name = "父亲";
    }

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
