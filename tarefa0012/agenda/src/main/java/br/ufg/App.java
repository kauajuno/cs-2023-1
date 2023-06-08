package br.ufg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Agenda a = new Agenda();
        a.addContato("Kauã", "kauajuno@gmail.com");
        a.addContato("Murilo", "murilo02@gmail.com");
        a.addContato("Mesquita", "mmmmmmm033333@gmail.com");
        a.addContato("Karlla", "loane@gmail.com");
        a.addContato("Gabriel", "greis@gmail.com");

        try{
            a.removeContato("Gilmar");
        }catch(Exception e){
            System.out.println("Contato não encontrado");
        }

        try{
            a.removeContato("Karlla");
        }catch(Exception e){
            System.out.println("Contato não encontrado");
        }

        a.addContato("João", "jjjjjjj@outlook.com");

        a.printContatos();

        System.out.println("Pesquisa por nome:\n" + a.getContato("nome", "João")); 
        System.out.println("Pesquisa por email:\n" + a.getContato("email", "kauajuno@gmail.com"));

    }
}
