package personRest.userServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class uSController {

    @Autowired
    private uSService uSService;


    @RequestMapping("/userServices/add")
    public long add(@RequestParam long a,  @RequestParam long b)
    {
        return uSService.add(a,b);
    }


    @RequestMapping("/userServices/length")
    public int length(@RequestParam String nazwa){
        return uSService.length(nazwa);
    }


    @RequestMapping("/userServices/multiple")
    public long multiple(@RequestParam long a,  @RequestParam long b)
    {
        return uSService.multiple(a,b);
    }

    @RequestMapping("/userServices/connect")
    public String connect(@RequestParam String a, @RequestParam String b){
        return uSService.connect(a,b);
    }
}
