import java.util.Scanner;

public class Interface {
    private final Scanner keyboard;

    public Interface() {
        keyboard = new Scanner(System.in);
    }

    public int getMenuOption() {
        System.out.print(
                """
                
                
                1) Cadastrar novo elemento de mídia
                2) Listar todos elementos cadastrados
                3) Listar mídia filtrada por tipo ou título
                4) Inserir ou editar comentário para um determinado item de média
                5) Marcar um elemento como adquirido
                6) Fechar
                Escolha uma ação:\s"""
        );
        return Integer.parseInt(keyboard.nextLine());
    }

    public int getTypeMedia() {
        System.out.print(
                """

                        1) DVD
                        2) CD
                        3) Video Game
                        4) Board Game (Jogo de tabuleiro)
                        Escolha um tipo de mídia:\s"""
        );
        return Integer.parseInt(keyboard.nextLine());
    }

    public String getTitleMedia() {
        System.out.print("\nInforme o título: ");
        return keyboard.nextLine();
    }

    public int getPlayingTimeMedia() {
        System.out.print("Informe o tempo de reprodução: ");
        return Integer.parseInt(keyboard.nextLine());
    }

    public String getDirectorDvd() {
        System.out.print("Informe o diretor: ");
        return keyboard.nextLine();
    }

    public String getArtistCd() {
        System.out.print("Informe o artista: ");
        return keyboard.nextLine();
    }

    public int getTracksCd() {
        System.out.print("Informe a quantidade de faixas: ");
        return Integer.parseInt(keyboard.nextLine());
    }

    public String getStudioGame() {
        System.out.print("Informe o estúdio: ");
        return keyboard.nextLine();
    }

    public String getPlatformVideoGame() {
        System.out.print("Informe a plataforma: ");
        return keyboard.nextLine();
    }

    public int getNumberOfPlayersGame() {
        System.out.print("Informe o número de jogadores: ");
        return Integer.parseInt(keyboard.nextLine());
    }

    public void showRegisteredDvd() {
        System.out.print("\nDVD cadastrado com sucesso!");
    }

    public void showRegisteredCd() {
        System.out.print("\nCD cadastrado com sucesso!");
    }

    public void showRegisteredVideoGame() {
        System.out.print("\nVideo Game cadastrado com sucesso!");
    }

    public void showRegisteredBoardCame() {
        System.out.print("\nJogo de tabuleiro cadastrado com sucesso!");
    }

    public void showMedia(MediaItem item) {
        System.out.print(item.toString());
    }

    public boolean getFilterType() {
        System.out.print("\nDeseja filtrar por tipo de mídia?\n1) Sim\n2) Não\nEscolha: ");
        int choice = Integer.parseInt(keyboard.nextLine());
        return choice == 1;
    }

    public boolean getFilterTitle() {
        System.out.print("\nDeseja filtrar pelo título da mídia?\n1) Sim\n2) Não\nEscolha: ");
        int choice = Integer.parseInt(keyboard.nextLine());
        return choice == 1;
    }

    public void showErrorFilter() {
        System.out.print("\nÉ necessário ao menos um parâmetro de busca! Você será redirecionado ao menu novamente!");
    }

    public String getTitleEditComment() {
        System.out.print("\nInforme o título da mídia que deseja alterar o comentário (lembre de colocar o título de maneira idêntica): ");
        return keyboard.nextLine();
    }

    public String getCommentEdit() {
        System.out.print("Informe o novo comentário: ");
        return keyboard.nextLine();
    }

    public void showChangeComment() {
        System.out.print("\nComentário editado com sucesso!");
    }

    public void showErrorChangeComment() {
        System.out.print("\nMídia não encontrada, não foi possível editar o comentário!");
    }

    public String getTitleEditFlag() {
        System.out.print("\nInforme o título da mídia que deseja marcar como adquirida (lembre de colocar o título de maneira idêntica): ");
        return keyboard.nextLine();
    }

    public void showChangeFlag() {
        System.out.print("\nMídia marcada como adquirida com sucesso!");
    }

    public void showErrorChangeFlag() {
        System.out.print("\nMídia não encontrada, não foi possível marcar como adquirida!");
    }

    public void showError() {
        System.out.print("\nOps... Um erro inesperado aconteceu, por segurança iremos encerrar a aplicação.\n");
    }
}