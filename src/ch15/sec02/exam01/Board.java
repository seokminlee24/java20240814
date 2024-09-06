package ch15.sec02.exam01;

public class Board {
    private String subject;
    private String Content;
    private String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        Content = content;
        this.writer = writer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
