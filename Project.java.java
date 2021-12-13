
import java.text.DecimalFormat;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        int metros40x20, quant40x20, tamTub, metros40x10,quant40x10, metros30x30, quant30x30, metros20x20, quant20x20;
        tamTub = 6;
        Scanner ler = new Scanner(System.in);
        System.out.println("SEJA BEM VINDO AO SISTEMA UNIÃO INOX");
        double tubos,quantPux30,quantPux40,quantPux50,quantPux60,quantPux70,quantPux80,quantPux100,quantPux120,quantPux150;
        double resultadoPux150 ,resultadoPux120, resultadoPux100, resultadoPux80,resultadoPux70,resultadoPux60,resultadoPux50,resultadoPux40,resultadoPux30,resultadoPuxTotal;

        System.out.println("MENU: \n" +

                "1 - TUBOS 40X10\n" +
                "2 - TUBOS 40X20\n" +
                "3 - TUBOS 30X30\n" +
                "4 - TUBOS 20X20\n" +
                "5 - TUBO 1' \n" +
                "6 - TUBOS 1' 1/4\n" +
                "7 - PIVO\n" +
                "8 - ARMADOR BATOM INOX\n" +
                "9 - RELATORIO\n" +
                "0 - SAIR");

        tubos = ler.nextInt();

    while (tubos >= 1 ){

        if (tubos == 1){

            System.out.println("Informe quantos metros foi comprado? ");

            metros40x10 = ler.nextInt();

            quant40x10 = metros40x10 / tamTub;

            System.out.println("Quantidade de Tubos 40x10 que Chegou: " + quant40x10);


            System.out.println("Adicione a quantidade de px 40x10 - 150cm");
            quantPux150 = ler.nextInt();
            resultadoPux150 = ((quantPux150 * 1.45 ) * 2 )/6;

           System.out.println("Adicione a quantidade de px 40x10 - 120cm");
           quantPux120 = ler.nextInt();
            resultadoPux120 = (( quantPux120 * 1.15 ) * 2) / 6 ;

            System.out.println("Adicione a quantidade de px 40x10 - 100cm");
            quantPux100 = ler.nextInt();
            resultadoPux100 = ((quantPux100 * 0.95 ) * 2)/6;

            System.out.println("Adicione a quantidade de px 40x10 - 80cm");
            quantPux80 = ler.nextInt();
            resultadoPux80 = ((quantPux80 * 0.75 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x10 - 70cm");
            quantPux70 = ler.nextInt();
            resultadoPux70 = ((quantPux70 * 0.65 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x10 - 60cm");
            quantPux60 = ler.nextInt();
            resultadoPux60 = ((quantPux60 * 0.55 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x10 - 50cm");
            quantPux50 = ler.nextInt();
            resultadoPux50 = ((quantPux50 * 0.45 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x10 - 40cm");
            quantPux40 = ler.nextInt();
            resultadoPux40 = ((quantPux40 * 0.35 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x10 - 30cm");
            quantPux30 = ler.nextInt();
            resultadoPux30 = ((quantPux30 * 0.25 ) * 2 )/6;


            resultadoPuxTotal = resultadoPux30+ resultadoPux40+ resultadoPux50 + resultadoPux60+ resultadoPux70+ resultadoPux80 + resultadoPux100 + resultadoPux150;
            System.out.println("Quantidade de tubos usado é: " + resultadoPuxTotal);

            resultadoPuxTotal = quant40x10 - resultadoPuxTotal;

            System.out.println("Resta em quantidade de tubos 40x10: " +  resultadoPuxTotal + " unidades" );

            System.out.println("MENU: \n" +

                    "1 - TUBOS 40X10\n" +
                    "2 - TUBOS 40X20\n" +
                    "3 - TUBOS 30X30\n" +
                    "4 - TUBOS 20X20\n" +
                    "5 - TUBO 1' \n" +
                    "6 - TUBOS 1' 1/4\n" +
                    "7 - PIVO\n" +
                    "8 - ARMADOR BATOM INOX\n" +
                    "9 - RELATORIO\n" +
                    "0 - SAIR");

            tubos = ler.nextInt();
        }

        else if ( tubos == 2){
            System.out.println("Informe quantos metros foi comprado? ");

            metros40x20 = ler.nextInt();

            quant40x20 = metros40x20 / tamTub;

            System.out.println("Quantidade de Tubos 40x20 que Chegou: " + quant40x20);

            System.out.println("Adicione a quantidade de px 40x20 - 150cm");
            quantPux150 = ler.nextInt();
            resultadoPux150 = ((quantPux150 * 1.5 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x20 - 120cm");
            quantPux120 = ler.nextInt();
            resultadoPux120 = (( quantPux120 * 1.2 ) * 2) / 6 ;

            System.out.println("Adicione a quantidade de px 40x20 - 100cm");
            quantPux100 = ler.nextInt();
            resultadoPux100 = ((quantPux100 * 1.0 ) * 2)/6;

            System.out.println("Adicione a quantidade de px 40x20 - 80cm");
            quantPux80 = ler.nextInt();
            resultadoPux80 = ((quantPux80 * 0.8 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x20 - 70cm");
            quantPux70 = ler.nextInt();
            resultadoPux70 = ((quantPux70 * 0.7 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x20 - 60cm");
            quantPux60 = ler.nextInt();
            resultadoPux60 = ((quantPux60 * 0.6 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x20 - 50cm");
            quantPux50 = ler.nextInt();
            resultadoPux50 = ((quantPux50 * 0.5 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x20 - 40cm");
            quantPux40 = ler.nextInt();
            resultadoPux40 = ((quantPux40 * 0.4 ) * 2 )/6;

            System.out.println("Adicione a quantidade de px 40x20 - 30cm");
            quantPux30 = ler.nextInt();
            resultadoPux30 = ((quantPux30 * 0.3 ) * 2 )/6;


            resultadoPuxTotal = resultadoPux30+ resultadoPux40+ resultadoPux50 + resultadoPux60+ resultadoPux70+ resultadoPux80 + resultadoPux100 + resultadoPux150;
            System.out.println("Quantidade de tubos usado é: " + resultadoPuxTotal);

            resultadoPuxTotal = quant40x20 - resultadoPuxTotal;

            System.out.println("Resta em quantidade de tubos 40x20: " +  resultadoPuxTotal + " unidades" );
            System.out.println("########## BEM VINDO AO SISTEMA UNIÃO INOX ##########");
            System.out.println("MENU: \n" +

                    "1 - TUBOS 40X10\n" +
                    "2 - TUBOS 40X20\n" +
                    "3 - TUBOS 30X30\n" +
                    "4 - TUBOS 20X20\n" +
                    "5 - TUBO 1' \n" +
                    "6 - TUBOS 1' 1/4\n" +
                    "7 - PIVO\n" +
                    "8 - ARMADOR BATOM INOX\n" +
                    "9 - RELATORIO\n" +
                    "0 - SAIR");

            tubos = ler.nextInt();
        }

        else if(tubos == 3){
            System.out.println("Informe quantos metros foi comprado? ");

            metros30x30 = ler.nextInt();

            quant30x30 = metros30x30 / tamTub;

            System.out.println("Quantidade de Tubos 30X30 que Chegou: " + quant30x30);

            System.out.println("Adicione a quantidade de px 30x30 - 150cm");
            quantPux150 = ler.nextInt();
            resultadoPux150 = ((quantPux150 * 1.5 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux150 + " tubos 30x30" );

            System.out.println("Adicione a quantidade de px 30x30 - 120cm");
            quantPux120 = ler.nextInt();
            resultadoPux120 = (( quantPux120 * 1.2 ) * 2)/6;
            System.out.println("Vai precisar de " + resultadoPux120 + " tubos 30x30" );

            System.out.println("Adicione a quantidade de px 30x30 - 100cm");
            quantPux100 = ler.nextInt();
            resultadoPux100 = ((quantPux100 * 1.0 ) * 2)/6;
            System.out.println("Vai precisar de " + resultadoPux100 + " tubos 30x30"  );

            System.out.println("Adicione a quantidade de px 30x30 - 80cm");
            quantPux80 = ler.nextInt();
            resultadoPux80 = ((quantPux80 * 0.8 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux80 + " tubos 30x30" );

            System.out.println("Adicione a quantidade de px 30x30 - 70cm");
            quantPux70 = ler.nextInt();
            resultadoPux70 = ((quantPux70 * 0.7 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux70 + " tubos 30x30" );

            System.out.println("Adicione a quantidade de px 30x30 - 60cm");
            quantPux60 = ler.nextInt();
            resultadoPux60 = ((quantPux60 * 0.6 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux60 + " tubos 30x30");

            System.out.println("Adicione a quantidade de px 30x30 - 50cm");
            quantPux50 = ler.nextInt();
            resultadoPux50 = ((quantPux50 * 0.5 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux50 + " tubos 30x30");

            System.out.println("Adicione a quantidade de px 30x30 - 40cm");
            quantPux40 = ler.nextInt();
            resultadoPux40 = ((quantPux40 * 0.4 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux40 + " tubos 30x30");

            System.out.println("Adicione a quantidade de px 30x30 - 30cm");
            quantPux30 = ler.nextInt();
            resultadoPux30 = ((quantPux30 * 0.3 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux30 + " tubos 30x30");


            resultadoPuxTotal = resultadoPux30+ resultadoPux40+ resultadoPux50 + resultadoPux60+ resultadoPux70+ resultadoPux80 + resultadoPux100 + resultadoPux120+ resultadoPux150;
            System.out.println("Quantidade de tubos usado é: " + resultadoPuxTotal);

            resultadoPuxTotal = quant30x30 - resultadoPuxTotal;

            System.out.println("Resta em quantidade de tubos 30x30: " +  resultadoPuxTotal + " unidades\n" );


            System.out.println("########## BEM VINDO AO SISTEMA UNIÃO INOX ##########");
            System.out.println("MENU: \n" +

                    "1 - TUBOS 40X10\n" +
                    "2 - TUBOS 40X20\n" +
                    "3 - TUBOS 30X30\n" +
                    "4 - TUBOS 20X20\n" +
                    "5 - TUBO 1' \n" +
                    "6 - TUBOS 1' 1/4\n" +
                    "7 - PIVO\n" +
                    "8 - ARMADOR BATOM INOX\n" +
                    "9 - RELATORIO\n" +
                    "0 - SAIR");

            tubos = ler.nextInt();
        }

        else if(tubos == 4){

            System.out.println("Informe quantos metros foi comprado? ");

            metros20x20 = ler.nextInt();

            quant20x20 = metros20x20 / tamTub;

            System.out.println("Quantidade de Tubos 30X30 que Chegou: " + quant20x20);

            System.out.println("Adicione a quantidade de px 30x30 - 150cm");
            quantPux150 = ler.nextInt();
            resultadoPux150 = ((quantPux150 * 1.5 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux150 + " tubos 30x30" );

            System.out.println("Adicione a quantidade de px 30x30 - 120cm");
            quantPux120 = ler.nextInt();
            resultadoPux120 = (( quantPux120 * 1.2 ) * 2)/6;
            System.out.println("Vai precisar de " + resultadoPux120 + " tubos 30x30" );

            System.out.println("Adicione a quantidade de px 30x30 - 100cm");
            quantPux100 = ler.nextInt();
            resultadoPux100 = ((quantPux100 * 1.0 ) * 2)/6;
            System.out.println("Vai precisar de " + resultadoPux100 + " tubos 30x30"  );

            System.out.println("Adicione a quantidade de px 30x30 - 80cm");
            quantPux80 = ler.nextInt();
            resultadoPux80 = ((quantPux80 * 0.8 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux80 + " tubos 30x30" );

            System.out.println("Adicione a quantidade de px 30x30 - 70cm");
            quantPux70 = ler.nextInt();
            resultadoPux70 = ((quantPux70 * 0.7 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux70 + " tubos 30x30" );

            System.out.println("Adicione a quantidade de px 30x30 - 60cm");
            quantPux60 = ler.nextInt();
            resultadoPux60 = ((quantPux60 * 0.6 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux60 + " tubos 30x30");

            System.out.println("Adicione a quantidade de px 30x30 - 50cm");
            quantPux50 = ler.nextInt();
            resultadoPux50 = ((quantPux50 * 0.5 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux50 + " tubos 30x30");

            System.out.println("Adicione a quantidade de px 30x30 - 40cm");
            quantPux40 = ler.nextInt();
            resultadoPux40 = ((quantPux40 * 0.4 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux40 + " tubos 30x30");

            System.out.println("Adicione a quantidade de px 30x30 - 30cm");
            quantPux30 = ler.nextInt();
            resultadoPux30 = ((quantPux30 * 0.3 ) * 2 )/6;
            System.out.println("Vai precisar de " + resultadoPux30 + " tubos 30x30");


            resultadoPuxTotal = resultadoPux30+ resultadoPux40+ resultadoPux50 + resultadoPux60+ resultadoPux70+ resultadoPux80 + resultadoPux100 + resultadoPux120+ resultadoPux150;
            System.out.println("Quantidade de tubos usado é: " + resultadoPuxTotal);

            resultadoPuxTotal = quant20x20 - resultadoPuxTotal;

            System.out.println("Resta em quantidade de tubos 30x30: " +  resultadoPuxTotal + " unidades\n" );


            System.out.println("########## BEM VINDO AO SISTEMA UNIÃO INOX ##########");
            System.out.println("MENU: \n" +

                    "1 - TUBOS 40X10\n" +
                    "2 - TUBOS 40X20\n" +
                    "3 - TUBOS 30X30\n" +
                    "4 - TUBOS 20X20\n" +
                    "5 - TUBO 1' \n" +
                    "6 - TUBOS 1' 1/4\n" +
                    "7 - PIVO\n" +
                    "8 - ARMADOR BATOM INOX\n" +
                    "9 - RELATORIO\n" +
                    "0 - SAIR");

            tubos = ler.nextInt();

        }

        else if(tubos == 7){
            double resultadoTotalPivoTresOitav, pivo150, pivo250, pivo350,pivoBergue,miniPivo;


            double barraTresOitav150 = 0.05;
            double barraTresOitav250 = 0.05;
            double barraTresOitavBergue = 0.05;

            double canoMeiaUmCinco150 = 0.05;
            double canoMeiaUmCinco250 = 0.05;
            double canoMeiaUmCincoBergue = 0.05;

            double paraf150 = 8;
            double paraf250 = 8;
            double paraf350 = 8;
            double parafBergue = 4;
            double parafMiniPivo = 8;

            double barraMeia350 = 0.05;
            double canoCincoOitav350 = 0.05;

            double barraTresOivtavMini = 0.045;



            DecimalFormat formatador = new DecimalFormat("0.00");

            System.out.println("Informe quantos pivo 150kg ");
            pivo150 = ler.nextDouble();

            barraTresOitav150 = pivo150 * barraTresOitav150 / 6;

            System.out.println("Quantidade de barra redonda 3/8: " + formatador.format(barraTresOitav150));

            canoMeiaUmCinco150 = pivo150 * canoMeiaUmCinco150 /6;

            System.out.println("Quantidade de Cano 1/2 ( 1.5): " + formatador.format(canoMeiaUmCinco150));

            paraf150 = pivo150 * paraf150;

            System.out.println("Quantidade de Parafusos 4.8x50 inox e Buchas 0.8: " + paraf150);









            System.out.println("Informe quantos pivo 250kg ");
            pivo250 = ler.nextDouble();

            barraTresOitav250 = pivo250 * barraTresOitav250 / 6;

            System.out.println("Quantidade de barra 3/8: " + formatador.format(barraTresOitav250));

            canoMeiaUmCinco250 = pivo250 * canoMeiaUmCinco250 /6;

            System.out.println("Quantidade de Cano 1/2 ( 1.5): " + formatador.format(canoMeiaUmCinco250));

            paraf250 = pivo250 * paraf250;

            System.out.println("Quantidade de Parafusos 4.8x50 inox e Buchas 0.8: " + paraf250);




            System.out.println("Informe quantos pivo Bergue ");
            pivoBergue = ler.nextDouble();

            barraTresOitavBergue = pivoBergue * barraTresOitavBergue / 6;

            System.out.println("Quantidade de barra 3/8: " +  formatador.format(barraTresOitavBergue));

            canoMeiaUmCincoBergue = pivoBergue * canoMeiaUmCincoBergue /6;

            System.out.println("Quantidade de Cano 1/2 ( 1.5): " + formatador.format(canoMeiaUmCincoBergue));


            parafBergue = pivoBergue * parafBergue;

            System.out.println("Quantidade de Parafusos 4.8x50 inox e Buchas 0.8: " + parafBergue);







            System.out.println("Informe quantos pivo 350kg ");
            pivo350 = ler.nextDouble();

            barraMeia350 = pivo350 * barraMeia350 / 6;

            System.out.println("Quantidade de barra redonda 1/2: " + formatador.format(barraMeia350));

            canoCincoOitav350 = pivo350 * canoCincoOitav350 /6;

            System.out.println("Quantidade de Cano 5/8 (1.5) : " + formatador.format(canoCincoOitav350));


            paraf350 = pivo350 * paraf350;

            System.out.println("Quantidade de Parafusos 4.8x50 inox e Buchas 0.8: " + paraf350);







            System.out.println("Informe quantos mini pivo ");
            miniPivo = ler.nextDouble();

            barraTresOivtavMini = miniPivo * barraTresOivtavMini / 6;

            System.out.println("Quantidade de barra Redonda 3/8: " + formatador.format(barraTresOivtavMini) );

            parafMiniPivo = miniPivo * parafMiniPivo;

            System.out.println("Quantidade de Parafusos 3.2x30 inox e Buchas 0.5: " + parafMiniPivo);



            resultadoTotalPivoTresOitav = barraTresOitav150 + barraTresOitav250 + barraTresOitavBergue + barraTresOivtavMini;

            System.out.println("Quantidade Total Barra Redonda 3/8: " + formatador.format(resultadoTotalPivoTresOitav));

            double resultadoTotalCanoMeia = canoMeiaUmCinco250 + canoMeiaUmCinco150 + canoMeiaUmCincoBergue;

            System.out.println("Quantidade Total Cano 1/2 (1.5): " + formatador.format(resultadoTotalCanoMeia));


            System.out.println("Quantidade de Barra Redonoda 1/2: " + formatador.format(barraMeia350));

            System.out.println("Quantidade de Cano 5/8 (1.5): " +formatador.format(canoCincoOitav350) );

            System.out.println("Quantidade Total de Parafusos 4.8x50 e Bucha 0.8: " + formatador.format(paraf150 + paraf250 + paraf350 + parafBergue));

            System.out.println("Quantidade Total de Parafusos 3.2x30 e Bucha 0.5: " + formatador.format(parafMiniPivo));


            System.out.println("MENU: \n" +

                    "1 - TUBOS 40X10\n" +
                    "2 - TUBOS 40X20\n" +
                    "3 - TUBOS 30X30\n" +
                    "4 - TUBOS 20X20\n" +
                    "5 - TUBO 1' \n" +
                    "6 - TUBOS 1' 1/4\n" +
                    "7 - PIVO\n" +
                    "8 - ARMADOR BATOM INOX\n" +
                    "9 - RELATORIO\n" +
                    "0 - SAIR");

            tubos = ler.nextInt();

        }

        else if(tubos == 8){
            double canoRegulagem, batomInox, barraRegulagem, Gancho,SeguraRegulagem, PontSetOitInterna, chumbador;
            DecimalFormat formatador = new DecimalFormat("0.00");

            System.out.println("Informe quantos armadores batom inox");
            double quantArmadorB = ler.nextInt();
            Gancho = 0.16;
            canoRegulagem = 0.07;
            batomInox = 0.05;
            barraRegulagem = 0.02;
            SeguraRegulagem = 0.03;
            chumbador = 0.05;

            canoRegulagem = (quantArmadorB * 2 * canoRegulagem / 6);

            System.out.println("Quantidades de Tubos 7/8 Regulagem: " + formatador.format(canoRegulagem));


            Gancho = ( quantArmadorB * Gancho * 2 ) / 6;

            System.out.println("Quantidade de Tubos 5/16 Ganchos (S) : " + formatador.format(Gancho));


            batomInox = (quantArmadorB * 2 * batomInox / 6);

            System.out.println("Quantidade de Tubos 3/4 Batom: " + formatador.format(batomInox));


            SeguraRegulagem = (quantArmadorB * 2 * SeguraRegulagem / 6);

            System.out.println("Quantidade de Tubos 1': " + formatador.format(SeguraRegulagem));


            barraRegulagem = (quantArmadorB * 2 * barraRegulagem / 6);

            System.out.println("Quantidade de Tubos 1/4: " + formatador.format(barraRegulagem) );

            chumbador = (quantArmadorB * 4 * chumbador / 6 );
            System.out.println("Quantidade de Tubos 3/16: " + formatador.format(chumbador)  );

            System.out.println("########## BEM VINDO AO SISTEMA UNIÃO INOX ##########");
            System.out.println("MENU: \n" +

                    "1 - TUBOS 40X10\n" +
                    "2 - TUBOS 40X20\n" +
                    "3 - TUBOS 30X30\n" +
                    "4 - TUBOS 20X20\n" +
                    "5 - TUBO 1' \n" +
                    "6 - TUBOS 1' 1/4\n" +
                    "7 - PIVO\n" +
                    "8 - ARMADOR BATOM INOX\n" +
                    "9 - RELATORIO\n" +
                    "0 - SAIR");

            tubos = ler.nextInt();



        }
    }





    }
}
