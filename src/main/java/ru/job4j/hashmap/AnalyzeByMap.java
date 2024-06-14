package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double result = 0;
        int totalSubjects = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                result += subject.score();
                totalSubjects++;
            }
        }
        return result / totalSubjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            result.add(new Label(pupil.name(), sum / pupils.size()));
        }
        return result;
    }

    private static HashMap<String, Integer> calculateSubjectScoreSums(List<Pupil> pupils) {
        HashMap<String, Integer> map = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = map.get(subject.name()) != null ? map.get(subject.name()) : 0;
                map.put(subject.name(), score + subject.score());
            }
        }
        return map;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        HashMap<String, Integer> map = calculateSubjectScoreSums(pupils);
        List<Label> averageLabels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            averageLabels.add(new Label(entry.getKey(), (double) entry.getValue() / pupils.size()));
        }
        return averageLabels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            result.add(new Label(pupil.name(), sum));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> map = calculateSubjectScoreSums(pupils);
        List<Label> averageLabels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            averageLabels.add(new Label(entry.getKey(), (double) entry.getValue()));
        }
        averageLabels.sort(Comparator.naturalOrder());
        return averageLabels.get(averageLabels.size() - 1);
    }
}