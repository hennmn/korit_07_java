package ch13_inheritance.books;

import java.text.Format;

// 여기 상속에서 오류 뜨는 거 처리 하려면
// 1. 부모의 필드를 전부다 사용하는 생성자가 생기거나
public class EBook extends Book{
    private double fileSize;
    private String format;

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    // 밑에 AllArgsConstructor로 생성해서 이거 없어도 됨
//    public EBook(String title, String author) {
//        super(title, author);
//    }
    // AllArgsConstructor 없으면 기본 생성자만 있기 때문에 상속 받은 곳에도 따로 안 만들어도 됨
    // 이렇게 되면 부모 클래스 AllArgsConstructo는 무조건 만들어야 함
    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

//    @Override  내가 한 거
//    public void showInfo() {
//        System.out.println("제목 " + this.getTitle());
//        System.out.println("저자 : " + this.getAuthor());
//        System.out.println("파일 크기 : " + fileSize);
//        System.out.println("파일 형식 : " + format);
//    }

    // 오버라이딩 하지 않고 자식 클래스의 고유 메서드로 별개로 만든 경우
    // (이름이 부모 클래스의 메서드와 겹쳐도 관계 x)
    // 강사님이 한 거(이거!!!! 이거!!!
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크기 : " + fileSize + "MB");
        System.out.println("파일 형식 : " + format);
    }
}
