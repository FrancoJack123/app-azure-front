package com.cibertec.edu.controller;

import com.cibertec.edu.client.AutenticacionClient;
import com.cibertec.edu.dto.LoginRequestDTO;
import com.cibertec.edu.dto.LoginResponseDTO;
import com.cibertec.edu.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AutenticacionClient autenticacionClient;

    @GetMapping("/autenticar")
    public String index() {
        return "autenticar/index";
    }

    @PostMapping("/validar")
    public String validar(String codigoUsuario, String password, Model model) {
        LoginRequestDTO loginRequestDTO = new LoginRequestDTO(codigoUsuario, password);
        LoginResponseDTO response = autenticacionClient.autenticar(loginRequestDTO);
        if (response.usuario() == null) {
            model.addAttribute("error", response.mensaje());
            return "autenticar/index";
        }
        return "redirect:/listarUsuarios";
    }

    @GetMapping("/listarUsuarios")
    public String listarUsuarios(Model model) {
        List<UsuarioDTO> usuarios = restTemplate.getForObject("https://app-azure-back.azurewebsites.net/get-integrantes", List.class);
        model.addAttribute("usuarios", usuarios);
        return "autenticar/integrantes";
    }
}
