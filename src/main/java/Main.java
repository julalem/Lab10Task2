package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (JsonReader jsonReader = new JsonReader(new FileReader("src/main/resources/package.json"))) {
            Type listType = new TypeToken<ArrayList<org.example.Student>>() {
            }.getType();
            List<org.example.Student> students = gson.fromJson(jsonReader, listType);

            org.example.Student topStudent = null;
            double highestAverage = 0;

            for (org.example.Student student : students) {
                double average = student.calculateAverageGrade();
                System.out.println("Student: " + student.getName() + ", Average Grade: " + average);

                if (average > highestAverage) {
                    highestAverage = average;
                    topStudent = student;
                }
            }
            if (topStudent != null) {
                System.out.println("Student with the highest average grade: " + topStudent.getName() +
                        " with an average grade of " + highestAverage);
            }
        }
    }
}