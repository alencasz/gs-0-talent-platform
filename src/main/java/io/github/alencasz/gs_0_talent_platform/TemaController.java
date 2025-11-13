package io.github.alencasz.gs_0_talent_platform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TemaController {

    @GetMapping("/info")
    public TemaResponse getInfo() {
        String tema = "0. Plataformas que conectam talentos a projetos com propósito";
        String membro1 = "Lucas de Alencar Pereira (RM-551720)";
        String membro2 = "N/A (Projeto Individual)";
        String descricao = "API de integração para a Global Solution, alinhada ao tema 0. A API demonstra a criação de um endpoint dockerizado com pipeline CI/CD.";

        return new TemaResponse(tema, membro1, membro2, descricao);
    }
}