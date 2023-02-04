package edu.miu.homework10.controllers;


import edu.miu.homework10.models.Student;
import edu.miu.homework10.services.implementations.StudentService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Daniel Tsegay Meresie
 */
@Controller
public class PublicPagesController {
    @Autowired
    private StudentService studentService;
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping(value = "/")
    public String displayHomepage(){
        //return "public/index";
        return "/index";
    }
    @GetMapping(value = "/about")
    public String displayAboutpage(){
        //return "public/index";
        return "/about";
    }
    @GetMapping(value = "/students")
    public ModelAndView displayStudents(){
        var modelAndView = new ModelAndView();
        var students = studentService.getAllStudents();
        
        modelAndView.addObject("students", students);
        //modelAndView.addObject("currentPageNo", pageNo);
//        modelAndView.addObject("publishersCount", ((List)publishers).size());
        modelAndView.setViewName("/students");
        return modelAndView;
    }
    @PostMapping(value = "/students/add")
    public String addStudent(@Valid @ModelAttribute("student") Student student,
                       BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("student", student);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/addStudent";
        }
//        if(publisher.getPrimaryAddress() != null) {
//            var primaryAddr = publisher.getPrimaryAddress();
//            if(primaryAddr.getStreet().equals("")
//                && primaryAddr.getCity().equals("")
//                && primaryAddr.getState().equals("")
//                && primaryAddr.getZipCode().equals("")
//            ) {
//                publisher.setPrimaryAddress(null);
//            }
//        }
//        publisherService.savePublisher(publisher);
        studentService.addStudent(student);
        return "redirect:/students";
    }
    @GetMapping(value = {"/students/add"})
    public String displayaddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "/addStudent";
    }
    
}
