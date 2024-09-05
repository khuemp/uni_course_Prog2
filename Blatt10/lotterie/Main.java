package lotterie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static ArrayList<Person> participants;

    public static void main(String[] args) {
        if (args.length == 1) {
            participants = new ArrayList<Person>();

            try {
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                String line = br.readLine();

                while (line != null) {
                    parseLine(line);
                    line = br.readLine();
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Cannot read the file!");
            }
        } else {
            System.out.println(("Please enter the file whoch should be read as command line argument!"));
        }

        calculateRankingCollection();
        calculatedMinMaxAverage();
    }

    public static void parseLine(String line) {
        String[] person = line.split(",");
        if (person.length < 4) {
            System.out.println("Wrong input in file");
            return;
        }
        participants.add(new Person(person[0], person[1], person[2], Integer.parseInt(person[3])));
    }

    private static void calculatedMinMaxAverage() {
        if (participants.size() > 0) {
            Person min = participants.get(0);
            Person max = participants.get(0);

            int totalPoints = 0;

            for (Person current : participants) {
                if (current.getPoints() < min.getPoints()) {
                    min = current;
                }
                if (current.getPoints() > max.getPoints()) {
                    max = current;
                }
                totalPoints += current.getPoints();
            }

            double average = (double) totalPoints / participants.size();

            System.out.println("Average points is: " + average);
            System.out.println("Maximal points: " + max.toString());
            System.out.println("Minimal points: " + min.toString());
        }
    }

    private static void calculateRankingCollection() {
        Collections.sort(participants, new PersonComparator());
        for (Person current : participants) {
            System.out.println(current.toString());
        }
    }
}