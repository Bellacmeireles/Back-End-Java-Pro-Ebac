package br.com.ebac.ebacfilas.consumidor;

import br.com.ebac.ebacfilas.configuracao.ConfigRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfigRabbitMQ.NOME_FILA) // indica q esta consumindo a fila com esse nome
public class Consumidor {
    @RabbitHandler // indica que toda vez q receber mensagem nesta fila, chamarei este metodo e ai ele vai converter o obj pra string nessa area aqui e chama o metodo pra consumir
    public void consumirMensagem(String mensagem) {
        System.out.println("================= RECEBENDO MENSAGEM =================");
        System.out.println("================= " + mensagem);
        System.out.println("================= FIM. RECEBENDO MENSAGEM =================");
    }
}
