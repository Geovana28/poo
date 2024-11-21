import java.util.Scanner; 

public class CadastraPessoa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite a opção: \n\n1. Pessoa física\n2. Pessoa Jurídica");
        int opcao = scanner.nextInt(); 
        scanner.nextLine(); 

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        if (opcao == 1) { 

            PF objPF = new PF(); 

            System.out.print("Digite o RG: ");
            String RG = scanner.nextLine();
            System.out.print("Digite o CPF: ");
            String CPF = scanner.nextLine();
            System.out.println("Digite a opção:\n\n1. Amigos\n2. Parentes");
            int subOpcao = scanner.nextInt(); 
            scanner.nextLine(); 

            if (subOpcao == 1) { 
                System.out.print("Digite o blog: ");
                String blog = scanner.nextLine();
                Amigo objAmigo = new Amigo(nome, telefone, endereco, RG, CPF, blog);
                objAmigo.exibe();
            }
            if (subOpcao == 2) { 
                System.out.print("Digite o e-mail: ");
                String email = scanner.nextLine();
                Parente objParente = new Parente(nome, telefone, endereco, RG, CPF, email);
                objParente.exibe();
            }
        }

        if (opcao == 2) { 

            System.out.print("Digite o CNPJ: ");
            String CNPJ = scanner.nextLine();
            System.out.print("Digite a Inscrição Estadual: ");
            String IE = scanner.nextLine();
            PJ objPJ = new PJ(nome, telefone, endereco, CNPJ, IE);
            objPJ.exibe();
        }

        scanner.close(); 
    }
}
