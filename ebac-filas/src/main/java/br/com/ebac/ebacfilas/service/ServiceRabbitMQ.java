package br.com.ebac.ebacfilas.service;

import br.com.ebac.ebacfilas.configuracao.ConfigRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
* Esse servico esta simplesmente abstraindo o codigo pra gente poder enviar mensagem nas fila
* pra poer enviar a mensagem, usaremos o RabbitTemplate - nele contem os metodos necesarios para fazer o envio de forma facil e auto configuravel
*
* */
@Component
public class ServiceRabbitMQ {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviaMensagem(String mensagem) {
        rabbitTemplate.convertAndSend(ConfigRabbitMQ.NOME_EXCHANGE, "ebac.rota.mensagem", mensagem);
    }
}
