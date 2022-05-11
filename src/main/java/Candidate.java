public class Candidate {
    protected String name;
    protected String sex;
    protected String age;
    protected Integer relevance;
    protected Integer rating;

    public Candidate(String name, String sex, String age, Integer relevance, Integer rating) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public void setRelevance(Integer relevance) {
        this.relevance = relevance;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + ", " + sex +
                ", " + age + " лет, релевантность резюме " + relevance +
                ", оценка на собеседовании " + rating;
    }
}
