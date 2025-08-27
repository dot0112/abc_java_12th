package d250814;

import java.util.Calendar;

public class StringTest3 {
    public static void main(String[] args) {
        Calendar c = null;

        try {
            for (int i = 0; i < 1; i++) {
                c = Calendar.getInstance();

                System.out.printf("%d-%02d-%02d\t%02d:%02d:%02d.%03d\n",
                        c.get(Calendar.YEAR),
                        c.get(Calendar.MONTH) + 1,
                        c.get(Calendar.DATE),
                        c.get(Calendar.HOUR_OF_DAY),
                        c.get(Calendar.MINUTE),
                        c.get(Calendar.SECOND),
                        c.get(Calendar.MILLISECOND)
                );

                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        String filename = "이력서_홍길동.250814.docx";
        parseFileType(filename);

        String phone = "010-1111-2222";
        String[] ps = phone.split("-");
        System.out.println(ps[0] + '.' + ps[1] + '.' + ps[2]);
    }

    static void parseFileType(String filename) {
        try {
            String fileType = filename.substring(filename.lastIndexOf('.'));
            System.out.printf("확장자는 %s 입니다.\n", fileType);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("확장자는 없습니다.\n");
        }
    }
}
