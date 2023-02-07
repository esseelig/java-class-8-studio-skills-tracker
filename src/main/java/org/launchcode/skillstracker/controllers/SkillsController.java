package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String getHomePageContent() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol><li>Java</li><li>JavaScript</li><li>C#</li></ol>";
    }

    //TODO: At localhost:8080/form, add a form that lets the user enter their name and choose their favorite, second favorite, and third favorite programming languages on your list. Use select elements for each of the rankings. Just as with the exercises, we will use @GetMapping().

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<table>" +
                "<tbody>" +
                "<form action='results'>" +
                "<tr>" +
                "<td>Name:</td>" +
//                "Name:<br />" +
        "<td><input type='text' name='name'></td>" +
                "</tr>" +

                "<tr>" +
//        "<input type='text' name='name'><br />" +
                "<td>My favorite language:</td>" +
//                "My favorite language:<br />" +
                "<td><select name='firstFavorite'>" +
                "<option value=''> </option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C#'>C#</option></select><br />" +
                "</td>" +

                "<tr>" +
//        "<input type='text' name='name'><br />" +
                "<td>My second favorite language:</td>" +
//                "My favorite language:<br />" +
                "<td><select name='secondFavorite'>" +
                "<option value=''> </option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C#'>C#</option></select><br />" +
                "</td>" +

                "<tr>" +
//        "<input type='text' name='name'><br />" +
                "<td>My third favorite language:</td>" +
//                "My favorite language:<br />" +
                "<td><select name='thirdFavorite'>" +
                "<option value=''> </option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C#'>C#</option></select><br />" +
                "</td>" +




                "</tbody>" +
                "</table>" +
                "<br />" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

//TODO: Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with an h1 stating the user’s name and an ol showing the three programming languages in the order they chose.
@GetMapping("results")
@ResponseBody
public String results(@RequestParam String name, String firstFavorite, String secondFavorite, String thirdFavorite) {
    return "<h1>" + name + "</h1>" +
            "<ol><li>" +
            firstFavorite +
            "</li><li>" +
            secondFavorite +
            "</li><li>" +
            thirdFavorite +
            "</li></ol>";

}


}
