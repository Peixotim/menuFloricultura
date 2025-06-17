package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class menuFloricutura implements contractsPlantas{

    int quantidadeARepor;
    ArrayList<Plantas> cadastroPlantas = new ArrayList<>();

    @Override
    public Plantas cadastroDePlantas(Scanner sc , Plantas plantas) {

        System.out.print("Digite o nome da planta : ");
        plantas.nome = sc.nextLine();

        System.out.print("Digite o nome do tipo da planta : ");
        plantas.tipoPlanta =  sc.nextLine();

        System.out.print("Digite o valor da unidade : ");
        plantas.valorDaUnidade = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a quantidade em estoque : ");
        plantas.quantidadeEmEstoque = sc.nextInt();

        System.out.print("Digite a quantidade ideal para ter em estoque : ");
        plantas.quantidadeIdeal = sc.nextInt();
        sc.nextLine();

        plantas.quantidadeARepor = plantas.quantidadeIdeal - plantas.quantidadeEmEstoque;

        if(plantas.quantidadeIdeal > plantas.quantidadeEmEstoque){
            System.out.print("Deseja repor o estoque agora (s/n) : ");
            plantas.reporEstoque = sc.nextLine();
            plantas.precisaRepor = true;
            if(plantas.reporEstoque.equalsIgnoreCase("s")){
                System.out.println("\uD83D\uDCA1 Para atingir o estoque ideal, será necessário comprar : " + plantas.quantidadeARepor +
                        " unidades " +  " totalizando : " + plantas.quantidadeARepor * plantas.valorDaUnidade + "R$");
                System.out.print("Confirmacao de compra (s/n) : ");
                String confirmacao = sc.nextLine();
                if(confirmacao.equalsIgnoreCase("s")){
                    System.out.println("========================================");
                    System.out.println("         ✅ COMPRA CONFIRMADA! ✅       ");
                    System.out.println("========================================");
                    System.out.println(" Seu pedido está sendo processado...");
                    System.out.println(" Em breve você receberá mais informações no seu e-mail.");
                    System.out.println("========================================");
                    plantas.precisaRepor = false;
                }else{
                    System.out.println("❌ Compra cancelada. Você pode voltar a qualquer momento.");
                }
            }

        }
        cadastroPlantas.add(plantas);
        return plantas;// Vai adicionar mais um item no array

    }

    @Override
    public void reporEstoque(Scanner sc) {
        if(cadastroPlantas.isEmpty()){ //cadastroPlantas está vazio
            System.out.println(" ❌ Nao há Plantas cadastradas !");
        }else{
            for (int i = 0; i < cadastroPlantas.size(); i++) { // Vai percorrer o cadastroPlantas
                Plantas p = cadastroPlantas.get(i);
                if(p.precisaRepor){
                    String confirmacao;
                    System.out.println("Nome da Planta : " + p.nome);
                    System.out.println("Tipo da Planta : " + p.tipoPlanta);
                    System.out.println("Valor da unidade : " + p.valorDaUnidade);
                    System.out.println("Quantidade em estoque : " + p.quantidadeEmEstoque);
                    System.out.println("Quantidade ideal : " + p.quantidadeIdeal);
                    System.out.println("Quantidade a repor : " +  p.quantidadeARepor);

                    System.out.print("Deseja repor a quantidade em estoque (s/n) : ");
                    confirmacao = sc.nextLine();

                    if(confirmacao.equalsIgnoreCase("s")){
                        String confirmacao2;
                        int quantidadeARepor = p.quantidadeIdeal - p.quantidadeEmEstoque;
                        double precoAPagar = quantidadeARepor * p.valorDaUnidade;
                        System.out.print("\uD83D\uDCA1 Para atingir o estoque ideal, será necessário gastar " +  "R$" + precoAPagar + " confirmar a compra (s/n) : ");
                        confirmacao2 = sc.nextLine();
                        if(confirmacao2.equalsIgnoreCase("s")){
                            System.out.println("========================================");
                            System.out.println("         ✅ COMPRA CONFIRMADA! ✅       ");
                            System.out.println("========================================");
                            System.out.println(" Seu pedido está sendo processado...");
                            System.out.println(" Em breve você receberá mais informações no seu e-mail.");
                            System.out.println("========================================");
                            p.precisaRepor = false;
                        }else{
                            System.out.println("❌ Compra cancelada. Você pode voltar a qualquer momento.");
                        }
                    }else{
                        System.out.println("❌ Reposicao cancelada . Volte a qualquer momento .");
                    }
                }
            }
        }
    }

    @Override
    public void consultarPlanta(Scanner sc) {
        for (int i = 0; i < cadastroPlantas.size(); i++) {
            Plantas p = cadastroPlantas.get(i);

            String nomePlantaLista = p.nome;

            if(cadastroPlantas.isEmpty()){
                System.out.println(" ❌ Nao há Plantas cadastradas !");
            } else{
                System.out.print("Digite o nome da planta : ");
                String nomeDaPlanta = sc.nextLine();
                if(nomePlantaLista.equalsIgnoreCase(nomeDaPlanta)){
                    System.out.println("Nome da Planta : " + p.nome);
                    System.out.println("Tipo da Planta : " + p.tipoPlanta);
                    System.out.println("Valor da unidade : " + p.valorDaUnidade);
                    System.out.println("Quantidade em estoque : " + p.quantidadeEmEstoque);
                    System.out.println("Quantidade ideal : " + p.quantidadeIdeal);
                }else{
                    System.out.println(" ❌ Nao há Plantas com esse nome cadastradas !");
                }
            }
        }
    }

    @Override
    public void listarPlantas(Scanner sc) {
        for (int i = 0; i < cadastroPlantas.size(); i++) {
            Plantas p = cadastroPlantas.get(i);
            System.out.println("Nome da Planta : " + p.nome);
            System.out.println("Tipo da Planta : " + p.tipoPlanta);
            System.out.println("Valor da unidade : " + p.valorDaUnidade);
            System.out.println("Quantidade em estoque : " + p.quantidadeEmEstoque);
            System.out.println("Quantidade ideal : " + p.quantidadeIdeal);
            System.out.println("Quantidade a repor : " +  p.quantidadeARepor);
        }
    }

    public void quantidadeDePlantas(){
        System.out.println("Há " + cadastroPlantas.size() + " plantas cadastradas !");
    }
}
