package chang.thymeleaf0.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class themeleaf {
    @GetMapping("/eco")
    public String themeleaf(){
        return "ecommerce";
    }

    @GetMapping("/data")
    public String ShowDataExchange(Model m, HttpSession session, HttpServletRequest request){
        session.setAttribute("abc","change");//存在session裡面
        m.addAttribute("bcd","hello");//存在Model裡面
        request.setAttribute("r","從request取的");//存在request裡面
        String p = request.getParameter("msg");
        return "ShowDataExchange";
    }
    @GetMapping("/each")
    public String each(Model car){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Kawasaki H2");
        cars.add("Yamaha R7");
        cars.add("Honda Civic");
        car.addAttribute("each",cars);
        return "Each";


    }
}
