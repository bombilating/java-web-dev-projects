package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String text(){
        String html =
                "<html>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                        "<ol>" +
                            "<li> Java </li>" +
                            "<li> Javascript </li>" +
                            "<li> Python </li>" +
                        "</ol>" +
                "</html>";
        return html;
    }

    @RequestMapping(value="formSubmit", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String formSubmit(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage){
        String html =
                "<html>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + firstLanguage + "</li>" +
                            "<li>" + secondLanguage + "</li>" +
                            "<li>" + thirdLanguage + "</li>" +
                        "</ol>" +
                "</html>";

        return html;
    }
    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        String html =
                "<html>" +
                        "<body>" +
                            "<form action='formSubmit' method='post>" +
                                "<label for='name'> Name: </label><br>" +
                                "<input type = 'text' id='name' name = 'name' />" +
                                "<input type = 'submit' value = 'Submit' /><br>" +
                                "<label for='firstLanguage'> My favorite language: </label><br>" +
                                "<select name='firstLanguage' id ='firstLanguage'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select><br>" +
                                "<label for='secondLanguage'> My second favorite language: </label><br>" +
                                "<select name='secondLanguage' id ='secondLanguage'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select><br>" +
                                "<label for='thirdLanguage'> My third favorite language: </label><br>" +
                                "<select name='thirdLanguage' id ='thirdLanguage'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                                "<input type = 'submit' value = 'Submit'/>" +
                        "</form>" +
                        "</body>" +
                "</html>";
        return html;
    }

}
