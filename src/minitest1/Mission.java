package minitest1;

public class Mission {
    public static void main(String[] args) {
        ProgrammingBook cs1 = new ProgrammingBook(111, "code", 80, "batran", "java", "codegym");
        ProgrammingBook cs2 = new ProgrammingBook(222, "it", 90, "bon", "java", "cod");
        ProgrammingBook cs3 = new ProgrammingBook(333, "vietnam", 100, "nam", "vietnam", "co");
        ProgrammingBook cs4 = new ProgrammingBook(444, "ba", 120, "sau", "a rap", "khong biet");
        ProgrammingBook cs5 = new ProgrammingBook(555, "tran", 60, "bay", "anh", "khong biet not");

        FictionBook cs6 = new FictionBook(666, "anh", 50, "anhba", "vien tuong 1");
        FictionBook cs7 = new FictionBook(777, "chin", 140, "anh", "ngontinh");
        FictionBook cs8 = new FictionBook(888, "tam", 120, "anhba", "kinhdi");
        FictionBook cs9 = new FictionBook(999, "muoi", 110, "yolo", "vien tuong 1");
        FictionBook cs10 = new FictionBook(10, "bon", 80, "aaaa", "sieunhan");

        double[] sumPrice = {cs1.getPrice(), cs2.getPrice(), cs3.getPrice(), cs4.getPrice(), cs5.getPrice(), cs6.getPrice(), cs7.getPrice(), cs8.getPrice(), cs9.getPrice(), cs10.getPrice()};
        double tongTien = 0;
        for (int i = 0; i < sumPrice.length; i++) {
            tongTien += sumPrice[i];
        }
        System.out.println("tong cua 10 cuon sach la: " + tongTien);

        String[] checkBook = {cs1.getLanguage(), cs2.getLanguage(), cs3.getLanguage(), cs4.getLanguage(), cs5.getLanguage()};
        int count = 0;
        for (int i = 0; i < checkBook.length; i++){
            if (checkBook[i].equals("java")){
                count++;
            }
        }
        System.out.println("số sách ProgrammingBook có language là Java: " + count);

        String[] checkCategory = {cs6.getCategory(), cs7.getCategory(), cs8.getCategory(), cs9.getCategory(), cs10.getCategory()};
        int count1 = 0;
        for (int i = 0; i < checkCategory.length; i++) {
            if (checkCategory[i].equals("vien tuong 1")){
                count1++;
            }
        }
        System.out.println("số sách Fiction có category là Viễn tưởng 1 la: " + count1);

        double[] checkPrice = {cs6.getPrice(), cs7.getPrice(), cs8.getPrice(), cs9.getPrice(), cs10.getPrice()};
        int count2 = 0;
        for (int i = 0; i < checkPrice.length; i++) {
            if (checkPrice[i] < 100) {
                count2++;
            }
        }
        System.out.println("số sách Fiction có giá < 100 la: " + count2);
    }
}
