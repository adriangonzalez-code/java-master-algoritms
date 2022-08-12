package com.jokercode.algoritms.formateo;

import java.util.StringTokenizer;

public class TextoFormatter {

    public static void main(String[] args) {
        String str = "Donec mollis blandit deterruisset delenit id delenit consectetuer. Pro errem pretium cursus ei maximus sumo impetus deseruisse porttitor. Ut repudiandae class tritani gravida eirmod mus. Similique assueverit nibh cras instructior numquam adipiscing lacinia augue lacinia. Ea omittam purus adversarium porttitor volumus ullamcorper ponderum. Scripta te disputationi volutpat magna dis autem definiebas. Reprimique vel vivendo lobortis cras. Platea facilis persequeris dolorum persecuti facilisis sagittis dolorum decore elit. Delectus placerat omnesque erat detracto equidem fugit. Tale eleifend himenaeos mazim mel accumsan. At epicurei pretium eloquentiam lectus delenit tempus moderatius tale solum. Nisl invenire sumo corrumpit dicit erroribus. Debet atomorum putent tacimates mei eirmod adhuc. Moderatius nascetur theophrastus comprehensam habitasse conceptam mnesarchum volumus. Sapien solet detraxit numquam his ad tota dolore eruditi. Facilisi vivamus habitant ei venenatis porttitor causae prodesset persecuti quo. Sadipscing vehicula nascetur usu conclusionemque populo pretium dui quam. Constituam referrentur facilis movet diam congue mel efficiantur. Hendrerit necessitatibus malorum veniam volumus an menandri erat praesent. Donec noster delenit fermentum labores possim platonem netus.";

        int lineWidth = 90;
        System.out.println();

        for (int i = 0; i < lineWidth; i++) {
            if (((i + 1) % 10) == 0) {
                System.out.print(((i/10) + 1) % 10);
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = 0; i < lineWidth; i++) {
            System.out.print((i + 1) % 10);
        }

        System.out.println();

        for (int i = 0; i < lineWidth; i++) {
            System.out.print("-");
        }

        System.out.println();

        boolean space = false;
        int curPos = 0;
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            String s = st.nextToken();

            if ((curPos + s.length()) > lineWidth) {
                System.out.println();
                curPos = 0;
                space = false;
            }

            if (space) {
                System.out.print(" ");
            }

            System.out.print(s);
            curPos += s.length() + 1;
            space = true;
        }

        System.out.println();
    }
}