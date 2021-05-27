package com.pxp.marks.service;

import com.pxp.marks.model.Marks;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarksService {

    public List<Marks> getMarks(int rollno){
        List<Marks> marksList = Arrays.asList(
                new Marks(1, "English", 30),
                new Marks(1, "Sanskrit", 32),
                new Marks(1, "Mathematics", 35),
                new Marks(1, "Physics", 34),
                new Marks(1, "Chemistry", 36),
                new Marks(1, "Biology", 37),
                new Marks(2, "English", 33),
                new Marks(2, "Economics", 30),
                new Marks(2, "Geography", 41),
                new Marks(2, "History", 40),
                new Marks(2, "Zoology", 39)
        );

        return marksList.stream().filter(m -> m.getRollno() == rollno).collect(Collectors.toList());
    }
}
