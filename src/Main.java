import enumeration.Diaria;
import model.Hospede;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospede hospede = new Hospede();
        Double valorTotal = 0.0;

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite seu nome:");
            String nomeHospede = scanner.nextLine();

            System.out.println("Digite seu cpf:");
            String cpfHospede = scanner.nextLine();

            System.out.println("Quantos dias o(a) senhor(a) pretende ficar?");
            Long periodoHospede = scanner.nextLong();

            System.out.println("O quarto seria para o senhor somente (0), com acompanhante (1), ou filho(a) (2) ?");
            int opcao = scanner.nextInt();
            if(opcao ==0){
                hospede.setValorDia(Diaria.INDIVIDUAL);
            } else if (opcao ==1) {
                hospede.setValorDia(Diaria.ACOMPANHANTE);
            }else {
                hospede.setValorDia(Diaria.CRIANCA);
            }
            //calcular o valor da estadia = diaria X periodo
            valorTotal = hospede.getValorDia() * periodoHospede;
        }
    }
}