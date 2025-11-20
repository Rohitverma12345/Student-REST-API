package com.RVCoder.studentRESTAPIs.service;

import com.RVCoder.studentRESTAPIs.dto.AddStudentRequestDto;
import com.RVCoder.studentRESTAPIs.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getAllStudentsById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
