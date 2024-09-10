package com.br.doa.sqs;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.br.doa.sqs.consumer.Message;

@SpringBootApplication
public class AwsSqsProducerConsumerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AwsSqsProducerConsumerApplication.class, args);
	}

	@Autowired
	private SqsTemplate sqsTemplate;

	@Override
	public void run(String... args) throws Exception {
		var SQS = "https://localhost.localstack.cloud:4566/000000000000/minha-fila";
		sqsTemplate.send(SQS, new Message("Mensagem enviada pra fila..."));
	}
}
