package nz.ac.canterbury.seng302.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LogoutController {

    // TODO: This is not working, and I have no idea why. More research required.
    @GetMapping("/logout")
    public String logout(RedirectAttributes redirectAttributes) {
        System.out.println("SHOULD BE DOING SOMETHING?");
        redirectAttributes.addFlashAttribute("message", "Successfully logged out.");
        return "redirect:/greeting";
    }
    /*
    @RequestMapping(value = "/logout", method = RequestMethod.GET)//{RequestMethod.GET, RequestMethod.POST})
    public String logout(RedirectAttributes redirectAttributes) {
    */
}
