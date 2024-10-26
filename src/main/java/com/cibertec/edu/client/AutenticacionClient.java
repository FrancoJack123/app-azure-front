package com.cibertec.edu.client;

import com.cibertec.edu.configuration.FeignClientConfig;
import com.cibertec.edu.dto.LoginRequestDTO;
import com.cibertec.edu.dto.LoginResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "autenticacionClient", url = "https://app-azure-back.azurewebsites.net", configuration = FeignClientConfig.class)
public interface AutenticacionClient {
    @PostMapping("/autenticar")
    LoginResponseDTO autenticar(@RequestBody LoginRequestDTO loginRequestDTO);
}