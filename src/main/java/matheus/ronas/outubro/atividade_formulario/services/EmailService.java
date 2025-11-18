package matheus.ronas.outubro.atividade_formulario.services;

import jakarta.enterprise.context.ApplicationScoped;
import matheus.ronas.outubro.atividade_formulario.domain.EmailInput;
import matheus.ronas.outubro.atividade_formulario.domain.EmailOutput;

@ApplicationScoped
public class EmailService {
public EmailOutput validaEmail(EmailInput input){
    EmailOutput emailOutput = new EmailOutput();
    String email = input.getEmail();

    if(email.length() > 10 && email.contains("@")){
    emailOutput.setEmail(input.getEmail());    
    }else{
        throw new IllegalArgumentException("hoje nao, meu patrao!");
    }
     return emailOutput;
}
}
