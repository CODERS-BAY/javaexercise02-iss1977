import java.io.*;

public class LogicOperatoren {

    private static boolean implication(boolean p, boolean q){
        boolean answer;
        //answer = (p && !q) || (!p==!q) || ( p&&q);
        answer = !(p && !q) ;

        return answer;
    }
    public static void main(String[] args) {

        //declarieren
        boolean A,B,C;
        //initialisieren

        A=true;
        B=true;
        C=true;

        System.out.println("------------------------------");
        System.out.println("A:"+A);
        System.out.println("B:"+B);
        System.out.println("C:"+C);
        System.out.println("------------------------------");
        System.out.println("(A && B) || C:"+( (A && B) || C ));
        System.out.println("(!(A && B)) || C:"+( (!(A && B)) || C ));
        System.out.println("(A && B) || C:"+(  !(A || B || C) ));
        System.out.println("(A && B) || C:"+( !((A && B) || (B && C)) ));
        System.out.println("(A && B) || C:"+( !(A ^ B) ));
        System.out.println("------------------------------");
        PrintStream stream  = new PrintStream(System.out);

        stream.print("p="+true+", q="+false + " ; p=>q : ");  stream.println( implication(true,false));
        stream.print("p="+true+", q="+true + " ; p=>q : ");  stream.println( implication(true,true));
        stream.print("p="+false+", q="+true + " ; p=>q : ");  stream.println( implication(false,true));
        stream.print("p="+false+", q="+false + " ; p=>q : ");  stream.println( implication(false,false));


//       System.out.println(true , false ,  implication(true,false));
//        System.out.println(true +  true  +  implication(true,false));
//        System.out.println(false +  true +  implication(true,false));
//        System.out.println(false +  false +  implication(true,false));
//        (A && B) || C
//
//                (!(A && B)) || C
//
//        !(A || B || C)
//
//        !((A && B) || (B && C))
//
//        !(A ^ B)



    }
}
