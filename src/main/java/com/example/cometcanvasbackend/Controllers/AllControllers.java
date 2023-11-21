package com.example.cometcanvasbackend.Controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador que gestiona las diferentes rutas de la aplicación.
 */
@Controller
public class AllControllers {

    /**
     * Maneja la solicitud GET a la ruta "/" y devuelve la plantilla "index".
     *
     * @return La plantilla "index".
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Maneja la solicitud GET a la ruta "/SignUp" y devuelve la plantilla "SignUp".
     *
     * @return La plantilla "SignUp".
     */
    @GetMapping("/SignUp")
    public String signup() {
        return "SignUp";
    }

    /**
     * Maneja la solicitud GET a la ruta "/LogIn" y devuelve la plantilla "LogIn".
     *
     * @return La plantilla "LogIn".
     */
    @GetMapping("/LogIn")
    public String login() {
        return "LogIn";
    }

    /**
     * Maneja la solicitud GET a la ruta "/Home" y devuelve la plantilla "Home".
     *
     * @return La plantilla "Home".
     */
    @GetMapping("/Home")
    public String home() {
        return "Home";
    }

    /**
     * Maneja la solicitud GET a la ruta "/Contact" y devuelve la plantilla "Contact".
     *
     * @return La plantilla "Contact".
     */
    @GetMapping("/Contact")
    public String contact() {
        return "Contact";
    }

    /**
     * Maneja la solicitud GET a la ruta "/TOS" y devuelve la plantilla "TOS".
     *
     * @return La plantilla "TOS".
     */
    @GetMapping("/TOS")
    public String tos() {
        return "TOS";
    }

    /**
     * Maneja la solicitud GET a la ruta "/AddImg" y devuelve la plantilla "AddImg".
     *
     * @return La plantilla "AddImg".
     */
   
}