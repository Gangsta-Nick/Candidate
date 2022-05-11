import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Candidate> candidates = new TreeSet<>(Comparator.comparing(Candidate::getRelevance, Comparator.reverseOrder())
                .thenComparing(Candidate::getRating, Comparator.reverseOrder()));
        candidates.add(new Candidate("Иванов Иван Иванович", "Муж", "24", 4, 5));
        candidates.add(new Candidate("Петров Иван Александрович", "Муж", "22", 4, 3));
        candidates.add(new Candidate("Максимов Иван Алексеевич", "Муж", "37", 3, 5));
        candidates.add(new Candidate("Максимов Григорий Александрович", "Муж", "34", 5, 4));
        System.out.println("ФИО, Релевантность резюме, Оценка на собеседовании");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.name + ", " + candidate.relevance + ", " + candidate.rating);
        }
    }
}