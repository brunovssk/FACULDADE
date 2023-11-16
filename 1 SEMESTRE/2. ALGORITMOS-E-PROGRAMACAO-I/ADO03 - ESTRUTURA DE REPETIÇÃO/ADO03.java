import java.util.Scanner;

public class ADO03 {
    public static void main(String[] args) {
    }
}

class Ex01 {   

    public static void main(String[] args) {
        final int limiteMinimo = 50;
        final int limiteMaximo = 9500;

        System.out.println("Números divisíveis por 3 entre " + limiteMinimo + " e " + limiteMaximo + ":");

        for (int i = limiteMinimo; i <= limiteMaximo; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class Ex02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 250; i++) {
            if (i % 10 == 0) {
                System.out.println("Múltiplo de 10");
            } else {
                System.out.println(i);
            }
        }
    }
}

class Ex03e04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite até qual termo você deseja calcular a soma: ");
        int quantidadeTermos = scanner.nextInt();

        int soma = calcularSomaSequencia(quantidadeTermos);

        System.out.println("A soma dos " + quantidadeTermos + " primeiros termos da sequência é: " + soma);

        scanner.close();
    }

    private static int calcularSomaSequencia(int qantTermos) {
        int soma = 0;
        int termoAtual = 5;

        for (int i = 1; i <= qantTermos; i++) {
            soma += termoAtual;
            termoAtual += 5;
        }

        return soma;
    }
}

class Ex05e06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da sequência: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite o último termo da sequência: ");
        int ultimoTermo = scanner.nextInt();

        int soma = calcularSomaSeq(primeiroTermo, ultimoTermo);

        System.out.println("A soma dos termos da sequência é: " + soma);

        scanner.close();
    }

    private static int calcularSomaSeq(int primeiroTermo, int ultimoTermo) {
        int quantidadeTermos = (ultimoTermo - primeiroTermo) / 5 + 1;
        int soma = 0;
        int termoAtual = primeiroTermo;

        for (int i = 1; i <= quantidadeTermos; i++) {
            soma += termoAtual;
            termoAtual += 5;
        }

        return soma;
    }
}

class Ex07 {

    public static void main(String[] args) {
        int anoAtual = 2023;
        double salarioInicial = 1000.00;
        double percentualAumento = 0.015; 

        for (int ano = 2011; ano <= anoAtual; ano++) {
            salarioInicial *= (1 + percentualAumento);
            percentualAumento *= 2;
        }

        System.out.println("O salário atual do funcionário em " + anoAtual + " é R$ " + salarioInicial);
    }
    }

class Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário de Carlos: ");
        double salarioCarlos = scanner.nextDouble();

        double salarioJoao = salarioCarlos / 3;
        double rendimentoCarlos = 0.02; 
        double rendimentoJoao = 0.05;
        int meses = 0;

        while (salarioJoao <= salarioCarlos) {
            salarioCarlos += salarioCarlos * rendimentoCarlos;
            salarioJoao += salarioJoao * rendimentoJoao;
            meses++;
        }

        System.out.println("Levará " + meses + " meses para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.");

        scanner.close();
    }    
}

class Ex09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int somaPositivos = 0;
        int quantidadeNegativos = 0;

        System.out.println("Digite valores inteiros diferentes de 0. Digite 0 para encerrar:");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                quantidadeNegativos++;
            }

        } while (numero != 0);

        System.out.println("a) A soma dos números positivos é: " + somaPositivos);
        System.out.println("b) A quantidade de números negativos é: " + quantidadeNegativos);

        scanner.close();
    }
}

class Ex10 {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);

        int nota;
        do {
            System.out.println("Informe a nota: ");
            nota = ler.nextInt();
        } while (nota < 0 || nota > 10);

        String situacao = "";

        if (nota >= 6) {
            situacao = "Aprovado";
        } else if (nota >= 5) {
            situacao = "Recuperação";
        } else {
            situacao = "reprovado";
        }

        System.out.println(situacao);
    }
}

class Ex11 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int opcao;
		double salario;
		double imposto;
		
		do {
			System.out.println("1. Imposto");
			System.out.println("2. Novo salário");
			System.out.println("3. Classificação");
			System.out.println("4. Finalizar o programa");
			System.out.println("Digite o número da opção desejada.");
			
			opcao = ler.nextInt();
			
		} while (opcao != 1 && opcao != 2 && opcao != 3 && opcao!= 4);
			
		if (opcao == 1) {
			
			System.out.println("Informe o valor do seu salário: ");
			salario = ler.nextInt();
			
			if (salario <= 1500) {
				imposto = salario * 0.05;
			} else if (salario <= 3000) {
				imposto = salario * 0.10;
			} else {
				imposto = salario * 0.15;
			}
			
			System.out.printf("O valor do imposto é: %.2f", imposto);
		}
		
		if (opcao == 2){
			
			System.out.println("Informe o valor do seu salário: ");
			salario = ler.nextInt();
			
			if (salario > 4500) {
				salario += 250;
			} else if (salario > 300) {
				salario += 200; 
			} else if (salario > 2000) {
				salario += 150;
			} else {
				salario += 130;
			}
			
			System.out.printf("O valor do seu novo salário é de: %.2f", salario);
		}
		
		if (opcao == 3) {
			
			System.out.println("Informe o valor do seu salário: ");
			salario = ler.nextInt();
			
			if(salario > 3000) {
				System.out.println("Bem remunerado");
			} else {
				System.out.println("Mal remunerado");
			}
			
		}
		
		if (opcao == 4) {
			System.out.println("Tchau!");
		}		
	}
}

class Ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorReferencia;
        double valorKW;
        int quantidadeKW;
        int tipoConsumidor;
        double valorFinal;
        double faturamentoGeral = 0;
        int consumidoresEntre500e1000 = 0;

        System.out.print("Digite o valor de referência: ");
        valorReferencia = scanner.nextDouble();


        while (true) {
            System.out.print("Digite a quantidade de KW (digite 0 para encerrar): ");
            quantidadeKW = scanner.nextInt();

            if (quantidadeKW == 0) {
                break;
            }

            System.out.print("Digite o tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            tipoConsumidor = scanner.nextInt();

            valorKW = valorReferencia / 10;

            double acrescimo = 0;
            switch (tipoConsumidor) {
                case 1:
                    acrescimo = 0.05;
                    break;
                case 2:
                    acrescimo = 0.10;
                    break;
                case 3:
                    acrescimo = 0.15;
                    break;
            }

            valorFinal = quantidadeKW * valorKW * (1 + acrescimo);

            System.out.println("Valor de cada KW: R$" + valorKW);
            System.out.println("Valor a ser pago pelo consumidor: R$" + valorFinal);

            faturamentoGeral += valorFinal;

            if (valorFinal >= 500 && valorFinal <= 1000) {
                consumidoresEntre500e1000++;
            }
        }

        System.out.println("\nFaturamento Geral da Empresa: R$" + faturamentoGeral);
        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + consumidoresEntre500e1000);

        scanner.close();
        }
    }

class Ex13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        System.out.println("Digite o número de termos da série: "); 
        int n = ler.nextInt(); 
        int termo = 2; 
        boolean multiplicar = true; 

        int fator = 3; 
        System.out.print(termo); 

        for (int i = 1; i < n; i++) { 

        if (multiplicar) { 
                termo = termo * fator + 1; 
                multiplicar = false; 
            }
        else { 
                termo = termo / fator + 1; 
                multiplicar = true; 
                fator++; 
            }

        System.out.print(", " + termo); 
        }

        System.out.println();
        ler.close(); 
    }
}

class Ex14{
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabuada do " + i + ":");                
                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println(i + " x " + j + " = " + resultado);
                }
                System.out.println();
            }
        }
    }
    

class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeTimes = 5;
        int quantidadeJogadoresPorTime = 15;

        int jogadoresMenor18 = 0;
        double somaIdades = 0;
        double somaAlturas = 0;
        int jogadoresMais80kg = 0;

        for (int i = 1; i <= quantidadeTimes; i++) {
            System.out.println("Time " + i + ":");

            double somaIdadesTime = 0;

            for (int j = 1; j <= quantidadeJogadoresPorTime; j++) {
                System.out.println("Digite a idade do jogador " + j + ": ");
                int idade = scanner.nextInt();

                System.out.println("Digite o peso do jogador " + j + ": ");
                double peso = scanner.nextDouble();

                System.out.println("Digite a altura do jogador " + j + ": ");
                double altura = scanner.nextDouble();

                if (idade < 18) {
                    jogadoresMenor18++;
                }

                somaIdadesTime += idade;

                somaAlturas += altura;

                if (peso > 80) {
                    jogadoresMais80kg++;
                }
            }

            double mediaIdadeTime = somaIdadesTime / quantidadeJogadoresPorTime;
            System.out.println("Média de idade do time " + i + ": " + mediaIdadeTime);
            somaIdades += somaIdadesTime; 
            System.out.println();
        }

        double mediaIdadeGlobal = somaIdades / (quantidadeTimes * quantidadeJogadoresPorTime);

        double percentualMais80kg = (double) jogadoresMais80kg / (quantidadeTimes * quantidadeJogadoresPorTime) * 100;

        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenor18);
        System.out.println("Média de idades de todos os jogadores: " + mediaIdadeGlobal);
        System.out.println("Média de alturas de todos os jogadores: " + (somaAlturas / (quantidadeTimes * quantidadeJogadoresPorTime)));
        System.out.println("Percentual de jogadores com mais de 80 Kg: " + percentualMais80kg + "%");

        scanner.close();
    }
}

class Ex16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int valor; 
        int menor; 
        int maior; 

        System.out.println("Digite um valor positivo ou um valor negativo para encerrar: ");
        valor = ler.nextInt(); 
        menor = valor; 
        maior = valor; 

        while (valor >= 0) { 
            System.out.println("Digite um valor positivo ou um valor negativo para encerrar: ");
            valor = ler.nextInt(); 
            if (valor >= 0) { 
                if (valor > maior) { 
                    maior = valor; 
                } else if (valor < menor) { 
                    menor = valor; 
                }
            }
        }
        System.out.println("O menor valor foi: " + menor); 
        System.out.println("O maior valor foi: " + maior); 
        ler.close(); 
        }
    }

class Ex17 {
        
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);        
                
                int quantidadeNumeros = 15;
                int menor = Integer.MAX_VALUE;
                int maior = Integer.MIN_VALUE;
                int soma = 0;
                int numerosPares = 0;
                int numerosDivisiveisPor5 = 0;
        
                for (int i = 0; i < quantidadeNumeros; i++) {
                    System.out.print("Digite o número " + (i + 1) + ": ");
                    int numero = scanner.nextInt();

                    if (numero < menor) {
                        menor = numero;
                    }
        
                    if (numero > maior) {
                        maior = numero;
                    }
        
                    soma += numero;
        
                    if (numero % 2 == 0) {
                        numerosPares++;
                    }
        
                    if (numero % 5 == 0) {
                        numerosDivisiveisPor5++;
                    }
                }   

                double media = (double) soma / quantidadeNumeros;
        
                System.out.println("\nResultados:");
                System.out.println("Menor número digitado: " + menor);
                System.out.println("Maior número digitado: " + maior);
                System.out.println("Média dos números digitados: " + media);
                System.out.println("Quantidade de números pares: " + numerosPares);
                System.out.println("Quantidade de números divisíveis por 5: " + numerosDivisiveisPor5);
        
                scanner.close();
            }
        }