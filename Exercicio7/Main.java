package Exercicio7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int quantidadeDePlantas;
        menuFloricutura menu = new menuFloricutura();
        do{
            System.out.println("========== 🌿 Menu Floricultura 🌿 ==========");
            System.out.println("1️⃣  Cadastrar nova planta"); // Cadastro Basico Das Plantas
            System.out.println("2️⃣  Repor estoque de uma planta");
            System.out.println("3️⃣  Consultar planta específica");
            System.out.println("4️⃣  Listar todas as plantas");
            System.out.println("5️⃣  ❌ Sair");
            System.out.println("=============================================");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();



            switch(opcao){
                case 1 :
                    System.out.print("Deseja cadastrar quantas plantas : ");
                    quantidadeDePlantas = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < quantidadeDePlantas ; i++) {
                        Plantas novaPlanta = new Plantas();
                        menu.cadastroDePlantas(sc , novaPlanta);
                    }
                    break;
                case 2 :
                    menu.reporEstoque(sc);
                    break;
                case 3 :
                    menu.consultarPlanta(sc);
                    break;
                case 4 :
                    menu.listarPlantas(sc);
                    break;
                default:
                    System.out.println("❌ Digite uma Opcao Valida !");
            }
        }while(opcao != 5);
    }
}
