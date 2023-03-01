package tech.edilbert.springdesk.controllers.cliente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tech.edilbert.springdesk.Enums.Perfil;
import tech.edilbert.springdesk.model.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/cadastro")
    public ModelAndView cadastro(Cliente cliente){
        ModelAndView mv = new ModelAndView("cliente/cadastro");
        mv.addObject("usuario", cliente);
        mv.addObject("perfils", Perfil.values());
        return mv;
    }

}
