import java.util.Scanner;

public class Original {
    public static Scanner ler = new Scanner(System.in);
    public static final String PURPLE_BOLD = "\u001B[1;35m";
    public static final String RESET_COLOR = "\u001B[0m";

    public static void main(String[] args) {
        System.out.printf(PURPLE_BOLD + "Bruno da Cruz, João Rosa e Vinicius Tenorio " + "Apresentam: \n\n" + RESET_COLOR);

        String banner =
            PURPLE_BOLD +
                ".-----------------------------------------------------------------------------------.\n" +
                "|                                                                                   |\n" +
                "|                                                                                   |\n" +
                "|    ___  _   _ ___ _____          _____ ___   ___ _____ ____    _    _     _       |\n" +
                "|   / _ \\| | | |_ _|__  /         |  ___/ _ \\ / _ \\_   _| __ )  / \\  | |   | |      |\n" +
                "|  | | | | | | || |  / /   _____  | |_ | | | | | | || | |  _ \\ / _ \\ | |   | |      |\n" +
                "|  | |_| | |_| || | / /_  |_____| |  _|| |_| | |_| || | | |_) / ___ \\| |___| |___   |\n" +
                "|   \\__\\_\\\\___/|___/____|         |_|   \\___/ \\___/ |_| |____/_/   \\_\\_____|_____|  |\n" +
                "|                                                                                   |\n" +
                "|                                                                                   |\n" +
                "'-----------------------------------------------------------------------------------'" +
                RESET_COLOR;

        digitarComMillisChar(banner, 15);

        while (true) {
            menuDeOpcoes();
        }
    }

    private static void digitarComMillisChar(String texto, int intervalo) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            pausa(intervalo);
        }
        System.out.println();
    }

    private static void pausa(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void menuDeOpcoes() {
        System.out.println(PURPLE_BOLD + "========================\"SEJAM -- BEM -- VINDO\"========================" + RESET_COLOR);
        System.out.println(PURPLE_BOLD + "Escolha uma opção:" + RESET_COLOR);
        System.out.println(PURPLE_BOLD + "1 - Instruções" + RESET_COLOR);
        System.out.println(PURPLE_BOLD + "2 - Iniciar o jogo" + RESET_COLOR);
        System.out.println(PURPLE_BOLD + "3 - Mostrar pontuação" + RESET_COLOR);
        System.out.println(PURPLE_BOLD + "4 - Sair" + RESET_COLOR);

        int opcao = 0;

        try {
            opcao = ler.nextInt();
        } catch (Exception e) {
            System.out.println("Opção inválida. Tente novamente.");
            ler.nextLine();
            return;
        }

        switch (opcao) {
            case 1:
                exibirInstrucoes();
                break;
            case 2:
                iniciarOJogo();
                break;
            case 3:
                mostrarPontuacao();
                break;
            case 4:
                System.out.println("Obrigado por jogar! Até mais.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void exibirInstrucoes() {
        System.out.println("=== INSTRUÇÕES DO JOGO ===");
        System.out.println();
        System.out.println("1 - 0 objetivo do jogo é responder corretamente o maximo de perguntas possíveis. ");
        System.out.println("2 - O jogo tem 4 campeonatos, cada campeonato tem um conjunto de perguntas específicas. ");
        System.out.println("3 - O jogador deve escolher o campeonato digitando o número correspondete ao campeonato de sua escolha");
        System.out.println("4 - As respostas devem ser dadas pelo jogador digitando letras.");
        System.out.println("5- Sistema de Pontuação funciona da seguinte forma: ");
        System.out.println("    - Fácil: 100 ponto");
        System.out.println("    - Médio: 200 pontos");
        System.out.println("    - Difícil: 300 pontos");
        System.out.println("    - Bonus: de 50 pontos cada três perguntas acertadas:");
        System.out.println("6 - Cada opção de campeonato terá 15 perguntas, sendo 5 para cada nivél de dificuldade dito acima:");
        System.out.println("7 - O jogador que optar por jogar novamente terá a sua pontuação substituída pela anterior, caso a segunda pontuação for maior que a primeira. ");
        System.out.println("8 - O jogo termina quando todas as perguntas forem respondidas \n");
        menuDeOpcoes();
    } 

    private static void mostrarPontuacao() {
        // Coloque aqui a lógica para exibir o ranking, se desejar.
        System.out.println("Mostrar pontuação.");
        menuDeOpcoes();
    }

    private static void iniciarOJogo() {
        System.out.println("Escolha o campeonato:");
        System.out.println("1 - Copa do Mundo");
        System.out.println("2 - Champions League");
        System.out.println("3 - Libertadores");
        System.out.println("4 - Mundial de Clubes");

        int opcaoCampeonato = ler.nextInt();

        String[][] perguntas = {
            // Perguntas da Copa do Mundo
            {
                "Qual foi a primeira seleção a ganhar a Copa do Mundo ?",
                "Quem é o artilheiro da Copa do Mundo?",
                "Quantas Copas do Mundo Argentina, Uruguai e Brasil têm juntas?",
                "Onde foi a copa do mundo 2018?",
                "Qual a seleção que mais tem copas do mundo?",
                "Quem fez mais Assistência em copas do mundo?",
                "Qual é a única seleção que venceu a Copa do Mundo em todos os continentes?",
                "Qual é o jogador que mais vestiu a camisa da seleção brasileira na Copa do Mundo?",
                "Qual é a seleção que mais vezes foi vice-campeã da Copa do Mundo?",
                "Quantos gols Neymar tem em copas do mundo?",
                "Qual é a única seleção que nunca perdeu um jogo na fase de grupos da Copa do Mundo?",
                "Qual é o país que mais sediou a Copa do Mundo?",
                "Qual é o jogador mais jovem a marcar um gol na Copa do Mundo?",
                "Qual é o jogador mais velho a marcar um gol na Copa do Mundo?",
                "Qual é a maior goleada da história da Copa do Mundo?"
            },
            // Perguntas da Liga dos Campeões
            {
                "Quem foi o artilheiro da Champions 22/23? ",
                "Quem é o maior artilheiro da história da Champions League?",
                "Qual é o maior ganhador da Champions League (clube) ?",
                "Qual foi o time inglês que enfrentou o Barcelona na final da Champions 2010/2011 ?",
                "Qual foi o placar da final da Champions League 22/23?",
                "Em 8 de março de 2017 o barcelona goleou o psg por 6x1, quem fez o sexto gol?",
                "Quartas de Final Champions League 2017/18 Cristiano ronaldo fez um gol de bike, em qual goleiro?",
                "Qual time de Portugal tem mais títulos de Champions League ?",
                "Qual time Francês ganhou a Champions Legue?",
                "Qual desses times tem Champions League?",
                "Na semi final da champions 2019 lucas moura fez 3 gols, o seu terceiro foi no minuto...",
                "Quem é o maior assistente da Champions League?",
                "Qual é o resultado da soma dos gols dos 5 primeirros artilheiros da Champions League na Champions league?",
                "Quem tem mais Gols na Champions League?",
                "Em que temporada o Olimpique de Marselha ganhou a Champions League?",
            },
            // Perguntas da Libertadores
            {
                "Cavani foi pra que time da Libertadores 2023?",
                "Qual foi o placar na final da Libertadores de 2019 entre Flamengo x River Plate?",
                "Quantas Libertadores tem o São Paulo?",
                "Qual time é o maior campeão do Torneio ?",
                "Qual foi o placar agregado na final Histórica entre São Paulo e Athletico PR na final da Libertadores 2005",
                "Quem foi o rei da América em 2017?",
                "Qual foi o maior artilheiro da Copa Libertadores da América dessa década?",
                "Qual foi a maior porcentagem de aproveitamento da História da Copa Libertadores?",
                "Qual time Brasileiro tem maior participações em finais ?",
                "Quem foi o artilheiro da Libertadores de 2005 ?",
                "Qual é o maior artilheiro da Libertadores ?",
                "Que time eliminou o Flamengo nas oitavas da Libertadores de 2023?",
                "Qual foi a maior porcentagem de aproveitamento da História da Copa Libertadores?",
                "Quais times brasileiros foram as oitavas da Libertadores 2023?",
                "Quem fez o primeiro gol da Copa Libertadores ?",
            },
            // Perguntas do Mundial de Clubes Fifa
            {
                "Qual é o unico goleiro a fazer ao menos 1 gol na hitória dos mundiais ?",
                "Em que ano foi sediado o mundial de clubes no Brasil ?",
                "Qual time Brasileiro tem mais Mundial de Clubes ?",
                "Qual time tem mais campeonatos considerados Mundial de Clubes ?",
                "Quem foi o melhor jogador do torneiro em 2005 ?", 
                "Quantos Titulos o maior campeão mundial tem?",
                "Qual é o jogador que mais gols marcou em toda a história do Mundial de Clubes?",
                "Qual jogador fez o gol da vitória na final do mundial de 2017 ?",
                "Qual goleiro é conhecido por ter feito uma das melhores atuações em uma final de Mundial ?",
                "Quem foi o artilheiro do utlimo Mundial de Clubes ?",
                "A partir de que ano a FIFA organiza o Mundial de Clubes ?",
                "Qual o motivo do cancelamento do Mundial de Clubes na Espanha em 2001?",
                "Qual primeiro time brasileiro campeão da Libertadores?",
                "Antes de chamar Copa do Mundo de Clubes, o torneio tinha outro nome e não era organizado pela FIFA. Qual o nome do torneio ?",
                "Onde aconteceu o Mundial de Clubes de 2005 ?",
            }
        };
        //  armazenar as alternativas de cada pergunta
    String[][] alternativas = {
            // Alternativas da Copa do Mundo
            {
                "A - Uruguai\n B - Argentina\n C - Brasil\n D - Alemanha\n E - França",
                "A - Lionel Messi\n B - Maradona\n C - Pelé\n D - Ronaldo Fenômeno\n E - Klose",
                "A - 9\n B - 10\n C - 7\n D - 8\n E - 11",
                "A - Brasil\n B - China\n C - Dubai\n D - Rússia\n E - África do Sul",
                "A - Espanha\nB - Alemanha\nC - Brasil\nD - Chile\nE - França",
                "A - Rivaldo\nB - Zidane\nC - Messi\nD - Neymar\nE - Cristiano Ronaldo",
                "A - Espanha\nB - Alemanha\nC - Brasil\nD - Chile\nE - França",
                "A - Cafú\nB - Pelé\nC - Neymar\nD - Roberto Carlos\nE - Messi",
                "A - Alemanha\nB - Holanda\nC - Brasil\nD - Suécia\nE - Portugal",
                "A - 9\nB - 4\nC - 5\nD - 8\nE - 10",
                "A - Alemanha\nB - Holanda\nC - Brasil\nD - Itália\nE - Portugal",
                "A - Brasil\nB - México\nC - França\nD - Alemanha\nE - Itália",
                "A - Pelé\nB - Mbappé\nC - Owen\nD - Müller\nE - Rooney",
                "A - Zidane\nB - Roger Milla\nC - Dino Zoff\nD - Miroslav Klose\nE - Ryan Giggs",
                "A - Brasil 7 x 1 Alemanha\nB - Hungria 10 x 1 El Salvador\nC - Alemanha 8 x 0 Arábia Saudita\nD - Portugal 7 x 0 Coreia do Norte\nE - Iugoslávia 9 x 0 Zaire"
            },
            // Alternativas da Liga dos Campeões
            {
                "A - Mbappe - 7 gols\n B - Erling Haaland - 12 gols\n C -  Vinicius Jr - 14 gols\nD - Mohamed Salah - 10 gols E - -Lionel Messi - 15 gols.",
                "A - Cristiano Ronaldo\n B - Lionel Messi\n C - Raul Garcia\n D - Benzema\n E - Neymar",
                "A - Real Madrid\n B - Barcelona\n C - Milan\n D - Liverpool \n E - Chelsea", 
                "A - Arsenal\n B - Chelsea\n C - Manchester United\n D - Liverpool\n E - Manchester City",
                "A - Internazionale 0 x 1 Manchester City \n B - Internazionale 0 x 1 Manchester City na prorrogação\n  C - Internazionale 2 x 1 Manchester City\n D - Internazionale 1 x 0 Manchester City \n E - Internazionale 1 x 1 Manchester City", 
                "A - Neymar\n B - Sergio Roberto\n C - Messi\n D - Luís Suares\n E - Sebastian Vettel", 
                "A - Navas\n B - Casillas\n C - Manuel Neuer\n D - Buffon\n E - Rogério Ceni",
                "A - Benfica\n B - Porto\n C - Vasco\n D- Porto e Benfica estão empatados\n E) Braga",
                "A - PSG\n B - Olympique de Marselha\n C - Lyon\n D - Nantes\n E - Monaco",
                "A - Nottingham Forest\n B - PSG\n C - Sporting\n D - Atletico De Madri \n E - Besikitas",
                "A - 94\n B - 96\n C - 95\n D - 90\n E - 80",
                "A - Riquelme\n B - Cristiano Ronaldo\n C - Lionel Messi\n D - Kevin De Bruyne\n E - Val Bahiano",
                "A - 521\n B - 702\n C - 629\n D - 456\n E - 700",
                "A - Cavani\n B - Gerd Muller\n C - Kaká\n D - Rooney\n E - David Beckam",
                "A - 93/94\n B - 89/90\n C - 92/93\n D - 60/61\n E - 70/71",
            },
            // Alternativas da Libertadores
            {
                "A - São Paulo\n B - River Plate\n C - Boca Juniors\n D - Argentino Juniors\n E - Palmeiras",
                "A - Flamengo 0 x 0 River Plate.\n B - Flamengo 3 x 0 River Plate.\n C - Flamengo 2 x 1 River Plate.\n D - Flamengo 0 x 2 River Plate/n E - Flamengo 0 x 1 River Plate",
                "A - 3\n B - 1\n C - 4\n D - 5\n E - 6",
                "A - Independiente\n B - Peñarol\n C - River Plate\n D - São Paulo\n E - Palmeiras",
                "A - Athletico PR 1 X 0 São Paulo\n B - Athletico PR 1 X 5 São Paulo\n C - Athletico PR 2 X 0 São Paulo\n D - Athletico PR 0 X 0 São Paulo 4 x 2 (Pênaltis)\n E - Athletico PR 1 X 1 São Paulo",
                "A - Luan\n B - Pedro.\n C - Arrascaeta\n D - Gabigol\nE - Marinho",
                "A - Ronaldinho Gaúcho\n B - Gabigol\n C - Pelé\n D - Dudu\n E - Calerri",
                "A - Flamengo 2019\n B - Estudiantes 1969\n C - Palmeiras 2021\n D - Corinthians 2012\n E - São Paulo 2005",
                "A - São Paulo com 6\n B - Grêmio e Santos com 7.\n C - Flamengo e Cruzeiro com 4\n D - Internacional com 3\n E - Palmeiras com 4",
                "A - Amoroso\n B - Aloisio\n C - Rogério Ceni\n D - Diego Tardelli\n E - Luizão",
                "A - Alberto Spencer\n B - Gabigol\n C - Lucas Pratto\n D - Daniel Onega.\n E - Neymar",
                "A - Fluminense\n B - Olimpia (Paraguai)\n C - Boca Juniors\n D - Indepedente Del Valle\n E - XV de Piracicaba",
                "A - Flamengo 2019\n B - Estudiantes 1969\n C - Palmeiras 2021\n D - Corinthians 2012\n E - Boca Juniors 2004",
                "A - Palmeiras |Fluminense | Athletico Pr | Flamengo | Internacional | Atlético MG\n B - Corinthians| Cuiabá| Santos e Botafogo\n C - Fluminense, Atletico MG, Sport e Interncional\n D - Ceara | Vitória | ABC\n E - São Paulo | Corinthians",
                " A - Rogério Ceni\n B Manuel\n NeueR\n C - Cassio\n D - Dida\n E - Marcos",
            },
    
            // Alternativas do Mundial de Clubes Fifa
            {
                "A - Rogério Ceni\n B - NeueR\n C - Cassio\n D - Dida\n E - Marcos", 
                "A - 2005\n B - 2003\n C - 2022\n D - 2000\n E - 2001",
                "A - São Paulo\n B - Corinthians\n C - Santos\n D - Palmeiras\n E - Flamengo",
                "A - São Paulo\n B - Al-Hilal\n C - Milan\n D - Real Madrid\n E - Barcelona",
                "A - Xavi Alonso\n B - Rogério Ceni\n C - Aloisio\n D - Steaven Gerrard\n E - Mineiro",
                "A - 5\n B - 7\n C - 9\n D - 8\n E - 9",
                "A - Cristiano Ronaldo (7 gols)\n B - Lionel Messi (5 gols)\n C - Neymar (8 gols)\n D - Ronado Fenômeno (10 gols)\n E - Roberto Firmino (6 gols)",
                "A - Cristiano Ronaldo\n B - Benzema\n C - Luan\n D - Toni Kross\n E -  Casemiro",
                "A - Cassio\n B - Marcos\n C - Manuel Neuer\n D - Thibaut Courtois\n E - Rogério Ceni",
                "A - Abdoulay Diaby, do Al-Jazira, Yasser Ibrahim, do Al Ahly, Raphael Veiga, do Palmeiras, e Romelu Lukaku, do Chelsea, com dois gols cada, foram os goleadores da competição\n  B - Romelu Lukaku (3 gols)\n  C - Dudu (5 gols)\n D - Roni (2 gols)\n E - Luan (1 gol)",
                "A - 1980\n B - 1985\n C - 1995\n D - 2000\n E - 2001",
                "A -  A FIFA não arrecadou dinheiro suficiente\n B - Os principais times não quiseram comparecer\n C - Falência da ISL, principal parceira de marketing da FIFA\n D - O país estava em guerra\n E - Pelé estava com a xuxa",
                "A - São Paulo\n B - Santos\n C - Flamengo\n D - Palmeiras\n E - Grêmio",
                "A - Interclubes\n B - Copa dos Clubes Mundiais.\n C - Torneio do Mundo\n D - Copa Intercontinental.\n E - Copa Latão",
                "A - Qatar\n B - Korea do Sul\n C - Tailândia\n D - Japão\n E - China",        
        }
    };
    
    // Utilizamos um array bidimensional de strings armazenando os gabaritos de cada pergunta
    String[][] gabaritos = {  
            // Gabaritos da Copa do Mundo
            {
                "A","E","B","D","C","C","C","A","A","D","D","B","A","B","B"
            },
            // Gabaritos da Champions League
            {
                "B","A","A","C","A","B","D","D","B","A","C","B","A","A","C",
            },
            // Gabaritos da Libertadores
            {
                "C", "C", "A", "A", "B","A","B","B","A","C","A","B","B","A","D",
            },
            // Gabaritos do Mundial de Clubes
            {
                "A","D","A","D","B","D","A","A","E","A","D","C","B","D","D",
            }
        };
        apresentaPergunta(opcaoCampeonato, perguntas, gabaritos, alternativas);
    }

    private static void apresentaPergunta(int opcaoCampeonato, String[][] perguntas, String[][] gabaritos, String[][] alternativas) {
        if (opcaoCampeonato < 1 || opcaoCampeonato > perguntas.length) {
            System.out.println("Opção de campeonato inválida. Tente novamente.");
            menuDeOpcoes();
            return;
        }
        int cont = 0;
        int[] pontuacaoPorCategoria = {100, 200, 300};
        int pontuacaoTotal = 0;

        for (int i = 0; i < 14; i++) {
            System.out.println(perguntas[opcaoCampeonato - 1][i]);
            System.out.println(alternativas[opcaoCampeonato - 1][i]);
            String resposta = ler.next();

            if (resposta.equalsIgnoreCase(gabaritos[opcaoCampeonato - 1][i])) {
                System.out.println("\nAcertou!\n");
                cont++;

                // Adiciona a pontuação conforme a categoria da pergunta
                pontuacaoTotal += pontuacaoPorCategoria[opcaoCampeonato - 1];

                // Adicionar ponto bonus cada 5 acertos
                if (cont % 5 == 0) {
                    pontuacaoTotal += 50;
                }
            } else {
                System.out.println("\nErrou!\n");
            }
        }

        System.out.println("Você acertou " + cont + " questões");
        System.out.println("Pontuação total: " + pontuacaoTotal);
        menuDeOpcoes();
    }
}
