public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameExeption {
        if (name.length()>20){
            throw new IllegalNameExeption("Error. The length of the name cannot exceed 20 characters." +
                    "You entered: " + name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age<=0 || age >=100){
            throw new IllegalAgeExeption("Error. User`s age cannot be less than 0 or greater than 100."
                    + "You entered: " + age);
        }
        this.age = age;
    }
}
