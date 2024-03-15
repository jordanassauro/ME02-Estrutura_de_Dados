//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vetor lista = new Vetor();

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();
        Aluno a10 = new Aluno();
        Aluno a11 = new Aluno();
        Aluno a12 = new Aluno();
        Aluno a13 = new Aluno();
        Aluno a14 = new Aluno();
        Aluno a15 = new Aluno();
        Aluno a16 = new Aluno();
        Aluno a17 = new Aluno();


        a1.setNome("Jordana");
        a2.setNome("Gabriel");
        a3.setNome("Daniel");
        a4.setNome("Ivo");
        a5.setNome("Mônica");
        a6.setNome("Cebolinha");
        a7.setNome("Magali");
        a8.setNome("Cascão");
        a9.setNome("Carmen");
        a10.setNome("Denise");
        a11.setNome("Milena");
        a12.setNome("Titi");
        a13.setNome("Marina");
        a14.setNome("Franjinha");
        a15.setNome("Jeremias");
        a16.setNome("Astronauta");
        a17.setNome("Chico Bento");


        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);
        lista.Adiciona(a8);
        lista.Adiciona(a9);
        lista.Adiciona(a10);
        lista.Adiciona(a11);
        lista.Adiciona(a12);
        lista.Adiciona(a13);
        lista.Adiciona(a14);
        lista.Adiciona(a15);


        System.out.println("Total de alunos: " +lista.getTotalDealunos());

        System.out.println(lista.contem(a7));

        System.out.println(lista.pega(0));

        System.out.println("Lista dos alunos: " +lista);

        lista.remove(11);
        System.out.println(lista);

        lista.adicionaPosicao(11, a16);
        System.out.println(lista);

        lista.remove(8);
        System.out.println(lista);

        lista.adicionaPosicao(8, a17);
        System.out.println(lista);


    }
}