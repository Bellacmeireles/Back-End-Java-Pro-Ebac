package com.example.demoeventos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class ServicoEnvioMensagensKafka {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.ebac.nome.topico}")
    private String nomeTopicoEbac;

    @PostMapping
    public void enviarMensagem(@RequestBody String mensagem) {
        System.out.println("================== ENVIANDO MENSAGEM: " + mensagem + ", topico" + nomeTopicoEbac);
        kafkaTemplate.send(nomeTopicoEbac, mensagem);
    }

}
