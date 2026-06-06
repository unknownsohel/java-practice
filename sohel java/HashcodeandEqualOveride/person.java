package HashcodeandEqualOveride;

public class person {
    private String name;
    private int age;
    private char gender;
    private int ssn;

    public person() {

    }

    public person(String name, int age, char gender, int ssn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + gender;
        result = prime * result + ssn;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        person other = (person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        if (gender != other.gender)
            return false;
        if (ssn != other.ssn)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "person [name=" + name + ", age=" + age + ", gender=" + gender + ", ssn=" + ssn + "]";
    }

    // @Override
    // public int hashCode() {
    // return Objects.hash(name, age, gender, ssn);
    // }

    // @Override
    // public boolean equals(Object o) {
    // if (this == o) {
    // return true;
    // }
    // if (o == null || (getClass() != o.getClass())) {
    // return false;
    // }
    // person person = (person) o;
    // return age == person.getAge() && gender == person.getGender() && ssn ==
    // person.getSsn()
    // && Objects.equals(name, person.getName());
    // }

}
