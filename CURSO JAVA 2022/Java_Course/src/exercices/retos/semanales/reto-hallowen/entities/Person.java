package entities;

public class Person {

    private String name;
    private Integer age;
    private Double heigth;

    public Person(String name, Integer age, Double heigth) {
        this.name = name;
        this.age = age;
        this.heigth = heigth;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Integer return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return Double return the heigth
     */
    public Double getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

}