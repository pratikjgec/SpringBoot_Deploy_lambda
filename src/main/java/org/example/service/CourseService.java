package org.example.service;

import org.example.dto.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final List<Course> courses = new ArrayList<>();

    // Create a new course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Retrieve all courses
    public List<Course> getAllCourses() {
        return courses;
    }

  
}
