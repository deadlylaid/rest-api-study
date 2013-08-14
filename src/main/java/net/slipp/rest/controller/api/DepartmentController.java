package net.slipp.rest.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: ihoneymon
 * Date: 13. 7. 22
 */
@Controller
@RequestMapping("/departments")
public class DepartmentController {

    @RequestMapping(method = RequestMethod.GET)
    public String departments() {
        return "departments";
    }
}
