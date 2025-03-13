package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {


    public static String formatarData(LocalDate date) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatador);  // Retorna a data formatada como String
    }

}
