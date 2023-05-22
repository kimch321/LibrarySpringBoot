package exam.springboot.jpa.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibraryController {


    @GetMapping("/list")
    public ModelAndView list(@RequestParam int cpg) {
        ModelAndView mv = new ModelAndView();

        /*mv.addObject("lblist", lbsrv.readList(cpg));
        mv.addObject("cpg",cpg);
        mv.addObject("stpg", ((cpg-1)/10)*10 + 1);*/
        /*mv.addObject("cntpg",lbsrv.countList());*/

        mv.setViewName("list");
        return mv;
    }
}
