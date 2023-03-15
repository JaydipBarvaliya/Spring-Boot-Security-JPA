package io.javabrains.Controllers;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {


    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @PreAuthorize("hasAnyAuthority('USER','ADMIN')")
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }




    @PreAuthorize("hasAnyRole('READ','WRITE')")
    @GetMapping("/user")
    public String readAndWrite() {
        return ("<h1>Reading & Writing</h1>");
    }
}
