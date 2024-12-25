public class DemoCidade {

    public static void main(String args[]){
        Estado rs = new Estado("RS","Rio Grande do Sul");
        Cidade bento = new Cidade(1,"Bento Gocalves", rs);
        
        Cidade saopaulo = new Cidade(2,"Sao Paulo", "SP", "Sao Paulo");
        
        System.out.println(bento);
        System.out.println(saopaulo);
    }
}
