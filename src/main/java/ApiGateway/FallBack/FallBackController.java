package ApiGateway.FallBack;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    public ResponseEntity userServiceFallBack(){
        return new ResponseEntity("User Service is taking longer", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/deptServiceFallBack")
    public ResponseEntity departmentServiceFallBack(){
        return new ResponseEntity("Department service is broken. Try again later", HttpStatus.BAD_REQUEST);
    }
}
