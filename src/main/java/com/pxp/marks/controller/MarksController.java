package com.pxp.marks.controller;

import com.pxp.marks.model.MarksArray;
import com.pxp.marks.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarksController {

    @Autowired
    private MarksService marksService;

    @RequestMapping(value = "marks/{rollno}", method = RequestMethod.GET)
    public MarksArray getMarks(@PathVariable int rollno){
        return new MarksArray(marksService.getMarks(rollno));
    }
}
