package abm.lws.cricinfo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/player")
public class PlayerController {
    
    @Autowired  // implements all dependency
    private ICric repo; // interface repository (repository pattern)

    @GetMapping("/all")
    public Collection<Player> viewAll(){
        return repo.findAll();
    }

    @PostMapping("/save")
    public String savePlayer(@RequestBody Player p) {
        repo.save(p);
        return "Player Saved";
    }
    
    
}
