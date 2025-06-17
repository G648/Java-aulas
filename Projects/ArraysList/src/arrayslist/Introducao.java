package arrayslist;

public class Introducao {
    public static void main(String[] args) {
        int[] idade = new int[6];  //array static 

        // 22  - 0
        // 19  - 1
        // 90  - 2
        // 87  - 3
        // 14  - 4
        
        //C -> Create
        idade[0] = 18;
        idade[1] = 16;
        idade[2] = 20;
        idade[3] = 29;
        idade[4] = 36;
        idade[5] = 92;
        
//        System.out.println(idade.length);


        //R - Read ??????
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Posicao " + i + ": " + idade[i]);
        }
        
        //U - Update ????
        idade[2] = 76;
        idade[0] = 12;
        
         for (int i = 0; i < idade.length; i++) {
            System.out.println("Posicao atualizada " + i + ": " + idade[i]);
        }
         
        //D - Delete
        idade[1] = 0;
        
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Posicao atualizada " + i + ": " + idade[i]);
        }
    }
}
